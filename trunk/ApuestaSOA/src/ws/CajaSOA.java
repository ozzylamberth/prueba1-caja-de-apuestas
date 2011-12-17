package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.orm.PersistentException;

import com.google.gson.Gson;

import SOAPVO.CajaSOAPVO;

public class CajaSOA {

	/**
	 * Busca todas las cajas y las retorna como json.
	 * 
	 * @return json con las cajas. Si no encuentra cajas retorna 1
	 * y si ocurre una excepcion retorna 2
	 */
	public static String getAll() {
		Date fechaInicio = new Date();
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
		//log
		LogSOA log = new LogSOA();
		Date fechaTermino = new Date();
		log.add("Todos las cajas", fechaInicio, fechaTermino);
		return json;
	}
	
	/**
	 * Busca una caja por id y la retorna como json.
	 * 
	 * @param id
	 * @return json con la caja.  Si el id es nulo retorna 0, si no encuentra el curso retorna 1
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
				Collection<CajaSOAPVO> colectionCajaSOAPVO = new ArrayList<CajaSOAPVO>();
				orm.Tap_caja ormCaja;
				// Busca la caja con esa id
				ormCaja = lDAOFactory.getTap_cajaDAO()
						.loadTap_cajaByQuery("caj_id='" + id + "'", null);
				// Si no se encuentra la caja, devuelve un 1, de lo contrario,
				// agrega la caja a la coleccion y la retorna
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
		//log
		LogSOA log = new LogSOA();
		Date fechaTermino = new Date();
		log.add("Caja por id", fechaInicio, fechaTermino);
		return json;
	}
	
}
