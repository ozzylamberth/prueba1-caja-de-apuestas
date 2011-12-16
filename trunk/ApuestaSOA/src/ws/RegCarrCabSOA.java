package ws;

import java.util.ArrayList;
import java.util.Collection;

import javax.print.DocFlavor.READER;

import org.orm.PersistentException;

import SOAPVO.CaballoSOAPVO;
import SOAPVO.RegCaballoSOAPVO;

import com.google.gson.Gson;

public class RegCarrCabSOA {

	/**
	 * Busca todos los cursos y los retorna como json.
	 * Si no encuentra cursos retorna 1
	 * y si ocurre una excepcion retorna 2
	 * 
	 * @return
	 */
	public static String getAll() {

		String json = null;
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		Collection<RegCaballoSOAPVO> coleccionRegCaballoSOAPVO = new ArrayList<RegCaballoSOAPVO>();
		orm.Tap_regcaballo[] ormRegCaballo;
		try {

				ormRegCaballo = lDAOFactory.getTap_regcaballoDAO()
						.listTap_regcaballoByQuery(null, null);
				// busqueda de todos los registros existentes

			if (ormRegCaballo.length == 0) {// si no se encontraron registros
				json = "1";
			} else {// si se encontraron registros
				for (int i = 0; i < ormRegCaballo.length; i++) {
					RegCaballoSOAPVO regCaballo = RegCaballoSOAPVO
							.crearRegCarrCabSOAPVO(ormRegCaballo[i]);
					coleccionRegCaballoSOAPVO.add(regCaballo);
				}// fin guardando resultados
				Gson gson = new Gson();
				json = gson.toJson(coleccionRegCaballoSOAPVO);
			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json = "2";
		}
		return json;
	}
	
	/**
	 * Busca un curso por id y lo retorna como json.
	 * Si el id es nulo retorna 0, si no encuentra el curso retorna 1
	 * y si ocurre una excepcion retorna 2
	 * 
	 * @param id
	 * @return
	 */
	
	public static String getById(int id) {
		String json = null;
		// Comprueba si la variable ingresada es nula
		if (id == 0) {
			// Retorna un 0, indicando que el dato ingresado es nulo
			json = "0";
		} else {
			try {
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				Collection<RegCaballoSOAPVO> colectionRegCaballoSOAPVO = new ArrayList<RegCaballoSOAPVO>();
				orm.Tap_regcaballo ormRegCarrCab;
				// Busca al anotador con esa id
				ormRegCarrCab = lDAOFactory.getTap_regcaballoDAO()
						.loadTap_regcaballoByQuery("rc_id='" + id + "'", null);
				// Si no se encuentra el anotador, devuelve un 1, de lo contrario,
				// agrega al anotador a la coleccion y lo retorna
				if (ormRegCarrCab == null) {
					json = "1";
				} else {
					RegCaballoSOAPVO regCaballo = RegCaballoSOAPVO
							.crearRegCarrCabSOAPVO(ormRegCarrCab);
					colectionRegCaballoSOAPVO.add(regCaballo);
					Gson gson = new Gson();
					json = gson.toJson(colectionRegCaballoSOAPVO);
				}// fin guardando resultado
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// Retorna 2 indicando excepcion
				json = "2";
			}
		}
		return json;
	}
	
	/**
	 * Busca los alumnos por curso y los retorna como json.
	 * Si el id del curso es nulo retorna 0, si no encuentra alumnos retorna 1
	 * y si ocurre una excepcion retorna 2
	 * 
	 * @param idCaballo
	 * @return
	 */
	public static String getByCaballo(int idCaballo) {
		String json = null;
		// Comprueba si la variable ingresada es nula
		if (idCaballo == 0) {
			// Retorna un 0, indicando que el dato ingresado es nulo
			json = "0";
		} else {
			try {
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				Collection<RegCaballoSOAPVO> colectionCaballoSOAPVO = new ArrayList<RegCaballoSOAPVO>();
				orm.Tap_regcaballo[] ormRegCaballos;
				// Busca todos los alumnos en el curso
				ormRegCaballos = lDAOFactory.getTap_regcaballoDAO()
						.listTap_regcaballoByQuery(
								"tap_caballocab_id='" + idCaballo + "'", null);
				// Si no se encuentran alumnos, devuelve un 1, de lo sontrario,
				// agrega los alumnos a la coleccion y lo retorna
				if (ormRegCaballos.length == 0) {
					json = "1";
				} else {
					for (int i = 0; i < ormRegCaballos.length; i++) {
						RegCaballoSOAPVO regCaballo = RegCaballoSOAPVO
								.crearRegCarrCabSOAPVO(ormRegCaballos[i]);
						colectionCaballoSOAPVO.add(regCaballo);
					}// fin guardando resultados
					Gson gson = new Gson();
					json = gson.toJson(colectionCaballoSOAPVO);
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// Retorna 2 indicando excepcion
				json = "2";
			}
		}
		return json;
	}
	
	/**
	 * Busca los alumnos por curso y los retorna como json.
	 * Si el id del curso es nulo retorna 0, si no encuentra alumnos retorna 1
	 * y si ocurre una excepcion retorna 2
	 * 
	 * @param idCarrera
	 * @return
	 */
	public static String getByCarrera(int idCarrera) {
		String json = null;
		// Comprueba si la variable ingresada es nula
		if (idCarrera == 0) {
			// Retorna un 0, indicando que el dato ingresado es nulo
			json = "0";
		} else {
			try {
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				Collection<RegCaballoSOAPVO> colectionCarreraSOAPVO = new ArrayList<RegCaballoSOAPVO>();
				orm.Tap_regcaballo[] ormRegCaballos;
				// Busca todos los alumnos en el curso
				ormRegCaballos = lDAOFactory.getTap_regcaballoDAO()
						.listTap_regcaballoByQuery(
								"tap_carreracar_id='" + idCarrera + "'", null);
				// Si no se encuentran alumnos, devuelve un 1, de lo sontrario,
				// agrega los alumnos a la coleccion y lo retorna
				if (ormRegCaballos.length == 0) {
					json = "1";
				} else {
					for (int i = 0; i < ormRegCaballos.length; i++) {
						RegCaballoSOAPVO regCaballo = RegCaballoSOAPVO
								.crearRegCarrCabSOAPVO(ormRegCaballos[i]);
						colectionCarreraSOAPVO.add(regCaballo);
					}// fin guardando resultados
					Gson gson = new Gson();
					json = gson.toJson(colectionCarreraSOAPVO);
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// Retorna 2 indicando excepcion
				json = "2";
			}
		}
		return json;
	}
	
	
	
}
