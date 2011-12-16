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

public interface Tap_carreraDAO {
	public Tap_carrera loadTap_carreraByORMID(int car_id) throws PersistentException;
	public Tap_carrera getTap_carreraByORMID(int car_id) throws PersistentException;
	public Tap_carrera loadTap_carreraByORMID(int car_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_carrera getTap_carreraByORMID(int car_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_carrera loadTap_carreraByORMID(PersistentSession session, int car_id) throws PersistentException;
	public Tap_carrera getTap_carreraByORMID(PersistentSession session, int car_id) throws PersistentException;
	public Tap_carrera loadTap_carreraByORMID(PersistentSession session, int car_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_carrera getTap_carreraByORMID(PersistentSession session, int car_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_carrera[] listTap_carreraByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_carrera[] listTap_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_carrera[] listTap_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_carrera[] listTap_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_carrera loadTap_carreraByQuery(String condition, String orderBy) throws PersistentException;
	public Tap_carrera loadTap_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_carrera loadTap_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tap_carrera loadTap_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tap_carrera createTap_carrera();
	public boolean save(orm.Tap_carrera tap_carrera) throws PersistentException;
	public boolean delete(orm.Tap_carrera tap_carrera) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_carrera tap_carrera) throws PersistentException;
	public boolean deleteAndDissociate(orm.Tap_carrera tap_carrera, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Tap_carrera tap_carrera) throws PersistentException;
	public boolean evict(orm.Tap_carrera tap_carrera) throws PersistentException;
	public Tap_carrera loadTap_carreraByCriteria(Tap_carreraCriteria tap_carreraCriteria);
	public Tap_carrera[] listTap_carreraByCriteria(Tap_carreraCriteria tap_carreraCriteria);
}
