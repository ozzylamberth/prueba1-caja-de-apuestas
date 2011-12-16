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
 * Tabla que almacena los registros de las apuestas.
 */
public class Tap_apuesta implements Serializable {
	public Tap_apuesta() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_TAP_APUESTA_TAP_REGCARRCABRCC) {
			this.tap_regcarrcabrcc = (orm.Tap_regcaballo) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_TAP_APUESTA_TAP_CAJACAJ) {
			this.tap_cajacaj = (orm.Tap_caja) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int apu_id;
	
	private int apu_monto;
	
	private java.util.Date apu_fecha;
	
	private orm.Tap_regcaballo tap_regcarrcabrcc;
	
	private orm.Tap_caja tap_cajacaj;
	
	private void setApu_id(int value) {
		this.apu_id = value;
	}
	
	public int getApu_id() {
		return apu_id;
	}
	
	public int getORMID() {
		return getApu_id();
	}
	
	/**
	 * Campo que almacena el monto de un registro de una apuesta.
	 */
	public void setApu_monto(int value) {
		this.apu_monto = value;
	}
	
	/**
	 * Campo que almacena el monto de un registro de una apuesta.
	 */
	public int getApu_monto() {
		return apu_monto;
	}
	
	/**
	 * Campo que almacena la fecha de un registro de una apuesta.
	 */
	public void setApu_fecha(java.util.Date value) {
		this.apu_fecha = value;
	}
	
	/**
	 * Campo que almacena la fecha de un registro de una apuesta.
	 */
	public java.util.Date getApu_fecha() {
		return apu_fecha;
	}
	
	public void setTap_regcarrcabrcc(orm.Tap_regcaballo value) {
		if (tap_regcarrcabrcc != null) {
			tap_regcarrcabrcc.tap_apuesta.remove(this);
		}
		if (value != null) {
			value.tap_apuesta.add(this);
		}
	}
	
	public orm.Tap_regcaballo getTap_regcarrcabrcc() {
		return tap_regcarrcabrcc;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tap_regcarrcabrcc(orm.Tap_regcaballo value) {
		this.tap_regcarrcabrcc = value;
	}
	
	private orm.Tap_regcaballo getORM_Tap_regcarrcabrcc() {
		return tap_regcarrcabrcc;
	}
	
	public void setTap_cajacaj(orm.Tap_caja value) {
		if (tap_cajacaj != null) {
			tap_cajacaj.tap_apuesta.remove(this);
		}
		if (value != null) {
			value.tap_apuesta.add(this);
		}
	}
	
	public orm.Tap_caja getTap_cajacaj() {
		return tap_cajacaj;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tap_cajacaj(orm.Tap_caja value) {
		this.tap_cajacaj = value;
	}
	
	private orm.Tap_caja getORM_Tap_cajacaj() {
		return tap_cajacaj;
	}
	
	public String toString() {
		return String.valueOf(getApu_id());
	}
	
}
