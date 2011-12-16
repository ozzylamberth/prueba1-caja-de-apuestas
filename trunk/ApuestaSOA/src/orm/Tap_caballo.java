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
public class Tap_caballo implements Serializable {
	public Tap_caballo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TAP_CABALLO_TAP_CARRERA) {
			return ORM_tap_carrera;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int cab_id;
	
	private String cab_nombre;
	
	private orm.Tap_jinete tap_jinetejin;
	
	private java.util.Set ORM_tap_carrera = new java.util.HashSet();
	
	private void setCab_id(int value) {
		this.cab_id = value;
	}
	
	public int getCab_id() {
		return cab_id;
	}
	
	public int getORMID() {
		return getCab_id();
	}
	
	/**
	 * Campo que almacena el nombre de un registro de un caballo.
	 */
	public void setCab_nombre(String value) {
		this.cab_nombre = value;
	}
	
	/**
	 * Campo que almacena el nombre de un registro de un caballo.
	 */
	public String getCab_nombre() {
		return cab_nombre;
	}
	
	public void setTap_jinetejin(orm.Tap_jinete value) {
		if (this.tap_jinetejin != value) {
			orm.Tap_jinete ltap_jinetejin = this.tap_jinetejin;
			this.tap_jinetejin = value;
			if (value != null) {
				tap_jinetejin.setTap_caballo(this);
			}
			else {
				ltap_jinetejin.setTap_caballo(null);
			}
		}
	}
	
	public orm.Tap_jinete getTap_jinetejin() {
		return tap_jinetejin;
	}
	
	private void setORM_Tap_carrera(java.util.Set value) {
		this.ORM_tap_carrera = value;
	}
	
	private java.util.Set getORM_Tap_carrera() {
		return ORM_tap_carrera;
	}
	
	public final orm.Tap_carreraSetCollection tap_carrera = new orm.Tap_carreraSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TAP_CABALLO_TAP_CARRERA, orm.ORMConstants.KEY_TAP_CARRERA_TAP_CABALLOCAB, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCab_id());
	}
	
}
