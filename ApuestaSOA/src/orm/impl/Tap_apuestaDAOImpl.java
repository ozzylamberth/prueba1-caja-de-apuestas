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

public class Tap_apuestaDAOImpl implements orm.dao.Tap_apuestaDAO {
	public Tap_apuesta loadTap_apuestaByORMID(int apu_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_apuestaByORMID(session, apu_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta getTap_apuestaByORMID(int apu_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_apuestaByORMID(session, apu_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta loadTap_apuestaByORMID(int apu_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_apuestaByORMID(session, apu_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta getTap_apuestaByORMID(int apu_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_apuestaByORMID(session, apu_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta loadTap_apuestaByORMID(PersistentSession session, int apu_id) throws PersistentException {
		try {
			return (Tap_apuesta) session.load(orm.Tap_apuesta.class, new Integer(apu_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta getTap_apuestaByORMID(PersistentSession session, int apu_id) throws PersistentException {
		try {
			return (Tap_apuesta) session.get(orm.Tap_apuesta.class, new Integer(apu_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta loadTap_apuestaByORMID(PersistentSession session, int apu_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_apuesta) session.load(orm.Tap_apuesta.class, new Integer(apu_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta getTap_apuestaByORMID(PersistentSession session, int apu_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_apuesta) session.get(orm.Tap_apuesta.class, new Integer(apu_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta[] listTap_apuestaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_apuestaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta[] listTap_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_apuestaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta[] listTap_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_apuesta as Tap_apuesta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Tap_apuesta[]) list.toArray(new Tap_apuesta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta[] listTap_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_apuesta as Tap_apuesta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Tap_apuesta[]) list.toArray(new Tap_apuesta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta loadTap_apuestaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_apuestaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta loadTap_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_apuestaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta loadTap_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tap_apuesta[] tap_apuestas = listTap_apuestaByQuery(session, condition, orderBy);
		if (tap_apuestas != null && tap_apuestas.length > 0)
			return tap_apuestas[0];
		else
			return null;
	}
	
	public Tap_apuesta loadTap_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tap_apuesta[] tap_apuestas = listTap_apuestaByQuery(session, condition, orderBy, lockMode);
		if (tap_apuestas != null && tap_apuestas.length > 0)
			return tap_apuestas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTap_apuestaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_apuestaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_apuestaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_apuesta as Tap_apuesta");
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
	
	public static java.util.Iterator iterateTap_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_apuesta as Tap_apuesta");
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
	
	public Tap_apuesta createTap_apuesta() {
		return new orm.Tap_apuesta();
	}
	
	public boolean save(orm.Tap_apuesta tap_apuesta) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().saveObject(tap_apuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Tap_apuesta tap_apuesta) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().deleteObject(tap_apuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_apuesta tap_apuesta)throws PersistentException {
		try {
			if(tap_apuesta.getTap_regcarrcabrcc() != null) {
				tap_apuesta.getTap_regcarrcabrcc().tap_apuesta.remove(tap_apuesta);
			}
			
			if(tap_apuesta.getTap_cajacaj() != null) {
				tap_apuesta.getTap_cajacaj().tap_apuesta.remove(tap_apuesta);
			}
			
			return delete(tap_apuesta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_apuesta tap_apuesta, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(tap_apuesta.getTap_regcarrcabrcc() != null) {
				tap_apuesta.getTap_regcarrcabrcc().tap_apuesta.remove(tap_apuesta);
			}
			
			if(tap_apuesta.getTap_cajacaj() != null) {
				tap_apuesta.getTap_cajacaj().tap_apuesta.remove(tap_apuesta);
			}
			
			try {
				session.delete(tap_apuesta);
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
	
	public boolean refresh(orm.Tap_apuesta tap_apuesta) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().refresh(tap_apuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Tap_apuesta tap_apuesta) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().evict(tap_apuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_apuesta loadTap_apuestaByCriteria(Tap_apuestaCriteria tap_apuestaCriteria) {
		Tap_apuesta[] tap_apuestas = listTap_apuestaByCriteria(tap_apuestaCriteria);
		if(tap_apuestas == null || tap_apuestas.length == 0) {
			return null;
		}
		return tap_apuestas[0];
	}
	
	public Tap_apuesta[] listTap_apuestaByCriteria(Tap_apuestaCriteria tap_apuestaCriteria) {
		return tap_apuestaCriteria.listTap_apuesta();
	}
}
