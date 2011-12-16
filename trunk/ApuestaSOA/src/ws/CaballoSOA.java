package ws;

import java.util.ArrayList;
import java.util.Collection;

import org.orm.PersistentException;

import SOAPVO.CaballoSOAPVO;

import com.google.gson.Gson;

public class CaballoSOA {


	/**
	 * Busca todos los caballos y los retorna como json.
	 * Si no encuentra caballos retorna 1
	 * y si ocurre una excepcion retorna 2
	 * 
	 * @return json
	 */
	public static String getAll() {
		String json = null;
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		Collection<CaballoSOAPVO> coleccionCaballoSOAPVO = new ArrayList<CaballoSOAPVO>();
		orm.Tap_caballo[] ormCaballos;
		try {
				ormCaballos = lDAOFactory.getTap_caballoDAO()
						.listTap_caballoByQuery(null, null);
				// busqueda de todos los registros existentes
			if (ormCaballos.length == 0) {// si no se encontraron registros
				json = "1";
			} else {// si se encontraron registros
				for (int i = 0; i < ormCaballos.length; i++) {
					CaballoSOAPVO objeto = CaballoSOAPVO
							.crearCaballoSOAPVO(ormCaballos[i]);
					coleccionCaballoSOAPVO.add(objeto);
				}// fin guardando resultados
				Gson gson = new Gson();
				json = gson.toJson(coleccionCaballoSOAPVO);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json = "2";
		}
		return json;
	}
	
	/**
	 * Busca un caballo por id y lo retorna como json.
	 * Si el id es nulo retorna 0, si no encuentra el curso retorna 1
	 * y si ocurre una excepcion retorna 2
	 * 
	 * @param id
	 * @return json
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
				Collection<CaballoSOAPVO> colectionCaballoSOAPVO = new ArrayList<CaballoSOAPVO>();
				orm.Tap_caballo ormCaballo;
				// Busca al caballo con esa id
				ormCaballo = lDAOFactory.getTap_caballoDAO()
						.loadTap_caballoByQuery("cab_id='" + id + "'", null);
				// Si no se encuentra el caballo, devuelve un 1, de lo contrario,
				// agrega al caballo a la coleccion y lo retorna
				if (ormCaballo == null) {
					json = "1";
				} else {
					CaballoSOAPVO caballo = CaballoSOAPVO
							.crearCaballoSOAPVO(ormCaballo);
					colectionCaballoSOAPVO.add(caballo);
					Gson gson = new Gson();
					json = gson.toJson(colectionCaballoSOAPVO);
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
