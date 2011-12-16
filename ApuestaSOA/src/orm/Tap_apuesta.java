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
public class Tap_apuesta implements Serializable {
	public Tap_apuesta() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_TAP_APUESTA_TAP_CAJACAJ) {
			this.tap_cajacaj = (orm.Tap_j) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_TAP_APUESTA_TAP_CARRERACAR) {
			this.tap_carreracar = (orm.Tap_carrera) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ap_id;
	
	private int ap_monto;
	
	private orm.Tap_j tap_cajacaj;
	
	private orm.Tap_carrera tap_carreracar;
	
	private void setAp_id(int value) {
		this.ap_id = value;
	}
	
	public int getAp_id() {
		return ap_id;
	}
	
	public int getORMID() {
		return getAp_id();
	}
	
	/**
	 * Campo que almacena el monto de un registro de una anotacion.
	 */
	public void setAp_monto(int value) {
		this.ap_monto = value;
	}
	
	/**
	 * Campo que almacena el monto de un registro de una anotacion.
	 */
	public int getAp_monto() {
		return ap_monto;
	}
	
	public void setTap_cajacaj(orm.Tap_j value) {
		if (tap_cajacaj != null) {
			tap_cajacaj.tap_apuesta.remove(this);
		}
		if (value != null) {
			value.tap_apuesta.add(this);
		}
	}
	
	public orm.Tap_j getTap_cajacaj() {
		return tap_cajacaj;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tap_cajacaj(orm.Tap_j value) {
		this.tap_cajacaj = value;
	}
	
	private orm.Tap_j getORM_Tap_cajacaj() {
		return tap_cajacaj;
	}
	
	public void setTap_carreracar(orm.Tap_carrera value) {
		if (tap_carreracar != null) {
			tap_carreracar.tap_apuesta.remove(this);
		}
		if (value != null) {
			value.tap_apuesta.add(this);
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
	
	public String toString() {
		return String.valueOf(getAp_id());
	}
	
}
