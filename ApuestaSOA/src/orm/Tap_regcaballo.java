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
 * Tabla que registra las carreras de los caballos.
 */
public class Tap_regcaballo implements Serializable {
	public Tap_regcaballo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TAP_REGCABALLO_TAP_APUESTA) {
			return ORM_tap_apuesta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_TAP_REGCABALLO_TAP_CABALLOCAB) {
			this.tap_caballocab = (orm.Tap_caballo) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_TAP_REGCABALLO_TAP_CARRERACAR) {
			this.tap_carreracar = (orm.Tap_carrera) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int rc_id;
	
	private orm.Tap_caballo tap_caballocab;
	
	private orm.Tap_carrera tap_carreracar;
	
	private java.util.Set ORM_tap_apuesta = new java.util.HashSet();
	
	private void setRc_id(int value) {
		this.rc_id = value;
	}
	
	public int getRc_id() {
		return rc_id;
	}
	
	public int getORMID() {
		return getRc_id();
	}
	
	public void setTap_caballocab(orm.Tap_caballo value) {
		if (tap_caballocab != null) {
			tap_caballocab.tap_regcarrcab.remove(this);
		}
		if (value != null) {
			value.tap_regcarrcab.add(this);
		}
	}
	
	public orm.Tap_caballo getTap_caballocab() {
		return tap_caballocab;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tap_caballocab(orm.Tap_caballo value) {
		this.tap_caballocab = value;
	}
	
	private orm.Tap_caballo getORM_Tap_caballocab() {
		return tap_caballocab;
	}
	
	public void setTap_carreracar(orm.Tap_carrera value) {
		if (tap_carreracar != null) {
			tap_carreracar.tap_regcarrcab.remove(this);
		}
		if (value != null) {
			value.tap_regcarrcab.add(this);
		}
	}
	
	public orm.Tap_carrera getTap_carreracar() {
		return tap_carreracar;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tap_carreracar(orm.Tap_carrera value) {
		this.tap_carreracar = value;
	}
	
	private orm.Tap_carrera getORM_Tap_carreracar() {
		return tap_carreracar;
	}
	
	private void setORM_Tap_apuesta(java.util.Set value) {
		this.ORM_tap_apuesta = value;
	}
	
	private java.util.Set getORM_Tap_apuesta() {
		return ORM_tap_apuesta;
	}
	
	public final orm.Tap_apuestaSetCollection tap_apuesta = new orm.Tap_apuestaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TAP_REGCABALLO_TAP_APUESTA, orm.ORMConstants.KEY_TAP_APUESTA_TAP_REGCARRCABRCC, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getRc_id());
	}
	
}
