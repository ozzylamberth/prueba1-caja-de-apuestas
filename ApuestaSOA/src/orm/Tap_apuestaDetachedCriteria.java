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

public class Tap_apuestaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ap_id;
	public final IntegerExpression ap_monto;
	
	public Tap_apuestaDetachedCriteria() {
		super(orm.Tap_apuesta.class, orm.Tap_apuestaCriteria.class);
		ap_id = new IntegerExpression("ap_id", this.getDetachedCriteria());
		ap_monto = new IntegerExpression("ap_monto", this.getDetachedCriteria());
	}
	
	public Tap_apuestaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tap_apuestaCriteria.class);
		ap_id = new IntegerExpression("ap_id", this.getDetachedCriteria());
		ap_monto = new IntegerExpression("ap_monto", this.getDetachedCriteria());
	}
	
	public Tap_cajaDetachedCriteria createTap_cajacajCriteria() {
		return new Tap_cajaDetachedCriteria(createCriteria("tap_cajacaj"));
	}
	
	public Tap_carreraDetachedCriteria createTap_carreracarCriteria() {
		return new Tap_carreraDetachedCriteria(createCriteria("tap_carreracar"));
	}
	
	public Tap_apuesta uniqueTap_apuesta(PersistentSession session) {
		return (Tap_apuesta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tap_apuesta[] listTap_apuesta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tap_apuesta[]) list.toArray(new Tap_apuesta[list.size()]);
	}
}

