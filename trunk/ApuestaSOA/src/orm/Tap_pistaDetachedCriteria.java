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

public class Tap_pistaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression pis_id;
	public final StringExpression pis_nombre;
	
	public Tap_pistaDetachedCriteria() {
		super(orm.Tap_pista.class, orm.Tap_pistaCriteria.class);
		pis_id = new IntegerExpression("pis_id", this.getDetachedCriteria());
		pis_nombre = new StringExpression("pis_nombre", this.getDetachedCriteria());
	}
	
	public Tap_pistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tap_pistaCriteria.class);
		pis_id = new IntegerExpression("pis_id", this.getDetachedCriteria());
		pis_nombre = new StringExpression("pis_nombre", this.getDetachedCriteria());
	}
	
	public orm.Tap_carreraDetachedCriteria createTap_carreraCriteria() {
		return new orm.Tap_carreraDetachedCriteria(createCriteria("ORM_Tap_carrera"));
	}
	
	public Tap_pista uniqueTap_pista(PersistentSession session) {
		return (Tap_pista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tap_pista[] listTap_pista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tap_pista[]) list.toArray(new Tap_pista[list.size()]);
	}
}

