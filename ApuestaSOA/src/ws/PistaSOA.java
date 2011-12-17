package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.orm.PersistentException;

import SOAPVO.PistaSOAPVO;

import com.google.gson.Gson;

public class PistaSOA {

	
	/**
	 * Busca todos las pistas y las retorna como json.
	 *
	 * @return json con todas las pistas.  Si no encuentra pistas retorna 1
	 * y si ocurre una excepcion retorna 2
	 */
	public static String getAll() {
		Date fechaInicio = new Date();
		String json = null;
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		Collection<PistaSOAPVO> coleccionPistaSOAPVO = new ArrayList<PistaSOAPVO>();
		orm.Tap_pista[] ormPistas;
		try {
				ormPistas = lDAOFactory.getTap_pistaDAO()
						.listTap_pistaByQuery(null, null);
				// busqueda de todos los registros existentes
			if (ormPistas.length == 0) {// si no se encontraron registros
				json = "1";
			} else {// si se encontraron registros
				for (int i = 0; i < ormPistas.length; i++) {
					PistaSOAPVO pista = PistaSOAPVO
							.crearPistaSOAPVO(ormPistas[i]);
					coleccionPistaSOAPVO.add(pista);
				}// fin guardando resultados
				Gson gson = new Gson();
				json = gson.toJson(coleccionPistaSOAPVO);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json = "2";
		}
		//log
		LogSOA log = new LogSOA();
		Date fechaTermino = new Date();
		log.add("Todas las pistas", fechaInicio, fechaTermino);
		return json;
	}
	
	/**
	 * Busca una pista por id y lo retorna como json.
	 * 
	 * @param id
	 * @return json con la pista por id.  Si el id es nulo retorna 0, 
	 * si no encuentra la pista retorna 1
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
				Collection<PistaSOAPVO> colectionPistaSOAPVO = new ArrayList<PistaSOAPVO>();
				orm.Tap_pista ormPista;
				// Busca la pista con esa id
				ormPista = lDAOFactory.getTap_pistaDAO()
						.loadTap_pistaByQuery("pis_id='" + id + "'", null);
				// Si no se encuentra la pista, devuelve un 1, de lo contrario,
				// agrega la pista a la coleccion y lo retorna
				if (ormPista == null) {
					json = "1";
				} else {
					PistaSOAPVO pista = PistaSOAPVO
							.crearPistaSOAPVO(ormPista);
					colectionPistaSOAPVO.add(pista);
					Gson gson = new Gson();
					json = gson.toJson(colectionPistaSOAPVO);
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
		log.add("Pista por id", fechaInicio, fechaTermino);
		return json;
	}
	
}
