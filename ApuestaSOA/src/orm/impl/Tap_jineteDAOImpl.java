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

public class Tap_jineteDAOImpl implements orm.dao.Tap_jineteDAO {
	public Tap_jinete loadTap_jineteByORMID(int jin_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_jineteByORMID(session, jin_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete getTap_jineteByORMID(int jin_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_jineteByORMID(session, jin_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete loadTap_jineteByORMID(int jin_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_jineteByORMID(session, jin_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete getTap_jineteByORMID(int jin_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_jineteByORMID(session, jin_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete loadTap_jineteByORMID(PersistentSession session, int jin_id) throws PersistentException {
		try {
			return (Tap_jinete) session.load(orm.Tap_jinete.class, new Integer(jin_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete getTap_jineteByORMID(PersistentSession session, int jin_id) throws PersistentException {
		try {
			return (Tap_jinete) session.get(orm.Tap_jinete.class, new Integer(jin_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete loadTap_jineteByORMID(PersistentSession session, int jin_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_jinete) session.load(orm.Tap_jinete.class, new Integer(jin_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete getTap_jineteByORMID(PersistentSession session, int jin_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_jinete) session.get(orm.Tap_jinete.class, new Integer(jin_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete[] listTap_jineteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_jineteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete[] listTap_jineteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_jineteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete[] listTap_jineteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_jinete as Tap_jinete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Tap_jinete[]) list.toArray(new Tap_jinete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete[] listTap_jineteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_jinete as Tap_jinete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Tap_jinete[]) list.toArray(new Tap_jinete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete loadTap_jineteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_jineteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete loadTap_jineteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_jineteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete loadTap_jineteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tap_jinete[] tap_jinetes = listTap_jineteByQuery(session, condition, orderBy);
		if (tap_jinetes != null && tap_jinetes.length > 0)
			return tap_jinetes[0];
		else
			return null;
	}
	
	public Tap_jinete loadTap_jineteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tap_jinete[] tap_jinetes = listTap_jineteByQuery(session, condition, orderBy, lockMode);
		if (tap_jinetes != null && tap_jinetes.length > 0)
			return tap_jinetes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTap_jineteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_jineteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_jineteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_jineteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_jineteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_jinete as Tap_jinete");
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
	
	public static java.util.Iterator iterateTap_jineteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_jinete as Tap_jinete");
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
	
	public Tap_jinete createTap_jinete() {
		return new orm.Tap_jinete();
	}
	
	public boolean save(orm.Tap_jinete tap_jinete) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().saveObject(tap_jinete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Tap_jinete tap_jinete) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().deleteObject(tap_jinete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_jinete tap_jinete)throws PersistentException {
		try {
			if(tap_jinete.getTap_caballo() != null) {
				tap_jinete.getTap_caballo().setTap_jinetejin(null);
			}
			
			return delete(tap_jinete);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_jinete tap_jinete, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(tap_jinete.getTap_caballo() != null) {
				tap_jinete.getTap_caballo().setTap_jinetejin(null);
			}
			
			try {
				session.delete(tap_jinete);
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
	
	public boolean refresh(orm.Tap_jinete tap_jinete) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().refresh(tap_jinete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Tap_jinete tap_jinete) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().evict(tap_jinete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_jinete loadTap_jineteByCriteria(Tap_jineteCriteria tap_jineteCriteria) {
		Tap_jinete[] tap_jinetes = listTap_jineteByCriteria(tap_jineteCriteria);
		if(tap_jinetes == null || tap_jinetes.length == 0) {
			return null;
		}
		return tap_jinetes[0];
	}
	
	public Tap_jinete[] listTap_jineteByCriteria(Tap_jineteCriteria tap_jineteCriteria) {
		return tap_jineteCriteria.listTap_jinete();
	}
}
