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

public class Tap_regcaballoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression rc_id;
	
	public Tap_regcaballoDetachedCriteria() {
		super(orm.Tap_regcaballo.class, orm.Tap_regcaballoCriteria.class);
		rc_id = new IntegerExpression("rc_id", this.getDetachedCriteria());
	}
	
	public Tap_regcaballoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tap_regcaballoCriteria.class);
		rc_id = new IntegerExpression("rc_id", this.getDetachedCriteria());
	}
	
	public Tap_caballoDetachedCriteria createTap_caballocabCriteria() {
		return new Tap_caballoDetachedCriteria(createCriteria("tap_caballocab"));
	}
	
	public Tap_carreraDetachedCriteria createTap_carreracarCriteria() {
		return new Tap_carreraDetachedCriteria(createCriteria("tap_carreracar"));
	}
	
	public orm.Tap_apuestaDetachedCriteria createTap_apuestaCriteria() {
		return new orm.Tap_apuestaDetachedCriteria(createCriteria("ORM_Tap_apuesta"));
	}
	
	public Tap_regcaballo uniqueTap_regcaballo(PersistentSession session) {
		return (Tap_regcaballo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tap_regcaballo[] listTap_regcaballo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tap_regcaballo[]) list.toArray(new Tap_regcaballo[list.size()]);
	}
}

