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
public class Tap_carrera implements Serializable {
	public Tap_carrera() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TAP_CARRERA_TAP_APUESTA) {
			return ORM_tap_apuesta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_TAP_CARRERA_TAP_PISTAPIS) {
			this.tap_pistapis = (orm.Tap_pista) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_TAP_CARRERA_TAP_CABALLOCAB) {
			this.tap_caballocab = (orm.Tap_caballo) owner;
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
	
	private int car_id;
	
	private int car_numero;
	
	private java.util.Date car_fecha;
	
	private orm.Tap_pista tap_pistapis;
	
	private orm.Tap_caballo tap_caballocab;
	
	private java.util.Set ORM_tap_apuesta = new java.util.HashSet();
	
	private void setCar_id(int value) {
		this.car_id = value;
	}
	
	public int getCar_id() {
		return car_id;
	}
	
	public int getORMID() {
		return getCar_id();
	}
	
	/**
	 * Campo que almacena el numero de un registro de una carrera.
	 */
	public void setCar_numero(int value) {
		this.car_numero = value;
	}
	
	/**
	 * Campo que almacena el numero de un registro de una carrera.
	 */
	public int getCar_numero() {
		return car_numero;
	}
	
	/**
	 * Campo que almacena la fecha de un registro de una carrera.
	 */
	public void setCar_fecha(java.util.Date value) {
		this.car_fecha = value;
	}
	
	/**
	 * Campo que almacena la fecha de un registro de una carrera.
	 */
	public java.util.Date getCar_fecha() {
		return car_fecha;
	}
	
	public void setTap_pistapis(orm.Tap_pista value) {
		if (tap_pistapis != null) {
			tap_pistapis.tap_carrera.remove(this);
		}
		if (value != null) {
			value.tap_carrera.add(this);
		}
	}
	
	public orm.Tap_pista getTap_pistapis() {
		return tap_pistapis;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tap_pistapis(orm.Tap_pista value) {
		this.tap_pistapis = value;
	}
	
	private orm.Tap_pista getORM_Tap_pistapis() {
		return tap_pistapis;
	}
	
	public void setTap_caballocab(orm.Tap_caballo value) {
		if (tap_caballocab != null) {
			tap_caballocab.tap_carrera.remove(this);
		}
		if (value != null) {
			value.tap_carrera.add(this);
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
	
	private void setORM_Tap_apuesta(java.util.Set value) {
		this.ORM_tap_apuesta = value;
	}
	
	private java.util.Set getORM_Tap_apuesta() {
		return ORM_tap_apuesta;
	}
	
	public final orm.Tap_apuestaSetCollection tap_apuesta = new orm.Tap_apuestaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TAP_CARRERA_TAP_APUESTA, orm.ORMConstants.KEY_TAP_APUESTA_TAP_CARRERACAR, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCar_id());
	}
	
}
