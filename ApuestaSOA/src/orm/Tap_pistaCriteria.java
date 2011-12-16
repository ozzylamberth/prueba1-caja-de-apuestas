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

public class Tap_pistaCriteria extends AbstractORMCriteria {
	public final IntegerExpression pis_id;
	public final StringExpression pis_nombre;
	
	public Tap_pistaCriteria(Criteria criteria) {
		super(criteria);
		pis_id = new IntegerExpression("pis_id", this);
		pis_nombre = new StringExpression("pis_nombre", this);
	}
	
	public Tap_pistaCriteria(PersistentSession session) {
		this(session.createCriteria(Tap_pista.class));
	}
	
	public Tap_pistaCriteria() throws PersistentException {
		this(orm.ApuestaPersistentManager.instance().getSession());
	}
	
	public orm.Tap_carreraCriteria createTap_carreraCriteria() {
		return new orm.Tap_carreraCriteria(createCriteria("ORM_Tap_carrera"));
	}
	
	public Tap_pista uniqueTap_pista() {
		return (Tap_pista) super.uniqueResult();
	}
	
	public Tap_pista[] listTap_pista() {
		java.util.List list = super.list();
		return (Tap_pista[]) list.toArray(new Tap_pista[list.size()]);
	}
}

