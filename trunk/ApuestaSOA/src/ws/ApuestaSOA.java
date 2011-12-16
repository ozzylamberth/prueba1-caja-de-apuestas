package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.google.gson.Gson;

import SOAPVO.ApuestaSOAPVO;
import SOAPVO.RegCaballoSOAPVO;

import orm.Tap_apuesta;
import orm.Tap_regcaballo;

public class ApuestaSOA {

	/**
	 * Ingresa una nueva apuesta a los registros Si alguna variable es nula
	 * retorna 0, si algun registro no es encontrado retorna 1, si ocurre una
	 * excepcion retorna 2 y si es exitoso reorna 3
	 * 
	 * @param monto
	 * @param idCaballo
	 * @param idCarrera
	 * @param idCaja
	 * @return respuesta
	 */
	public String add(int monto, int idCaballo, int idCarrera, int idCaja) {
		String resultado = "";
		PersistentTransaction t;
		// valida que los campos no vengan vacios.
		if ((monto == 0) || (idCaballo == 0) || (idCarrera == 0)
				|| (idCaja == 0)) {
			resultado = "0";
		}// si los datos vienen vacios, devuelve un 0
			// si los datos no vienen vacios.
		else {
			try {
				t = orm.ApuestaPersistentManager.instance().getSession()
						.beginTransaction();
				// Instancia factory
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				// Instancia DAO
				/*
				 * crea nueva apuesta
				 */
				orm.dao.Tap_apuestaDAO lormTap_apuestaDAO = lDAOFactory
						.getTap_apuestaDAO();
				// Instancia objeto orm (vo)
				orm.Tap_apuesta lormTap_apuesta = lormTap_apuestaDAO
						.createTap_apuesta();
				// Busca el caballo con esa id
				orm.Tap_regcaballo[] ormRegCarreras;
				ormRegCarreras = lDAOFactory.getTap_regcaballoDAO()
						.listTap_regcaballoByQuery(
								"tap_caballocab_id='" + idCaballo + "'", null);

				int id = 0;
				// si el caballo no es nulo
				if (ormRegCarreras.length > 0) {
					// obtiene los ids de los registros de caballo y carrera
					// correspondientes a la apuesta
					for (int i = 0; i < ormRegCarreras.length; i++) {
						if (ormRegCarreras[i].getTap_carreracar().getCar_id() == idCarrera) {
							id = ormRegCarreras[i].getRc_id();
						}
					}
				}
				// Obtiene el registro del caballo respescto a el id del caballo
				// y el id de la carrera
				orm.dao.Tap_regcaballoDAO oRMTap_regCaballoDAO = lDAOFactory
						.getTap_regcaballoDAO();
				orm.Tap_regcaballo oRMTan_regCaballo = oRMTap_regCaballoDAO
						.loadTap_regcaballoByQuery("rc_id='" + id + "'", null);
				// Obtiene la caja correspondiente
				orm.dao.Tap_cajaDAO oRMTap_cajaDAO = lDAOFactory
						.getTap_cajaDAO();
				orm.Tap_caja oRMTap_caja = oRMTap_cajaDAO.loadTap_cajaByQuery(
						"caj_id='" + idCaja + "'", null);
				// Valida que los objetos encontrados no sean nulos
				if (oRMTap_caja == null || oRMTap_caja == null) {
					resultado = "1";
				} else {// Si no son nulos, los agrega
					Date fCreacion = new Date();
					lormTap_apuesta.setApu_fecha(fCreacion);
					lormTap_apuesta.setApu_monto(monto);
					lormTap_apuesta.setTap_cajacaj(oRMTap_caja);
					lormTap_apuesta.setTap_regcarrcabrcc(oRMTan_regCaballo);
					lormTap_apuestaDAO.save(lormTap_apuesta);

					t.commit();
					resultado = "3";
				}
			} catch (PersistentException e1) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				resultado = "2";
				e1.printStackTrace();
			}
		}
		return resultado;
	}

	/**
	 * Obtiene el montoAPagar por la caja para el apostador, dependiendo del
	 * monto apostado, del caballo al cual le aposto y la carrera
	 * 
	 * @param idCarrera
	 * @param idCaballo
	 * @param monto
	 * @return montoAPagar
	 */
	public String montoAPagar(int idCarrera, int idCaballo, int monto) {
		float montoAPagar = 0;
		float porciento = (float) 1 / 10;
		float totalCarrera = this.montoByCarrera(idCarrera);
		float totalCaballo = this.montoByCaballo(idCaballo, idCarrera);
		montoAPagar = ((totalCarrera - totalCarrera * porciento) / totalCaballo)
				* monto;
		return String.valueOf(montoAPagar);
	}

	/**
	 * Obtiene el monto total apostado por una carrera
	 * Si no encuentra registros retorna un -2
	 * @param idCarrera
	 * @return monto
	 */
	public int montoByCarrera(int idCarrera) {
		int monto = 0;
		int[] ids;
		if ((idCarrera > 0)) {
			try {
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				orm.Tap_regcaballo[] ormRegCarreras;
				// Busca todas las carreras por el id
				ormRegCarreras = lDAOFactory.getTap_regcaballoDAO()
						.listTap_regcaballoByQuery(
								"tap_carreracar_id='" + idCarrera + "'", null);
				// Si encuentra carreras
				if (ormRegCarreras.length > 0) {
					// obtiene el id de los registros de carrera
					// correspondientes a la apuesta
					ids = new int[ormRegCarreras.length];
					for (int i = 0; i < ormRegCarreras.length; i++) {
						ids[i] = ormRegCarreras[i].getRc_id();
					}
					// Busca en la apuesta el registro correspondiente
					if (ids.length > 0) {
						orm.Tap_apuesta ormApuesta[] = null;
						for (int i = 0; i < ids.length; i++) {
							// Busca todos los registros
							ormApuesta = lDAOFactory.getTap_apuestaDAO()
									.listTap_apuestaByQuery(
											"tap_regCaballorc_id='" + ids[i]
													+ "'", null);
							if (ormApuesta != null) {
								for (int i2 = 0; i2 < ormApuesta.length; i2++) {
									// Suma de los montos por carrera
									monto = ormApuesta[i2].getApu_monto()
											+ monto;
								}
							}
						}
					}
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// Retorna 2 indicando excepcion
				monto = -2;
			}
		}
		return monto;
	}

	/**
	 * Obtiene el monto por los caballos
	 * Si no obtiene registros retorna un -2
	 * @param idCaballo
	 * @param idCarrera
	 * @return monto
	 */
	public int montoByCaballo(int idCaballo, int idCarrera) {
		int id = 0;
		int monto = 0;
		if ((idCaballo > 0) && (idCarrera > 0)) {
			try {
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				orm.Tap_regcaballo[] ormRegCarreras;
				// Busca todos los caballos por id en os registros
				ormRegCarreras = lDAOFactory.getTap_regcaballoDAO()
						.listTap_regcaballoByQuery(
								"tap_caballocab_id='" + idCaballo + "'", null);
				// Si en cuentra caballos
				if (ormRegCarreras.length > 0) {
					// obtiene los ids de los registros de caballo y carrera
					// correspondientes a la apuesta
					for (int i = 0; i < ormRegCarreras.length; i++) {
						if (ormRegCarreras[i].getTap_carreracar().getCar_id() == idCarrera) {
							id = ormRegCarreras[i].getRc_id();
						}
					}
					//Busca los registros en las apuestas para obtener los montos
					if (id > 0) {
						orm.Tap_apuesta[] ormApuesta = null;
						ormApuesta = lDAOFactory.getTap_apuestaDAO()
								.listTap_apuestaByQuery(
										"tap_regCaballorc_id='" + id + "'",
										null);
						if (ormApuesta != null) {
							for (int i = 0; i < ormApuesta.length; i++) {
								//suma de los montos
								monto = monto + ormApuesta[i].getApu_monto();
							}
						}
					}
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// Retorna 2 indicando excepcion
				monto = -2;
			}
		}
		return monto;
	}

	/**
	 * Busca todos las apuestas y los retorna como json. Si no encuentra apuestas
	 * retorna 1 y si ocurre una excepcion retorna 2
	 * 
	 * @return json
	 */
	public static String getAll() {
		String json = null;
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		Collection<ApuestaSOAPVO> coleccionApuestaSOAPVO = new ArrayList<ApuestaSOAPVO>();
		orm.Tap_apuesta[] ormApuesta;
		try {
			ormApuesta = lDAOFactory.getTap_apuestaDAO()
					.listTap_apuestaByQuery(null, null);
			// busqueda de todos los registros existentes
			if (ormApuesta.length == 0) {// si no se encontraron registros
				json = "1";
			} else {// si se encontraron registros
				for (int i = 0; i < ormApuesta.length; i++) {
					ApuestaSOAPVO objeto = ApuestaSOAPVO
							.crearApuestaSOAPVO(ormApuesta[i]);
					coleccionApuestaSOAPVO.add(objeto);
				}// fin guardando resultados
				Gson gson = new Gson();
				json = gson.toJson(coleccionApuestaSOAPVO);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json = "2";
		}
		return json;
	}

}
