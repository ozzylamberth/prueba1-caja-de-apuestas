package ws;

import java.util.ArrayList;
import java.util.Collection;

import javax.print.DocFlavor.READER;

import org.orm.PersistentException;

import SOAPVO.RegCarrCabSOAPVO;

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
		Collection<RegCarrCabSOAPVO> coleccionRegCarrCabSOAPVO = new ArrayList<RegCarrCabSOAPVO>();
		orm.Tap_regcarrcab[] ormRegCarrCab;
		try {

				ormRegCarrCab = lDAOFactory.getTap_regcarrcabDAO()
						.listTap_regcarrcabByQuery(null, null);
				// busqueda de todos los registros existentes

			if (ormRegCarrCab.length == 0) {// si no se encontraron registros
				json = "1";
			} else {// si se encontraron registros
				for (int i = 0; i < ormRegCarrCab.length; i++) {
					RegCarrCabSOAPVO regCarrCab = RegCarrCabSOAPVO
							.crearRegCarrCabSOAPVO(ormRegCarrCab[i]);
					coleccionRegCarrCabSOAPVO.add(regCarrCab);
				}// fin guardando resultados
				Gson gson = new Gson();
				json = gson.toJson(coleccionRegCarrCabSOAPVO);
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
				Collection<RegCarrCabSOAPVO> colectionRegCarrCabSOAPVO = new ArrayList<RegCarrCabSOAPVO>();
				orm.Tap_regcarrcab ormRegCarrCab;
				// Busca al anotador con esa id
				ormRegCarrCab = lDAOFactory.getTap_regcarrcabDAO()
						.loadTap_regcarrcabByQuery("rcc_id='" + id + "'", null);
				// Si no se encuentra el anotador, devuelve un 1, de lo contrario,
				// agrega al anotador a la coleccion y lo retorna
				if (ormRegCarrCab == null) {
					json = "1";
				} else {
					RegCarrCabSOAPVO pista = RegCarrCabSOAPVO
							.crearRegCarrCabSOAPVO(ormRegCarrCab);
					colectionRegCarrCabSOAPVO.add(pista);
					Gson gson = new Gson();
					json = gson.toJson(colectionRegCarrCabSOAPVO);
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
