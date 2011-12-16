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

public class Tap_apuestaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ap_id;
	public final IntegerExpression ap_monto;
	
	public Tap_apuestaCriteria(Criteria criteria) {
		super(criteria);
		ap_id = new IntegerExpression("ap_id", this);
		ap_monto = new IntegerExpression("ap_monto", this);
	}
	
	public Tap_apuestaCriteria(PersistentSession session) {
		this(session.createCriteria(Tap_apuesta.class));
	}
	
	public Tap_apuestaCriteria() throws PersistentException {
		this(orm.ApuestaPersistentManager.instance().getSession());
	}
	
	public Tap_cajaCriteria createTap_cajacajCriteria() {
		return new Tap_cajaCriteria(createCriteria("tap_cajacaj"));
	}
	
	public Tap_carreraCriteria createTap_carreracarCriteria() {
		return new Tap_carreraCriteria(createCriteria("tap_carreracar"));
	}
	
	public Tap_apuesta uniqueTap_apuesta() {
		return (Tap_apuesta) super.uniqueResult();
	}
	
	public Tap_apuesta[] listTap_apuesta() {
		java.util.List list = super.list();
		return (Tap_apuesta[]) list.toArray(new Tap_apuesta[list.size()]);
	}
}

