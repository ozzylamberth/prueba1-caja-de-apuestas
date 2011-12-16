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

public class Tap_cajaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression caj_id;
	public final StringExpression caj_nombre;
	
	public Tap_cajaDetachedCriteria() {
		super(orm.Tap_caja.class, orm.Tap_cajaCriteria.class);
		caj_id = new IntegerExpression("caj_id", this.getDetachedCriteria());
		caj_nombre = new StringExpression("caj_nombre", this.getDetachedCriteria());
	}
	
	public Tap_cajaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tap_cajaCriteria.class);
		caj_id = new IntegerExpression("caj_id", this.getDetachedCriteria());
		caj_nombre = new StringExpression("caj_nombre", this.getDetachedCriteria());
	}
	
	public orm.Tap_apuestaDetachedCriteria createTap_apuestaCriteria() {
		return new orm.Tap_apuestaDetachedCriteria(createCriteria("ORM_Tap_apuesta"));
	}
	
	public Tap_caja uniqueTap_caja(PersistentSession session) {
		return (Tap_caja) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tap_caja[] listTap_caja(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tap_caja[]) list.toArray(new Tap_caja[list.size()]);
	}
}

