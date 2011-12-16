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

public class Tap_caballoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression cab_id;
	public final StringExpression cab_nombre;
	
	public Tap_caballoDetachedCriteria() {
		super(orm.Tap_caballo.class, orm.Tap_caballoCriteria.class);
		cab_id = new IntegerExpression("cab_id", this.getDetachedCriteria());
		cab_nombre = new StringExpression("cab_nombre", this.getDetachedCriteria());
	}
	
	public Tap_caballoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tap_caballoCriteria.class);
		cab_id = new IntegerExpression("cab_id", this.getDetachedCriteria());
		cab_nombre = new StringExpression("cab_nombre", this.getDetachedCriteria());
	}
	
	public Tap_jineteDetachedCriteria createTap_jinetejinCriteria() {
		return new Tap_jineteDetachedCriteria(createCriteria("tap_jinetejin"));
	}
	
	public orm.Tap_regcaballoDetachedCriteria createTap_regcarrcabCriteria() {
		return new orm.Tap_regcaballoDetachedCriteria(createCriteria("ORM_Tap_regcarrcab"));
	}
	
	public Tap_caballo uniqueTap_caballo(PersistentSession session) {
		return (Tap_caballo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tap_caballo[] listTap_caballo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tap_caballo[]) list.toArray(new Tap_caballo[list.size()]);
	}
}

