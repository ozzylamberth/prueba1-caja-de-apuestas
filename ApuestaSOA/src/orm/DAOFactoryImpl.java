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

import orm.impl.*;
import orm.dao.*;

public class DAOFactoryImpl extends DAOFactory {
	private Tap_caballoDAO _tap_caballoDAO = new Tap_caballoDAOImpl();
	public Tap_caballoDAO getTap_caballoDAO() {
		return _tap_caballoDAO;
	}
	
	private Tap_jineteDAO _tap_jineteDAO = new Tap_jineteDAOImpl();
	public Tap_jineteDAO getTap_jineteDAO() {
		return _tap_jineteDAO;
	}
	
	private Tap_apuestaDAO _tap_apuestaDAO = new Tap_apuestaDAOImpl();
	public Tap_apuestaDAO getTap_apuestaDAO() {
		return _tap_apuestaDAO;
	}
	
	private Tap_carreraDAO _tap_carreraDAO = new Tap_carreraDAOImpl();
	public Tap_carreraDAO getTap_carreraDAO() {
		return _tap_carreraDAO;
	}
	
	private Tap_pistaDAO _tap_pistaDAO = new Tap_pistaDAOImpl();
	public Tap_pistaDAO getTap_pistaDAO() {
		return _tap_pistaDAO;
	}
	
	private Tap_cajaDAO _tap_cajaDAO = new Tap_cajaDAOImpl();
	public Tap_cajaDAO getTap_cajaDAO() {
		return _tap_cajaDAO;
	}
	
}

