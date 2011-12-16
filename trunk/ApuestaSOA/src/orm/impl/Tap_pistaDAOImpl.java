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

public class Tap_pistaDAOImpl implements orm.dao.Tap_pistaDAO {
	public Tap_pista loadTap_pistaByORMID(int pis_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_pistaByORMID(session, pis_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista getTap_pistaByORMID(int pis_id) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_pistaByORMID(session, pis_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista loadTap_pistaByORMID(int pis_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_pistaByORMID(session, pis_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista getTap_pistaByORMID(int pis_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return getTap_pistaByORMID(session, pis_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista loadTap_pistaByORMID(PersistentSession session, int pis_id) throws PersistentException {
		try {
			return (Tap_pista) session.load(orm.Tap_pista.class, new Integer(pis_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista getTap_pistaByORMID(PersistentSession session, int pis_id) throws PersistentException {
		try {
			return (Tap_pista) session.get(orm.Tap_pista.class, new Integer(pis_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista loadTap_pistaByORMID(PersistentSession session, int pis_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_pista) session.load(orm.Tap_pista.class, new Integer(pis_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista getTap_pistaByORMID(PersistentSession session, int pis_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tap_pista) session.get(orm.Tap_pista.class, new Integer(pis_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista[] listTap_pistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_pistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista[] listTap_pistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return listTap_pistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista[] listTap_pistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_pista as Tap_pista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Tap_pista[]) list.toArray(new Tap_pista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista[] listTap_pistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_pista as Tap_pista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Tap_pista[]) list.toArray(new Tap_pista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista loadTap_pistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_pistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista loadTap_pistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return loadTap_pistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista loadTap_pistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tap_pista[] tap_pistas = listTap_pistaByQuery(session, condition, orderBy);
		if (tap_pistas != null && tap_pistas.length > 0)
			return tap_pistas[0];
		else
			return null;
	}
	
	public Tap_pista loadTap_pistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tap_pista[] tap_pistas = listTap_pistaByQuery(session, condition, orderBy, lockMode);
		if (tap_pistas != null && tap_pistas.length > 0)
			return tap_pistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTap_pistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_pistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_pistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ApuestaPersistentManager.instance().getSession();
			return iterateTap_pistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTap_pistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_pista as Tap_pista");
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
	
	public static java.util.Iterator iterateTap_pistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tap_pista as Tap_pista");
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
	
	public Tap_pista createTap_pista() {
		return new orm.Tap_pista();
	}
	
	public boolean save(orm.Tap_pista tap_pista) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().saveObject(tap_pista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Tap_pista tap_pista) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().deleteObject(tap_pista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_pista tap_pista)throws PersistentException {
		try {
			orm.Tap_carrera[] lTap_carreras = tap_pista.tap_carrera.toArray();
			for(int i = 0; i < lTap_carreras.length; i++) {
				lTap_carreras[i].setTap_pistapis(null);
			}
			return delete(tap_pista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Tap_pista tap_pista, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Tap_carrera[] lTap_carreras = tap_pista.tap_carrera.toArray();
			for(int i = 0; i < lTap_carreras.length; i++) {
				lTap_carreras[i].setTap_pistapis(null);
			}
			try {
				session.delete(tap_pista);
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
	
	public boolean refresh(orm.Tap_pista tap_pista) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().refresh(tap_pista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Tap_pista tap_pista) throws PersistentException {
		try {
			orm.ApuestaPersistentManager.instance().getSession().evict(tap_pista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tap_pista loadTap_pistaByCriteria(Tap_pistaCriteria tap_pistaCriteria) {
		Tap_pista[] tap_pistas = listTap_pistaByCriteria(tap_pistaCriteria);
		if(tap_pistas == null || tap_pistas.length == 0) {
			return null;
		}
		return tap_pistas[0];
	}
	
	public Tap_pista[] listTap_pistaByCriteria(Tap_pistaCriteria tap_pistaCriteria) {
		return tap_pistaCriteria.listTap_pista();
	}
}
