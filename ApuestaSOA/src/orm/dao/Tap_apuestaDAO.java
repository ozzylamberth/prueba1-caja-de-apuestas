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

public interface Tap_apuestaDAO {
	public Tap_apuesta loadTap_apuestaByORMID(int apu_id) throws PersistentException;
	public Tap_apuesta getTap_apuestaByORMID(int apu_id) throws PersistentException;
	public Tap_apuesta loadTap_apuestaByORMID(int apu_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_apuesta getTap_apuestaByORMID(int apu_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_apuesta loadTap_apuestaByORMID(PersistentSession session, int apu_id) throws PersistentException;
	public Tap_apuesta getTap_apuestaByORMID(PersistentSession session, int apu_id) throws PersistentException;
	public Tap_apuesta loadTap_apuestaByORMID(PersistentSession session, int apu_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_apuesta getTap_apuestaByORMID(PersistentSession session, int apu_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_apuesta[] listTap_apuestaByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_apuesta[] listTap_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_apuesta[] listTap_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_apuesta[] listTap_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_apuesta loadTap_apuestaByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_apuesta loadTap_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_apuesta loadTap_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_apuesta loadTap_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_apuesta createTap_apuesta();
	public boolean save(orm.Tap_apuesta tap_apuesta) throws PersistentException;
	public boolean delete(orm.Tap_apuesta tap_apuesta) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_apuesta tap_apuesta) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_apuesta tap_apuesta, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Tap_apuesta tap_apuesta) throws PersistentException;
	public boolean evict(orm.Tap_apuesta tap_apuesta) throws PersistentException;
	public Tap_apuesta loadTap_apuestaByCriteria(Tap_apuestaCriteria tap_apuestaCriteria);
	public Tap_apuesta[] listTap_apuestaByCriteria(Tap_apuestaCriteria tap_apuestaCriteria);
}
