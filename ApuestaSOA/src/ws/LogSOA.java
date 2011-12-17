package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import SOAPVO.LogSOAPVO;

import com.google.gson.Gson;

public class LogSOA {

	/**
	 * Ingresa nuevo log al registro
	 * 
	 * @param evento
	 * @param fechaInicio
	 * @param fechaTermino
	 * @return respuesta. Si alguna variable es nula
	 * retorna 0, si ocurre una excepcion retorna 2 y si es exitoso reorna 3
	 */
	public String add(String evento, Date fechaInicio, Date fechaTermino){
		String respuesta = "";
		PersistentTransaction t;
		if ((evento == null) || (fechaInicio == null)
				|| (fechaTermino == null)) {
			respuesta = "0";
		}else{
		try {
			t = orm.ApuestaPersistentManager.instance().getSession()
					.beginTransaction();

            orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
            
            orm.dao.Tap_logDAO oRMTap_logDAO = lDAOFactory.getTap_logDAO();
            
            orm.Tap_log oRMTap_log = oRMTap_logDAO.createTap_log();
            //se obtiene la duracion del evento
            long tiempofi = fechaInicio.getTime();
            long tiempoft = fechaTermino.getTime();
            String tiempo = String.valueOf(tiempoft - tiempofi);
            
            oRMTap_log.setLog_evento(evento);
            oRMTap_log.setLog_tiempo(tiempo);
            oRMTap_log.setLog_fechainicio(fechaInicio);
            oRMTap_log.setLog_fechatermino(fechaTermino);
            oRMTap_logDAO.save(oRMTap_log);
                        
            t.commit();
            respuesta = "3";
		}
		catch (PersistentException e1) {
			e1.printStackTrace();
			respuesta = "2";
		}
		}
		return respuesta;
		
	}
	
	/**
	 * Busca todos los log y los retorna como json.
	 * Si no encuentra log retorna 1
	 * y si ocurre una excepcion retorna 2
	 * 
	 * @return json
	 */
	public static String getAll() {
		String json = null;
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		Collection<LogSOAPVO> coleccionLogSOAPVO = new ArrayList<LogSOAPVO>();
		orm.Tap_log[] ormLog;
		try {
				ormLog = lDAOFactory.getTap_logDAO()
						.listTap_logByQuery(null, null);
				// busqueda de todos los registros existentes
			if (ormLog.length == 0) {// si no se encontraron registros
				json = "1";
			} else {// si se encontraron registros
				for (int i = 0; i < ormLog.length; i++) {
					LogSOAPVO objeto = LogSOAPVO
							.crearLogSOAPVO(ormLog[i]);
					coleccionLogSOAPVO.add(objeto);
				}// fin guardando resultados
				Gson gson = new Gson();
				json = gson.toJson(coleccionLogSOAPVO);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json = "2";
		}
		return json;
	}
	
	
}
