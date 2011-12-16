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
public class Tap_jinete implements Serializable {
	public Tap_jinete() {
	}
	
	private int jin_id;
	
	private String jin_rut;
	
	private String jin_nombre;
	
	private orm.Tap_caballo tap_caballo;
	
	private void setJin_id(int value) {
		this.jin_id = value;
	}
	
	public int getJin_id() {
		return jin_id;
	}
	
	public int getORMID() {
		return getJin_id();
	}
	
	/**
	 * Campo que almacena el rut de un registro de un jinete.
	 */
	public void setJin_rut(String value) {
		this.jin_rut = value;
	}
	
	/**
	 * Campo que almacena el rut de un registro de un jinete.
	 */
	public String getJin_rut() {
		return jin_rut;
	}
	
	/**
	 * Campo que almacena el nombre de un registro de un jinete.
	 */
	public void setJin_nombre(String value) {
		this.jin_nombre = value;
	}
	
	/**
	 * Campo que almacena el nombre de un registro de un jinete.
	 */
	public String getJin_nombre() {
		return jin_nombre;
	}
	
	public void setTap_caballo(orm.Tap_caballo value) {
		if (this.tap_caballo != value) {
			orm.Tap_caballo ltap_caballo = this.tap_caballo;
			this.tap_caballo = value;
			if (value != null) {
				tap_caballo.setTap_jinetejin(this);
			}
			else {
				ltap_caballo.setTap_jinetejin(null);
			}
		}
	}
	
	public orm.Tap_caballo getTap_caballo() {
		return tap_caballo;
	}
	
	public String toString() {
		return String.valueOf(getJin_id());
	}
	
}
