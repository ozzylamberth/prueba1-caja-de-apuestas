package ws;

import java.util.ArrayList;
import java.util.Collection;

import org.orm.PersistentException;

import com.google.gson.Gson;

import SOAPVO.CajaSOAPVO;

public class CajaSOA {

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
		Collection<CajaSOAPVO> coleccionCajaSOAPVO = new ArrayList<CajaSOAPVO>();
		orm.Tap_caja[] ormCajas;
		try {

				ormCajas = lDAOFactory.getTap_cajaDAO()
						.listTap_cajaByQuery(null, null);
				// busqueda de todos los registros existentes

			if (ormCajas.length == 0) {// si no se encontraron registros
				json = "1";
			} else {// si se encontraron registros
				for (int i = 0; i < ormCajas.length; i++) {
					CajaSOAPVO objeto = CajaSOAPVO
							.crearCajaSOAPVO(ormCajas[i]);
					coleccionCajaSOAPVO.add(objeto);
				}// fin guardando resultados
				Gson gson = new Gson();
				json = gson.toJson(coleccionCajaSOAPVO);
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
				Collection<CajaSOAPVO> colectionCajaSOAPVO = new ArrayList<CajaSOAPVO>();
				orm.Tap_caja ormCaja;
				// Busca al anotador con esa id
				ormCaja = lDAOFactory.getTap_cajaDAO()
						.loadTap_cajaByQuery("caj_id='" + id + "'", null);
				// Si no se encuentra el anotador, devuelve un 1, de lo contrario,
				// agrega al anotador a la coleccion y lo retorna
				if (ormCaja == null) {
					json = "1";
				} else {
					CajaSOAPVO curso = CajaSOAPVO
							.crearCajaSOAPVO(ormCaja);
					colectionCajaSOAPVO.add(curso);
					Gson gson = new Gson();
					json = gson.toJson(colectionCajaSOAPVO);
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
