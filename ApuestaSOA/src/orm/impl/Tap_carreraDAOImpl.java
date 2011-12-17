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
package orm.impl;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;
import orm.*;

public class Tap_carreraDAOImpl implements orm.dao.Tap_carreraDAO {
	public Tap_carrera loadTap_carreraByORMID(int car_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_carreraByORMID(session, car_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera getTap_carreraByORMID(int car_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_carreraByORMID(session, car_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera loadTap_carreraByORMID(int car_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_carreraByORMID(session, car_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera getTap_carreraByORMID(int car_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_carreraByORMID(session, car_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera loadTap_carreraByORMID(PersistentSession session, int car_id) throws PersistentException {
		try {
			return (Tap_carrera) session.load(orm.Tap_carrera.class, new Integer(car_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera getTap_carreraByORMID(PersistentSession session, int car_id) throws PersistentException {
		try {
			return (Tap_carrera) session.get(orm.Tap_carrera.class, new Integer(car_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera loadTap_carreraByORMID(PersistentSession session, int car_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_carrera) session.load(orm.Tap_carrera.class, new Integer(car_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera getTap_carreraByORMID(PersistentSession session, int car_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_carrera) session.get(orm.Tap_carrera.class, new Integer(car_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera[] listTap_carreraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_carreraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera[] listTap_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_carreraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera[] listTap_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_carrera as Tap_carrera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Tap_carrera[]) list.toArray(new Tap_carrera[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera[] listTap_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_carrera as Tap_carrera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Tap_carrera[]) list.toArray(new Tap_carrera[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera loadTap_carreraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_carreraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera loadTap_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_carreraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera loadTap_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tap_carrera[] tap_carreras = listTap_carreraByQuery(session, condition, orderBy);
		if (tap_carreras != null && tap_carreras.length > 0)
			return tap_carreras[0];
		else
			return null;
	}
	
	public Tap_carrera loadTap_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tap_carrera[] tap_carreras = listTap_carreraByQuery(session, condition, orderBy, lockMode);
		if (tap_carreras != null && tap_carreras.length > 0)
			return tap_carreras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTap_carreraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_carreraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_carreraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_carrera as Tap_carrera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_carrera as Tap_carrera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera createTap_carrera() {
		return new orm.Tap_carrera();
	}
	
	public boolean save(orm.Tap_carrera tap_carrera) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().saveObject(tap_carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Tap_carrera tap_carrera) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().deleteObject(tap_carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_carrera tap_carrera)throws PersistentException {
		try {
			if(tap_carrera.getTap_pistapis() != null) {
				tap_carrera.getTap_pistapis().tap_carrera.remove(tap_carrera);
			}
			
			orm.Tap_regcaballo[] lTap_regcarrcabs = tap_carrera.tap_regcarrcab.toArray();
			for(int i = 0; i < lTap_regcarrcabs.length; i++) {
				lTap_regcarrcabs[i].setTap_carreracar(null);
			}
			return delete(tap_carrera);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_carrera tap_carrera, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(tap_carrera.getTap_pistapis() != null) {
				tap_carrera.getTap_pistapis().tap_carrera.remove(tap_carrera);
			}
			
			orm.Tap_regcaballo[] lTap_regcarrcabs = tap_carrera.tap_regcarrcab.toArray();
			for(int i = 0; i < lTap_regcarrcabs.length; i++) {
				lTap_regcarrcabs[i].setTap_carreracar(null);
			}
			try {
				session.delete(tap_carrera);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(orm.Tap_carrera tap_carrera) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().refresh(tap_carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Tap_carrera tap_carrera) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().evict(tap_carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_carrera loadTap_carreraByCriteria(Tap_carreraCriteria tap_carreraCriteria) {
		Tap_carrera[] tap_carreras = listTap_carreraByCriteria(tap_carreraCriteria);
		if(tap_carreras == null || tap_carreras.length == 0) {
			return null;
		}
		return tap_carreras[0];
	}
	
	public Tap_carrera[] listTap_carreraByCriteria(Tap_carreraCriteria tap_carreraCriteria) {
		return tap_carreraCriteria.listTap_carrera();
	}
}
