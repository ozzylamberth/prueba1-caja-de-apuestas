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

public class Tap_logDAOImpl implements orm.dao.Tap_logDAO {
	public Tap_log loadTap_logByORMID(int log_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_logByORMID(session, log_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log getTap_logByORMID(int log_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_logByORMID(session, log_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log loadTap_logByORMID(int log_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_logByORMID(session, log_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log getTap_logByORMID(int log_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_logByORMID(session, log_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log loadTap_logByORMID(PersistentSession session, int log_id) throws PersistentException {
		try {
			return (Tap_log) session.load(orm.Tap_log.class, new Integer(log_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log getTap_logByORMID(PersistentSession session, int log_id) throws PersistentException {
		try {
			return (Tap_log) session.get(orm.Tap_log.class, new Integer(log_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log loadTap_logByORMID(PersistentSession session, int log_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_log) session.load(orm.Tap_log.class, new Integer(log_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log getTap_logByORMID(PersistentSession session, int log_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_log) session.get(orm.Tap_log.class, new Integer(log_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log[] listTap_logByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_logByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log[] listTap_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_logByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log[] listTap_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_log as Tap_log");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Tap_log[]) list.toArray(new Tap_log[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log[] listTap_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_log as Tap_log");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Tap_log[]) list.toArray(new Tap_log[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log loadTap_logByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_logByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log loadTap_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_logByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log loadTap_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tap_log[] tap_logs = listTap_logByQuery(session, condition, orderBy);
		if (tap_logs != null && tap_logs.length > 0)
			return tap_logs[0];
		else
			return null;
	}
	
	public Tap_log loadTap_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tap_log[] tap_logs = listTap_logByQuery(session, condition, orderBy, lockMode);
		if (tap_logs != null && tap_logs.length > 0)
			return tap_logs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTap_logByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_logByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_logByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_log as Tap_log");
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
	
	public static java.util.Iterator iterateTap_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_log as Tap_log");
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
	
	public Tap_log createTap_log() {
		return new orm.Tap_log();
	}
	
	public boolean save(orm.Tap_log tap_log) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().saveObject(tap_log);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Tap_log tap_log) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().deleteObject(tap_log);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(orm.Tap_log tap_log) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().refresh(tap_log);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Tap_log tap_log) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().evict(tap_log);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_log loadTap_logByCriteria(Tap_logCriteria tap_logCriteria) {
		Tap_log[] tap_logs = listTap_logByCriteria(tap_logCriteria);
		if(tap_logs == null || tap_logs.length == 0) {
			return null;
		}
		return tap_logs[0];
	}
	
	public Tap_log[] listTap_logByCriteria(Tap_logCriteria tap_logCriteria) {
		return tap_logCriteria.listTap_log();
	}
}
