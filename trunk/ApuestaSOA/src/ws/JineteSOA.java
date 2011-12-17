package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.orm.PersistentException;

import SOAPVO.JineteSOAPVO;

import com.google.gson.Gson;

public class JineteSOA {
	
	/**
	 * Busca todos los jinetes y los retorna como json.
	 * 
	 * @return json con los jinetes.  Si no encuentra jinetes retorna 1
	 * y si ocurre una excepcion retorna 2
	 */
	public static String getAll() {
		Date fechaInicio = new Date();
		String json = null;
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		Collection<JineteSOAPVO> coleccionJineteSOAPVO = new ArrayList<JineteSOAPVO>();
		orm.Tap_jinete[] ormJinetes;
		try {
				ormJinetes = lDAOFactory.getTap_jineteDAO()
						.listTap_jineteByQuery(null, null);
				// busqueda de todos los registros existentes
			if (ormJinetes.length == 0) {// si no se encontraron registros
				json = "1";
			} else {// si se encontraron registros
				for (int i = 0; i < ormJinetes.length; i++) {
					JineteSOAPVO jinete = JineteSOAPVO
							.crearJineteSOAPVO(ormJinetes[i]);
					coleccionJineteSOAPVO.add(jinete);
				}// fin guardando resultados
				Gson gson = new Gson();
				json = gson.toJson(coleccionJineteSOAPVO);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json = "2";
		}
		//log
		LogSOA log = new LogSOA();
		Date fechaTermino = new Date();
		log.add("Todas los jinetes", fechaInicio, fechaTermino);
		return json;
	}
	
	/**
	 * Busca un jinete por id y lo retorna como json.
	 * 
	 * @param id
	 * @return json con el jinete. Si el id es nulo retorna 0, si no encuentra el curso retorna 1
	 * y si ocurre una excepcion retorna 2
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
				Collection<JineteSOAPVO> colectionJineteSOAPVO = new ArrayList<JineteSOAPVO>();
				orm.Tap_jinete ormJinete;
				// Busca el jinete con esa id
				ormJinete = lDAOFactory.getTap_jineteDAO()
						.loadTap_jineteByQuery("jin_id='" + id + "'", null);
				// Si no se encuentra el jinete, devuelve un 1, de lo contrario,
				// agrega al jinete a la coleccion y lo retorna
				if (ormJinete == null) {
					json = "1";
				} else {
					JineteSOAPVO jinete = JineteSOAPVO
							.crearJineteSOAPVO(ormJinete);
					colectionJineteSOAPVO.add(jinete);
					Gson gson = new Gson();
					json = gson.toJson(colectionJineteSOAPVO);
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
		log.add("Jinete por id", fechaInicio, fechaTermino);
		return json;
	}
	
	
}
