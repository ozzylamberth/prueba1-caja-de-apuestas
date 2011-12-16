package ws;

import java.util.ArrayList;
import java.util.Collection;

import org.orm.PersistentException;

import SOAPVO.CarreraSOAPVO;

import com.google.gson.Gson;

public class CarreraSOA {

	
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
		Collection<CarreraSOAPVO> coleccionCarreraSOAPVO = new ArrayList<CarreraSOAPVO>();
		orm.Tap_carrera[] ormCarreras;
		try {

				ormCarreras = lDAOFactory.getTap_carreraDAO()
						.listTap_carreraByQuery(null, null);
				// busqueda de todos los registros existentes

			if (ormCarreras.length == 0) {// si no se encontraron registros
				json = "1";
			} else {// si se encontraron registros
				for (int i = 0; i < ormCarreras.length; i++) {
					CarreraSOAPVO objeto = CarreraSOAPVO
							.crearCarreraSOAPVO(ormCarreras[i]);
					coleccionCarreraSOAPVO.add(objeto);
				}// fin guardando resultados
				Gson gson = new Gson();
				json = gson.toJson(coleccionCarreraSOAPVO);
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
				Collection<CarreraSOAPVO> colectionCarreraSOAPVO = new ArrayList<CarreraSOAPVO>();
				orm.Tap_carrera ormCarrera;
				// Busca al anotador con esa id
				ormCarrera = lDAOFactory.getTap_carreraDAO()
						.loadTap_carreraByQuery("car_id='" + id + "'", null);
				// Si no se encuentra el anotador, devuelve un 1, de lo contrario,
				// agrega al anotador a la coleccion y lo retorna
				if (ormCarrera == null) {
					json = "1";
				} else {
					CarreraSOAPVO carrera = CarreraSOAPVO
							.crearCarreraSOAPVO(ormCarrera);
					colectionCarreraSOAPVO.add(carrera);
					Gson gson = new Gson();
					json = gson.toJson(colectionCarreraSOAPVO);
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
