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

public interface Tap_caballoDAO {
	public Tap_caballo loadTap_caballoByORMID(int cab_id) throws PersistentException;
	public Tap_caballo getTap_caballoByORMID(int cab_id) throws PersistentException;
	public Tap_caballo loadTap_caballoByORMID(int cab_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caballo getTap_caballoByORMID(int cab_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caballo loadTap_caballoByORMID(PersistentSession session, int cab_id) throws PersistentException;
	public Tap_caballo getTap_caballoByORMID(PersistentSession session, int cab_id) throws PersistentException;
	public Tap_caballo loadTap_caballoByORMID(PersistentSession session, int cab_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caballo getTap_caballoByORMID(PersistentSession session, int cab_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caballo[] listTap_caballoByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_caballo[] listTap_caballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caballo[] listTap_caballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_caballo[] listTap_caballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caballo loadTap_caballoByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_caballo loadTap_caballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caballo loadTap_caballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_caballo loadTap_caballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_caballo createTap_caballo();
	public boolean save(orm.Tap_caballo tap_caballo) throws PersistentException;
	public boolean delete(orm.Tap_caballo tap_caballo) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_caballo tap_caballo) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_caballo tap_caballo, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Tap_caballo tap_caballo) throws PersistentException;
	public boolean evict(orm.Tap_caballo tap_caballo) throws PersistentException;
	public Tap_caballo loadTap_caballoByCriteria(Tap_caballoCriteria tap_caballoCriteria);
	public Tap_caballo[] listTap_caballoByCriteria(Tap_caballoCriteria tap_caballoCriteria);
}
