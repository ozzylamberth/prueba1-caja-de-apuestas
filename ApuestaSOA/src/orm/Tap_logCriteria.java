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
package orm;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Tap_logCriteria extends AbstractORMCriteria {
	public final IntegerExpression log_id;
	public final StringExpression log_evento;
	public final DateExpression log_fechainicio;
	public final DateExpression log_fechatermino;
	public final StringExpression log_tiempo;
	
	public Tap_logCriteria(Criteria criteria) {
		super(criteria);
		log_id = new IntegerExpression("log_id", this);
		log_evento = new StringExpression("log_evento", this);
		log_fechainicio = new DateExpression("log_fechainicio", this);
		log_fechatermino = new DateExpression("log_fechatermino", this);
		log_tiempo = new StringExpression("log_tiempo", this);
	}
	
	public Tap_logCriteria(PersistentSession session) {
		this(session.createCriteria(Tap_log.class));
	}
	
	public Tap_logCriteria() throws PersistentException {
		this(orm.ApuestaPersistentManager.instance().getSession());
	}
	
	public Tap_log uniqueTap_log() {
		return (Tap_log) super.uniqueResult();
	}
	
	public Tap_log[] listTap_log() {
		java.util.List list = super.list();
		return (Tap_log[]) list.toArray(new Tap_log[list.size()]);
	}
}

