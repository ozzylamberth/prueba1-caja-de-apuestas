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

public class Tap_jineteCriteria extends AbstractORMCriteria {
	public final IntegerExpression jin_id;
	public final StringExpression jin_rut;
	public final StringExpression jin_nombre;
	
	public Tap_jineteCriteria(Criteria criteria) {
		super(criteria);
		jin_id = new IntegerExpression("jin_id", this);
		jin_rut = new StringExpression("jin_rut", this);
		jin_nombre = new StringExpression("jin_nombre", this);
	}
	
	public Tap_jineteCriteria(PersistentSession session) {
		this(session.createCriteria(Tap_jinete.class));
	}
	
	public Tap_jineteCriteria() throws PersistentException {
		this(orm.ApuestaPersistentManager.instance().getSession());
	}
	
	public Tap_caballoCriteria createTap_caballoCriteria() {
		return new Tap_caballoCriteria(createCriteria("tap_caballo"));
	}
	
	public Tap_jinete uniqueTap_jinete() {
		return (Tap_jinete) super.uniqueResult();
	}
	
	public Tap_jinete[] listTap_jinete() {
		java.util.List list = super.list();
		return (Tap_jinete[]) list.toArray(new Tap_jinete[list.size()]);
	}
}

