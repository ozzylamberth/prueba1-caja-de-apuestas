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

public class Tap_regcaballoDAOImpl implements orm.dao.Tap_regcaballoDAO {
	public Tap_regcaballo loadTap_regcaballoByORMID(int rc_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_regcaballoByORMID(session, rc_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo getTap_regcaballoByORMID(int rc_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_regcaballoByORMID(session, rc_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo loadTap_regcaballoByORMID(int rc_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_regcaballoByORMID(session, rc_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo getTap_regcaballoByORMID(int rc_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_regcaballoByORMID(session, rc_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo loadTap_regcaballoByORMID(PersistentSession session, int rc_id) throws PersistentException {
		try {
			return (Tap_regcaballo) session.load(orm.Tap_regcaballo.class, new Integer(rc_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo getTap_regcaballoByORMID(PersistentSession session, int rc_id) throws PersistentException {
		try {
			return (Tap_regcaballo) session.get(orm.Tap_regcaballo.class, new Integer(rc_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo loadTap_regcaballoByORMID(PersistentSession session, int rc_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_regcaballo) session.load(orm.Tap_regcaballo.class, new Integer(rc_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo getTap_regcaballoByORMID(PersistentSession session, int rc_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_regcaballo) session.get(orm.Tap_regcaballo.class, new Integer(rc_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo[] listTap_regcaballoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_regcaballoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo[] listTap_regcaballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_regcaballoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo[] listTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_regcaballo as Tap_regcaballo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Tap_regcaballo[]) list.toArray(new Tap_regcaballo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo[] listTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_regcaballo as Tap_regcaballo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Tap_regcaballo[]) list.toArray(new Tap_regcaballo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo loadTap_regcaballoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_regcaballoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo loadTap_regcaballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_regcaballoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo loadTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tap_regcaballo[] tap_regcaballos = listTap_regcaballoByQuery(session, condition, orderBy);
		if (tap_regcaballos != null && tap_regcaballos.length > 0)
			return tap_regcaballos[0];
		else
			return null;
	}
	
	public Tap_regcaballo loadTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tap_regcaballo[] tap_regcaballos = listTap_regcaballoByQuery(session, condition, orderBy, lockMode);
		if (tap_regcaballos != null && tap_regcaballos.length > 0)
			return tap_regcaballos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTap_regcaballoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_regcaballoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_regcaballoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_regcaballoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_regcaballo as Tap_regcaballo");
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
	
	public static java.util.Iterator iterateTap_regcaballoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_regcaballo as Tap_regcaballo");
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
	
	public Tap_regcaballo createTap_regcaballo() {
		return new orm.Tap_regcaballo();
	}
	
	public boolean save(orm.Tap_regcaballo tap_regcaballo) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().saveObject(tap_regcaballo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Tap_regcaballo tap_regcaballo) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().deleteObject(tap_regcaballo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_regcaballo tap_regcaballo)throws PersistentException {
		try {
			if(tap_regcaballo.getTap_caballocab() != null) {
				tap_regcaballo.getTap_caballocab().tap_regcarrcab.remove(tap_regcaballo);
			}
			
			if(tap_regcaballo.getTap_carreracar() != null) {
				tap_regcaballo.getTap_carreracar().tap_regcarrcab.remove(tap_regcaballo);
			}
			
			orm.Tap_apuesta[] lTap_apuestas = tap_regcaballo.tap_apuesta.toArray();
			for(int i = 0; i < lTap_apuestas.length; i++) {
				lTap_apuestas[i].setTap_regcarrcabrcc(null);
			}
			return delete(tap_regcaballo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_regcaballo tap_regcaballo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(tap_regcaballo.getTap_caballocab() != null) {
				tap_regcaballo.getTap_caballocab().tap_regcarrcab.remove(tap_regcaballo);
			}
			
			if(tap_regcaballo.getTap_carreracar() != null) {
				tap_regcaballo.getTap_carreracar().tap_regcarrcab.remove(tap_regcaballo);
			}
			
			orm.Tap_apuesta[] lTap_apuestas = tap_regcaballo.tap_apuesta.toArray();
			for(int i = 0; i < lTap_apuestas.length; i++) {
				lTap_apuestas[i].setTap_regcarrcabrcc(null);
			}
			try {
				session.delete(tap_regcaballo);
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
	
	public boolean refresh(orm.Tap_regcaballo tap_regcaballo) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().refresh(tap_regcaballo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Tap_regcaballo tap_regcaballo) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().evict(tap_regcaballo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_regcaballo loadTap_regcaballoByCriteria(Tap_regcaballoCriteria tap_regcaballoCriteria) {
		Tap_regcaballo[] tap_regcaballos = listTap_regcaballoByCriteria(tap_regcaballoCriteria);
		if(tap_regcaballos == null || tap_regcaballos.length == 0) {
			return null;
		}
		return tap_regcaballos[0];
	}
	
	public Tap_regcaballo[] listTap_regcaballoByCriteria(Tap_regcaballoCriteria tap_regcaballoCriteria) {
		return tap_regcaballoCriteria.listTap_regcaballo();
	}
}
