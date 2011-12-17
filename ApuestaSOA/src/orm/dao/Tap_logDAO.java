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

public interface Tap_logDAO {
	public Tap_log loadTap_logByORMID(int log_id) throws PersistentException;
	public Tap_log getTap_logByORMID(int log_id) throws PersistentException;
	public Tap_log loadTap_logByORMID(int log_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_log getTap_logByORMID(int log_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_log loadTap_logByORMID(PersistentSession session, int log_id) throws PersistentException;
	public Tap_log getTap_logByORMID(PersistentSession session, int log_id) throws PersistentException;
	public Tap_log loadTap_logByORMID(PersistentSession session, int log_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_log getTap_logByORMID(PersistentSession session, int log_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_log[] listTap_logByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_log[] listTap_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_log[] listTap_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_log[] listTap_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_log loadTap_logByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_log loadTap_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_log loadTap_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_log loadTap_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_log createTap_log();
	public boolean save(orm.Tap_log tap_log) throws PersistentException;
	public boolean delete(orm.Tap_log tap_log) throws PersistentException;
	public boolean refresh(orm.Tap_log tap_log) throws PersistentException;
	public boolean evict(orm.Tap_log tap_log) throws PersistentException;
	public Tap_log loadTap_logByCriteria(Tap_logCriteria tap_logCriteria);
	public Tap_log[] listTap_logByCriteria(Tap_logCriteria tap_logCriteria);
}
