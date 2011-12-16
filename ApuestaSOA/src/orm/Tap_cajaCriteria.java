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

public class Tap_cajaCriteria extends AbstractORMCriteria {
	public final IntegerExpression caj_id;
	public final StringExpression caj_nombre;
	
	public Tap_cajaCriteria(Criteria criteria) {
		super(criteria);
		caj_id = new IntegerExpression("caj_id", this);
		caj_nombre = new StringExpression("caj_nombre", this);
	}
	
	public Tap_cajaCriteria(PersistentSession session) {
		this(session.createCriteria(Tap_j.class));
	}
	
	public Tap_cajaCriteria() throws PersistentException {
		this(orm.ApuestaPersistentManager.instance().getSession());
	}
	
	public orm.Tap_apuestaCriteria createTap_apuestaCriteria() {
		return new orm.Tap_apuestaCriteria(createCriteria("ORM_Tap_apuesta"));
	}
	
	public Tap_j uniqueTap_caja() {
		return (Tap_j) super.uniqueResult();
	}
	
	public Tap_j[] listTap_caja() {
		java.util.List list = super.list();
		return (Tap_j[]) list.toArray(new Tap_j[list.size()]);
	}
}

