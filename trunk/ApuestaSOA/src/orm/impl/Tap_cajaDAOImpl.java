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

public class Tap_cajaDAOImpl implements orm.dao.Tap_cajaDAO {
	public Tap_caja loadTap_cajaByORMID(int caj_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_cajaByORMID(session, caj_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja getTap_cajaByORMID(int caj_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_cajaByORMID(session, caj_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja loadTap_cajaByORMID(int caj_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_cajaByORMID(session, caj_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja getTap_cajaByORMID(int caj_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_cajaByORMID(session, caj_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja loadTap_cajaByORMID(PersistentSession session, int caj_id) throws PersistentException {
		try {
			return (Tap_caja) session.load(orm.Tap_caja.class, new Integer(caj_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja getTap_cajaByORMID(PersistentSession session, int caj_id) throws PersistentException {
		try {
			return (Tap_caja) session.get(orm.Tap_caja.class, new Integer(caj_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja loadTap_cajaByORMID(PersistentSession session, int caj_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_caja) session.load(orm.Tap_caja.class, new Integer(caj_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja getTap_cajaByORMID(PersistentSession session, int caj_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_caja) session.get(orm.Tap_caja.class, new Integer(caj_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja[] listTap_cajaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_cajaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja[] listTap_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_cajaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja[] listTap_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_caja as Tap_caja");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Tap_caja[]) list.toArray(new Tap_caja[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja[] listTap_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_caja as Tap_caja");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Tap_caja[]) list.toArray(new Tap_caja[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja loadTap_cajaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_cajaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja loadTap_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_cajaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja loadTap_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tap_caja[] tap_cajas = listTap_cajaByQuery(session, condition, orderBy);
		if (tap_cajas != null && tap_cajas.length > 0)
			return tap_cajas[0];
		else
			return null;
	}
	
	public Tap_caja loadTap_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tap_caja[] tap_cajas = listTap_cajaByQuery(session, condition, orderBy, lockMode);
		if (tap_cajas != null && tap_cajas.length > 0)
			return tap_cajas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTap_cajaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_cajaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_cajaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_caja as Tap_caja");
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
	
	public static java.util.Iterator iterateTap_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_caja as Tap_caja");
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
	
	public Tap_caja createTap_caja() {
		return new orm.Tap_caja();
	}
	
	public boolean save(orm.Tap_caja tap_caja) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().saveObject(tap_caja);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Tap_caja tap_caja) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().deleteObject(tap_caja);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_caja tap_caja)throws PersistentException {
		try {
			orm.Tap_apuesta[] lTap_apuestas = tap_caja.tap_apuesta.toArray();
			for(int i = 0; i < lTap_apuestas.length; i++) {
				lTap_apuestas[i].setTap_cajacaj(null);
			}
			return delete(tap_caja);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_caja tap_caja, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Tap_apuesta[] lTap_apuestas = tap_caja.tap_apuesta.toArray();
			for(int i = 0; i < lTap_apuestas.length; i++) {
				lTap_apuestas[i].setTap_cajacaj(null);
			}
			try {
				session.delete(tap_caja);
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
	
	public boolean refresh(orm.Tap_caja tap_caja) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().refresh(tap_caja);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Tap_caja tap_caja) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().evict(tap_caja);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_caja loadTap_cajaByCriteria(Tap_cajaCriteria tap_cajaCriteria) {
		Tap_caja[] tap_cajas = listTap_cajaByCriteria(tap_cajaCriteria);
		if(tap_cajas == null || tap_cajas.length == 0) {
			return null;
		}
		return tap_cajas[0];
	}
	
	public Tap_caja[] listTap_cajaByCriteria(Tap_cajaCriteria tap_cajaCriteria) {
		return tap_cajaCriteria.listTap_caja();
	}
}
