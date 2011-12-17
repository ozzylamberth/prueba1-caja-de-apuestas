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

public class Tap_regcaballoCriteria extends AbstractORMCriteria {
	public final IntegerExpression rc_id;
	
	public Tap_regcaballoCriteria(Criteria criteria) {
		super(criteria);
		rc_id = new IntegerExpression("rc_id", this);
	}
	
	public Tap_regcaballoCriteria(PersistentSession session) {
		this(session.createCriteria(Tap_regcaballo.class));
	}
	
	public Tap_regcaballoCriteria() throws PersistentException {
		this(orm.ApuestaPersistentManager.instance().getSession());
	}
	
	public Tap_caballoCriteria createTap_caballocabCriteria() {
		return new Tap_caballoCriteria(createCriteria("tap_caballocab"));
	}
	
	public Tap_carreraCriteria createTap_carreracarCriteria() {
		return new Tap_carreraCriteria(createCriteria("tap_carreracar"));
	}
	
	public orm.Tap_apuestaCriteria createTap_apuestaCriteria() {
		return new orm.Tap_apuestaCriteria(createCriteria("ORM_Tap_apuesta"));
	}
	
	public Tap_regcaballo uniqueTap_regcaballo() {
		return (Tap_regcaballo) super.uniqueResult();
	}
	
	public Tap_regcaballo[] listTap_regcaballo() {
		java.util.List list = super.list();
		return (Tap_regcaballo[]) list.toArray(new Tap_regcaballo[list.size()]);
	}
}

