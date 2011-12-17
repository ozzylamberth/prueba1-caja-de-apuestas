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

public class Tap_caballoDAOImpl implements orm.dao.Tap_caballoDAO {
	public Tap_caballo loadTap_caballoByORMID(int cab_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_caballoByORMID(session, cab_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo getTap_caballoByORMID(int cab_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_caballoByORMID(session, cab_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo loadTap_caballoByORMID(int cab_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_caballoByORMID(session, cab_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo getTap_caballoByORMID(int cab_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_caballoByORMID(session, cab_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo loadTap_caballoByORMID(PersistentSession session, int cab_id) throws PersistentException {
		try {
			return (Tap_caballo) session.load(orm.Tap_caballo.class, new Integer(cab_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo getTap_caballoByORMID(PersistentSession session, int cab_id) throws PersistentException {
		try {
			return (Tap_caballo) session.get(orm.Tap_caballo.class, new Integer(cab_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo loadTap_caballoByORMID(PersistentSession session, int cab_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_caballo) session.load(orm.Tap_caballo.class, new Integer(cab_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo getTap_caballoByORMID(PersistentSession session, int cab_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_caballo) session.get(orm.Tap_caballo.class, new Integer(cab_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo[] listTap_caballoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_caballoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo[] listTap_caballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_caballoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo[] listTap_caballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_caballo as Tap_caballo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Tap_caballo[]) list.toArray(new Tap_caballo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo[] listTap_caballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_caballo as Tap_caballo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Tap_caballo[]) list.toArray(new Tap_caballo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo loadTap_caballoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_caballoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo loadTap_caballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_caballoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo loadTap_caballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tap_caballo[] tap_caballos = listTap_caballoByQuery(session, condition, orderBy);
		if (tap_caballos != null && tap_caballos.length > 0)
			return tap_caballos[0];
		else
			return null;
	}
	
	public Tap_caballo loadTap_caballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tap_caballo[] tap_caballos = listTap_caballoByQuery(session, condition, orderBy, lockMode);
		if (tap_caballos != null && tap_caballos.length > 0)
			return tap_caballos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTap_caballoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_caballoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_caballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_caballoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_caballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_caballo as Tap_caballo");
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
	
	public static java.util.Iterator iterateTap_caballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_caballo as Tap_caballo");
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
	
	public Tap_caballo createTap_caballo() {
		return new orm.Tap_caballo();
	}
	
	public boolean save(orm.Tap_caballo tap_caballo) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().saveObject(tap_caballo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Tap_caballo tap_caballo) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().deleteObject(tap_caballo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_caballo tap_caballo)throws PersistentException {
		try {
			if(tap_caballo.getTap_jinetejin() != null) {
				tap_caballo.getTap_jinetejin().setTap_caballo(null);
			}
			
			orm.Tap_regcaballo[] lTap_regcarrcabs = tap_caballo.tap_regcarrcab.toArray();
			for(int i = 0; i < lTap_regcarrcabs.length; i++) {
				lTap_regcarrcabs[i].setTap_caballocab(null);
			}
			return delete(tap_caballo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_caballo tap_caballo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(tap_caballo.getTap_jinetejin() != null) {
				tap_caballo.getTap_jinetejin().setTap_caballo(null);
			}
			
			orm.Tap_regcaballo[] lTap_regcarrcabs = tap_caballo.tap_regcarrcab.toArray();
			for(int i = 0; i < lTap_regcarrcabs.length; i++) {
				lTap_regcarrcabs[i].setTap_caballocab(null);
			}
			try {
				session.delete(tap_caballo);
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
	
	public boolean refresh(orm.Tap_caballo tap_caballo) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().refresh(tap_caballo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Tap_caballo tap_caballo) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().evict(tap_caballo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caballo loadTap_caballoByCriteria(Tap_caballoCriteria tap_caballoCriteria) {
		Tap_caballo[] tap_caballos = listTap_caballoByCriteria(tap_caballoCriteria);
		if(tap_caballos == null || tap_caballos.length == 0) {
			return null;
		}
		return tap_caballos[0];
	}
	
	public Tap_caballo[] listTap_caballoByCriteria(Tap_caballoCriteria tap_caballoCriteria) {
		return tap_caballoCriteria.listTap_caballo();
	}
}
