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

public class Tap_carreraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression car_id;
	public final IntegerExpression car_numero;
	public final DateExpression car_fecha;
	
	public Tap_carreraDetachedCriteria() {
		super(orm.Tap_carrera.class, orm.Tap_carreraCriteria.class);
		car_id = new IntegerExpression("car_id", this.getDetachedCriteria());
		car_numero = new IntegerExpression("car_numero", this.getDetachedCriteria());
		car_fecha = new DateExpression("car_fecha", this.getDetachedCriteria());
	}
	
	public Tap_carreraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tap_carreraCriteria.class);
		car_id = new IntegerExpression("car_id", this.getDetachedCriteria());
		car_numero = new IntegerExpression("car_numero", this.getDetachedCriteria());
		car_fecha = new DateExpression("car_fecha", this.getDetachedCriteria());
	}
	
	public Tap_pistaDetachedCriteria createTap_pistapisCriteria() {
		return new Tap_pistaDetachedCriteria(createCriteria("tap_pistapis"));
	}
	
	public Tap_caballoDetachedCriteria createTap_caballocabCriteria() {
		return new Tap_caballoDetachedCriteria(createCriteria("tap_caballocab"));
	}
	
	public orm.Tap_apuestaDetachedCriteria createTap_apuestaCriteria() {
		return new orm.Tap_apuestaDetachedCriteria(createCriteria("ORM_Tap_apuesta"));
	}
	
	public Tap_carrera uniqueTap_carrera(PersistentSession session) {
		return (Tap_carrera) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tap_carrera[] listTap_carrera(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tap_carrera[]) list.toArray(new Tap_carrera[list.size()]);
	}
}

