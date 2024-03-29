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

public interface Tap_cajaDAO {
	public Tap_caja loadTap_cajaByORMID(int caj_id) throws PersistentException;
	public Tap_caja getTap_cajaByORMID(int caj_id) throws PersistentException;
	public Tap_caja loadTap_cajaByORMID(int caj_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caja getTap_cajaByORMID(int caj_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caja loadTap_cajaByORMID(PersistentSession session, int caj_id) throws PersistentException;
	public Tap_caja getTap_cajaByORMID(PersistentSession session, int caj_id) throws PersistentException;
	public Tap_caja loadTap_cajaByORMID(PersistentSession session, int caj_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caja getTap_cajaByORMID(PersistentSession session, int caj_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caja[] listTap_cajaByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_caja[] listTap_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caja[] listTap_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_caja[] listTap_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caja loadTap_cajaByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_caja loadTap_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caja loadTap_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_caja loadTap_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caja createTap_caja();
	public boolean save(orm.Tap_caja tap_caja) throws PersistentException;
	public boolean delete(orm.Tap_caja tap_caja) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_caja tap_caja) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_caja tap_caja, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Tap_caja tap_caja) throws PersistentException;
	public boolean evict(orm.Tap_caja tap_caja) throws PersistentException;
	public Tap_caja loadTap_cajaByCriteria(Tap_cajaCriteria tap_cajaCriteria);
	public Tap_caja[] listTap_cajaByCriteria(Tap_cajaCriteria tap_cajaCriteria);
}
