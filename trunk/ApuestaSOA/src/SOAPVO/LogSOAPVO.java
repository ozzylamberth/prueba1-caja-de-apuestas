package SOAPVO;

import java.util.Date;

public class LogSOAPVO {
	
	int id;
	String evento;
	String tiempo;
	Date fechaInicio;
	Date fechaTermino;
	
	/**
	 * Crea un nuevo log
	 * @param logOrm
	 * @return caballo
	 */
	
	public static LogSOAPVO crearLogSOAPVO(orm.Tap_log logOrm) {
		LogSOAPVO objeto = new LogSOAPVO();
		objeto.setId(logOrm.getLog_id());
		objeto.setEvento(logOrm.getLog_evento());
		objeto.setTiempo(logOrm.getLog_tiempo());
		objeto.setFechaInicio(logOrm.getLog_fechainicio());
		objeto.setFechaTermino(logOrm.getLog_fechatermino());
		return objeto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	
	

}
