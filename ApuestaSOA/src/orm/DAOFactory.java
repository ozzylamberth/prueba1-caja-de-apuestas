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

import orm.dao.*;

public abstract class DAOFactory {
	private static DAOFactory _factory = new DAOFactoryImpl();
	
	public static DAOFactory getDAOFactory() {
		return _factory;
	}
	
	public abstract Tap_jineteDAO getTap_jineteDAO();
	public abstract Tap_caballoDAO getTap_caballoDAO();
	public abstract Tap_cajaDAO getTap_cajaDAO();
	public abstract Tap_pistaDAO getTap_pistaDAO();
	public abstract Tap_carreraDAO getTap_carreraDAO();
	public abstract Tap_regcaballoDAO getTap_regcaballoDAO();
	public abstract Tap_apuestaDAO getTap_apuestaDAO();
	public abstract Tap_logDAO getTap_logDAO();
}

