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

public interface Tap_jineteDAO {
	public Tap_jinete loadTap_jineteByORMID(int jin_id) throws PersistentException;
	public Tap_jinete getTap_jineteByORMID(int jin_id) throws PersistentException;
	public Tap_jinete loadTap_jineteByORMID(int jin_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_jinete getTap_jineteByORMID(int jin_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_jinete loadTap_jineteByORMID(PersistentSession session, int jin_id) throws PersistentException;
	public Tap_jinete getTap_jineteByORMID(PersistentSession session, int jin_id) throws PersistentException;
	public Tap_jinete loadTap_jineteByORMID(PersistentSession session, int jin_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_jinete getTap_jineteByORMID(PersistentSession session, int jin_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_jinete[] listTap_jineteByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_jinete[] listTap_jineteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_jinete[] listTap_jineteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_jinete[] listTap_jineteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_jinete loadTap_jineteByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_jinete loadTap_jineteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_jinete loadTap_jineteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_jinete loadTap_jineteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_jinete createTap_jinete();
	public boolean save(orm.Tap_jinete tap_jinete) throws PersistentException;
	public boolean delete(orm.Tap_jinete tap_jinete) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_jinete tap_jinete) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_jinete tap_jinete, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Tap_jinete tap_jinete) throws PersistentException;
	public boolean evict(orm.Tap_jinete tap_jinete) throws PersistentException;
	public Tap_jinete loadTap_jineteByCriteria(Tap_jineteCriteria tap_jineteCriteria);
	public Tap_jinete[] listTap_jineteByCriteria(Tap_jineteCriteria tap_jineteCriteria);
}
