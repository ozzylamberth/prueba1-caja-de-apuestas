/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package orm;

import java.io.Serializable;
/**
 * log de los eventos del web services
 */
public class Tap_log implements Serializable {
	public Tap_log() {
	}
	
	private int log_id;
	
	private String log_evento;
	
	private java.util.Date log_fechainicio;
	
	private java.util.Date log_fechatermino;
	
	private String log_tiempo;
	
	private void setLog_id(int value) {
		this.log_id = value;
	}
	
	public int getLog_id() {
		return log_id;
	}
	
	public int getORMID() {
		return getLog_id();
	}
	
	/**
	 * campo que almacena la fecha de inicio del evento
	 */
	public void setLog_fechainicio(java.util.Date value) {
		this.log_fechainicio = value;
	}
	
	/**
	 * campo que almacena la fecha de inicio del evento
	 */
	public java.util.Date getLog_fechainicio() {
		return log_fechainicio;
	}
	
	/**
	 * Campo que alamcena el evento del log
	 */
	public void setLog_evento(String value) {
		this.log_evento = value;
	}
	
	/**
	 * Campo que alamcena el evento del log
	 */
	public String getLog_evento() {
		return log_evento;
	}
	
	/**
	 * campo que almacena la fecha de termino del evento
	 */
	public void setLog_fechatermino(java.util.Date value) {
		this.log_fechatermino = value;
	}
	
	/**
	 * campo que almacena la fecha de termino del evento
	 */
	public java.util.Date getLog_fechatermino() {
		return log_fechatermino;
	}
	
	/**
	 * Campo que almacena el tiempo de duracion del evento
	 */
	public void setLog_tiempo(String value) {
		this.log_tiempo = value;
	}
	
	/**
	 * Campo que almacena el tiempo de duracion del evento
	 */
	public String getLog_tiempo() {
		return log_tiempo;
	}
	
	public String toString() {
		return String.valueOf(getLog_id());
	}
	
}
