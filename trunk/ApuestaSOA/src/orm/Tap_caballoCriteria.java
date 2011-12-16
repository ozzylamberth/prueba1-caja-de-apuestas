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

public class Tap_caballoCriteria extends AbstractORMCriteria {
	public final IntegerExpression cab_id;
	public final StringExpression cab_nombre;
	
	public Tap_caballoCriteria(Criteria criteria) {
		super(criteria);
		cab_id = new IntegerExpression("cab_id", this);
		cab_nombre = new StringExpression("cab_nombre", this);
	}
	
	public Tap_caballoCriteria(PersistentSession session) {
		this(session.createCriteria(Tap_caballo.class));
	}
	
	public Tap_caballoCriteria() throws PersistentException {
		this(orm.ApuestaPersistentManager.instance().getSession());
	}
	
	public Tap_jineteCriteria createTap_jinetejinCriteria() {
		return new Tap_jineteCriteria(createCriteria("tap_jinetejin"));
	}
	
	public orm.Tap_regcaballoCriteria createTap_regcarrcabCriteria() {
		return new orm.Tap_regcaballoCriteria(createCriteria("ORM_Tap_regcarrcab"));
	}
	
	public Tap_caballo uniqueTap_caballo() {
		return (Tap_caballo) super.uniqueResult();
	}
	
	public Tap_caballo[] listTap_caballo() {
		java.util.List list = super.list();
		return (Tap_caballo[]) list.toArray(new Tap_caballo[list.size()]);
	}
}

