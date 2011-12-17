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
package orm.dao;

import org.orm.*;
import orm.*;

public interface Tap_regcaballoDAO {
	public Tap_regcaballo loadTap_regcaballoByORMID(int rc_id) throws PersistentException;
	public Tap_regcaballo getTap_regcaballoByORMID(int rc_id) throws PersistentException;
	public Tap_regcaballo loadTap_regcaballoByORMID(int rc_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_regcaballo getTap_regcaballoByORMID(int rc_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_regcaballo loadTap_regcaballoByORMID(PersistentSession session, int rc_id) throws PersistentException;
	public Tap_regcaballo getTap_regcaballoByORMID(PersistentSession session, int rc_id) throws PersistentException;
	public Tap_regcaballo loadTap_regcaballoByORMID(PersistentSession session, int rc_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_regcaballo getTap_regcaballoByORMID(PersistentSession session, int rc_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_regcaballo[] listTap_regcaballoByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_regcaballo[] listTap_regcaballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_regcaballo[] listTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_regcaballo[] listTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_regcaballo loadTap_regcaballoByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_regcaballo loadTap_regcaballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_regcaballo loadTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_regcaballo loadTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_regcaballo createTap_regcaballo();
	public boolean save(orm.Tap_regcaballo tap_regcaballo) throws PersistentException;
	public boolean delete(orm.Tap_regcaballo tap_regcaballo) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_regcaballo tap_regcaballo) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_regcaballo tap_regcaballo, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Tap_regcaballo tap_regcaballo) throws PersistentException;
	public boolean evict(orm.Tap_regcaballo tap_regcaballo) throws PersistentException;
	public Tap_regcaballo loadTap_regcaballoByCriteria(Tap_regcaballoCriteria tap_regcaballoCriteria);
	public Tap_regcaballo[] listTap_regcaballoByCriteria(Tap_regcaballoCriteria tap_regcaballoCriteria);
}
