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
 * Tabla que almacena los registros de las cajas.
 */
public class Tap_caja implements Serializable {
	public Tap_caja() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TAP_CAJA_TAP_APUESTA) {
			return ORM_tap_apuesta;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int caj_id;
	
	private String caj_nombre;
	
	private java.util.Set ORM_tap_apuesta = new java.util.HashSet();
	
	private void setCaj_id(int value) {
		this.caj_id = value;
	}
	
	public int getCaj_id() {
		return caj_id;
	}
	
	public int getORMID() {
		return getCaj_id();
	}
	
	/**
	 * Campo que almacena el nombre de un registro de una caja.
	 */
	public void setCaj_nombre(String value) {
		this.caj_nombre = value;
	}
	
	/**
	 * Campo que almacena el nombre de un registro de una caja.
	 */
	public String getCaj_nombre() {
		return caj_nombre;
	}
	
	private void setORM_Tap_apuesta(java.util.Set value) {
		this.ORM_tap_apuesta = value;
	}
	
	private java.util.Set getORM_Tap_apuesta() {
		return ORM_tap_apuesta;
	}
	
	public final orm.Tap_apuestaSetCollection tap_apuesta = new orm.Tap_apuestaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TAP_CAJA_TAP_APUESTA, orm.ORMConstants.KEY_TAP_APUESTA_TAP_CAJACAJ, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCaj_id());
	}
	
}
