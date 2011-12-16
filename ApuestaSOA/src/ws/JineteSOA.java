package ws;

import java.util.ArrayList;
import java.util.Collection;

import org.orm.PersistentException;

import SOAPVO.JineteSOAPVO;

import com.google.gson.Gson;

public class JineteSOA {

	

	
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
				Collection<JineteSOAPVO> colectionJineteSOAPVO = new ArrayList<JineteSOAPVO>();
				orm.Tap_jinete ormJinete;
				// Busca al anotador con esa id
				ormJinete = lDAOFactory.getTap_jineteDAO()
						.loadTap_jineteByQuery("jin_id='" + id + "'", null);
				// Si no se encuentra el anotador, devuelve un 1, de lo contrario,
				// agrega al anotador a la coleccion y lo retorna
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
		return json;
	}
	
	
}
