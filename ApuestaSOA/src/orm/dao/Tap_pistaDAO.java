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

public interface Tap_pistaDAO {
	public Tap_pista loadTap_pistaByORMID(int pis_id) throws PersistentException;
	public Tap_pista getTap_pistaByORMID(int pis_id) throws PersistentException;
	public Tap_pista loadTap_pistaByORMID(int pis_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_pista getTap_pistaByORMID(int pis_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_pista loadTap_pistaByORMID(PersistentSession session, int pis_id) throws PersistentException;
	public Tap_pista getTap_pistaByORMID(PersistentSession session, int pis_id) throws PersistentException;
	public Tap_pista loadTap_pistaByORMID(PersistentSession session, int pis_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_pista getTap_pistaByORMID(PersistentSession session, int pis_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_pista[] listTap_pistaByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_pista[] listTap_pistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_pista[] listTap_pistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_pista[] listTap_pistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_pista loadTap_pistaByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_pista loadTap_pistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_pista loadTap_pistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_pista loadTap_pistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_pista createTap_pista();
	public boolean save(orm.Tap_pista tap_pista) throws PersistentException;
	public boolean delete(orm.Tap_pista tap_pista) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_pista tap_pista) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_pista tap_pista, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Tap_pista tap_pista) throws PersistentException;
	public boolean evict(orm.Tap_pista tap_pista) throws PersistentException;
	public Tap_pista loadTap_pistaByCriteria(Tap_pistaCriteria tap_pistaCriteria);
	public Tap_pista[] listTap_pistaByCriteria(Tap_pistaCriteria tap_pistaCriteria);
}
