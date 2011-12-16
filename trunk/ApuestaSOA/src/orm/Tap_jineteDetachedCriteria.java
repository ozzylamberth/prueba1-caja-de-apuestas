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

public class Tap_jineteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression jin_id;
	public final StringExpression jin_rut;
	public final StringExpression jin_nombre;
	
	public Tap_jineteDetachedCriteria() {
		super(orm.Tap_jinete.class, orm.Tap_jineteCriteria.class);
		jin_id = new IntegerExpression("jin_id", this.getDetachedCriteria());
		jin_rut = new StringExpression("jin_rut", this.getDetachedCriteria());
		jin_nombre = new StringExpression("jin_nombre", this.getDetachedCriteria());
	}
	
	public Tap_jineteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tap_jineteCriteria.class);
		jin_id = new IntegerExpression("jin_id", this.getDetachedCriteria());
		jin_rut = new StringExpression("jin_rut", this.getDetachedCriteria());
		jin_nombre = new StringExpression("jin_nombre", this.getDetachedCriteria());
	}
	
	public Tap_caballoDetachedCriteria createTap_caballoCriteria() {
		return new Tap_caballoDetachedCriteria(createCriteria("tap_caballo"));
	}
	
	public Tap_jinete uniqueTap_jinete(PersistentSession session) {
		return (Tap_jinete) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tap_jinete[] listTap_jinete(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tap_jinete[]) list.toArray(new Tap_jinete[list.size()]);
	}
}

