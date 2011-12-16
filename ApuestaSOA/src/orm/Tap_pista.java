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
public class Tap_pista implements Serializable {
	public Tap_pista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TAP_PISTA_TAP_CARRERA) {
			return ORM_tap_carrera;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int pis_id;
	
	private String pis_nombre;
	
	private java.util.Set ORM_tap_carrera = new java.util.HashSet();
	
	private void setPis_id(int value) {
		this.pis_id = value;
	}
	
	public int getPis_id() {
		return pis_id;
	}
	
	public int getORMID() {
		return getPis_id();
	}
	
	/**
	 * Campo que almacena el nombre de un registro de una pista.
	 */
	public void setPis_nombre(String value) {
		this.pis_nombre = value;
	}
	
	/**
	 * Campo que almacena el nombre de un registro de una pista.
	 */
	public String getPis_nombre() {
		return pis_nombre;
	}
	
	private void setORM_Tap_carrera(java.util.Set value) {
		this.ORM_tap_carrera = value;
	}
	
	private java.util.Set getORM_Tap_carrera() {
		return ORM_tap_carrera;
	}
	
	public final orm.Tap_carreraSetCollection tap_carrera = new orm.Tap_carreraSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TAP_PISTA_TAP_CARRERA, orm.ORMConstants.KEY_TAP_CARRERA_TAP_PISTAPIS, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getPis_id());
	}
	
}
