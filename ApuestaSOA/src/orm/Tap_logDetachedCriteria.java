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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Tap_logDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression log_id;
	public final StringExpression log_evento;
	public final DateExpression log_fechainicio;
	public final DateExpression log_fechatermino;
	public final StringExpression log_tiempo;
	
	public Tap_logDetachedCriteria() {
		super(orm.Tap_log.class, orm.Tap_logCriteria.class);
		log_id = new IntegerExpression("log_id", this.getDetachedCriteria());
		log_evento = new StringExpression("log_evento", this.getDetachedCriteria());
		log_fechainicio = new DateExpression("log_fechainicio", this.getDetachedCriteria());
		log_fechatermino = new DateExpression("log_fechatermino", this.getDetachedCriteria());
		log_tiempo = new StringExpression("log_tiempo", this.getDetachedCriteria());
	}
	
	public Tap_logDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tap_logCriteria.class);
		log_id = new IntegerExpression("log_id", this.getDetachedCriteria());
		log_evento = new StringExpression("log_evento", this.getDetachedCriteria());
		log_fechainicio = new DateExpression("log_fechainicio", this.getDetachedCriteria());
		log_fechatermino = new DateExpression("log_fechatermino", this.getDetachedCriteria());
		log_tiempo = new StringExpression("log_tiempo", this.getDetachedCriteria());
	}
	
	public Tap_log uniqueTap_log(PersistentSession session) {
		return (Tap_log) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tap_log[] listTap_log(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tap_log[]) list.toArray(new Tap_log[list.size()]);
	}
}

