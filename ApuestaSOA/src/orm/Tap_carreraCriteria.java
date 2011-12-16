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

public class Tap_carreraCriteria extends AbstractORMCriteria {
	public final IntegerExpression car_id;
	public final IntegerExpression car_numero;
	public final DateExpression car_fecha;
	
	public Tap_carreraCriteria(Criteria criteria) {
		super(criteria);
		car_id = new IntegerExpression("car_id", this);
		car_numero = new IntegerExpression("car_numero", this);
		car_fecha = new DateExpression("car_fecha", this);
	}
	
	public Tap_carreraCriteria(PersistentSession session) {
		this(session.createCriteria(Tap_carrera.class));
	}
	
	public Tap_carreraCriteria() throws PersistentException {
		this(orm.ApuestaPersistentManager.instance().getSession());
	}
	
	public Tap_pistaCriteria createTap_pistapisCriteria() {
		return new Tap_pistaCriteria(createCriteria("tap_pistapis"));
	}
	
	public orm.Tap_regcaballoCriteria createTap_regcarrcabCriteria() {
		return new orm.Tap_regcaballoCriteria(createCriteria("ORM_Tap_regcarrcab"));
	}
	
	public Tap_carrera uniqueTap_carrera() {
		return (Tap_carrera) super.uniqueResult();
	}
	
	public Tap_carrera[] listTap_carrera() {
		java.util.List list = super.list();
		return (Tap_carrera[]) list.toArray(new Tap_carrera[list.size()]);
	}
}

