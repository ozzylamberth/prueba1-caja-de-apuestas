package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.print.DocFlavor.READER;

import org.orm.PersistentException;

import SOAPVO.CaballoSOAPVO;
import SOAPVO.RegCaballoSOAPVO;

import com.google.gson.Gson;

public class RegCaballoSOA {

	/**
	 * Busca todos los registros de las carreras de los caballos y los retorna como json. 
	 * 
	 * @return json con todos los registros de caballos.  Si no encuentra registros retorna 1.
	 * si ocurre una excepcion retorna 2
	 */
	public static String getAll() {
		Date fechaInicio = new Date();
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
		//log
		LogSOA log = new LogSOA();
		Date fechaTermino = new Date();
		log.add("Todos los reg de caballos", fechaInicio, fechaTermino);
		return json;
	}

	/**
	 * Busca un registro de una carrera de un caballo  por id y lo retorna como json. 
	 * 
	 * @param id
	 * @return json con el registro de caballo. Si el id es nulo retorna 0,
	 * si no encuentra el curso retorna 1 y si ocurre una excepcion retorna 2
	 */

	public static String getById(int id) {
		Date fechaInicio = new Date();
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
				// Busca el registro con esa id
				ormRegCarrCab = lDAOFactory.getTap_regcaballoDAO()
						.loadTap_regcaballoByQuery("rc_id='" + id + "'", null);
				// Si no se encuentra el registro, devuelve un 1, de lo
				// contrario,
				// agrega el registro a la coleccion y lo retorna
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
		//log
		LogSOA log = new LogSOA();
		Date fechaTermino = new Date();
		log.add("Registro de caballo por id", fechaInicio, fechaTermino);
		return json;
	}

	/**
	 * Busca los registros por id de un caballo y los retorna como json. 
	 * 
	 * @param idCaballo
	 * @return json con los registros por caballo. Si el id del caballo
	 * es nulo retorna 0, si no encuentra registros retorna 1 y si ocurre una
	 * excepcion retorna 2
	 */
	public static String getByCaballo(int idCaballo) {
		Date fechaInicio = new Date();
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
				// Busca todos los registros
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
		//log
		LogSOA log = new LogSOA();
		Date fechaTermino = new Date();
		log.add("Registro por caballo", fechaInicio, fechaTermino);
		return json;
	}

	/**
	 * Busca los registros por id de una carrera y los retorna como json. 
	 * 
	 * @param idCarrera
	 * @return json con los registros por carrera. Si el id de la carrera
	 * es nulo retorna 0, si no encuentra registros retorna 1 y si ocurre una
	 * excepcion retorna 2
	 */
	public static String getByCarrera(int idCarrera) {
		Date fechaInicio = new Date();
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
				// Busca todos los registros
				ormRegCaballos = lDAOFactory.getTap_regcaballoDAO()
						.listTap_regcaballoByQuery(
								"tap_carreracar_id='" + idCarrera + "'", null);
				// Si no se encuentran registros, devuelve un 1, de lo sontrario,
				// agrega los registros a la coleccion y lo retorna
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
		//log
		LogSOA log = new LogSOA();
		Date fechaTermino = new Date();
		log.add("Registro por carrera", fechaInicio, fechaTermino);
		return json;
	}

}
