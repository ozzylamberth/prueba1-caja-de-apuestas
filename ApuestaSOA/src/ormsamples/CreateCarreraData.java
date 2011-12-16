/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.orm.*;
public class CreateCarreraData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {

            orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
            
            orm.dao.Tap_carreraDAO oRMTap_carreraDAO = lDAOFactory.getTap_carreraDAO();
            
            orm.Tap_carrera oRMTap_carrera1 = oRMTap_carreraDAO.createTap_carrera();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_carrera1.setCar_numero(1);
            //Transforma la fecha de string a date
			SimpleDateFormat formatfecha1 = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha1 = null;
			try {
				fecha1 = formatfecha1.parse("2012-01-08");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            oRMTap_carrera1.setCar_fecha(fecha1);
            //Busca un jinete por id
			orm.dao.Tap_pistaDAO oRMTap_pistaDAO1 = lDAOFactory.getTap_pistaDAO();
			orm.Tap_pista oRMTap_pista1 = oRMTap_pistaDAO1.loadTap_pistaByQuery("pis_id='1'", null);
            //Setea el jinete al caballo
            oRMTap_carrera1.setTap_pistapis(oRMTap_pista1);
            oRMTap_carreraDAO.save(oRMTap_carrera1);
            
            orm.Tap_carrera oRMTap_carrera2 = oRMTap_carreraDAO.createTap_carrera();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_carrera2.setCar_numero(2);
            //Transforma la fecha de string a date
			SimpleDateFormat formatfecha2 = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha2 = null;
			try {
				fecha2 = formatfecha2.parse("2012-01-15");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            oRMTap_carrera2.setCar_fecha(fecha2);
            //Busca un jinete por id
			orm.dao.Tap_pistaDAO oRMTap_pistaDAO2 = lDAOFactory.getTap_pistaDAO();
			orm.Tap_pista oRMTap_pista2 = oRMTap_pistaDAO2.loadTap_pistaByQuery("pis_id='2'", null);
            //Setea el jinete al caballo
            oRMTap_carrera2.setTap_pistapis(oRMTap_pista2);
            oRMTap_carreraDAO.save(oRMTap_carrera2);
            
            orm.Tap_carrera oRMTap_carrera3 = oRMTap_carreraDAO.createTap_carrera();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_carrera3.setCar_numero(3);
            //Transforma la fecha de string a date
			SimpleDateFormat formatfecha3 = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha3 = null;
			try {
				fecha3 = formatfecha3.parse("2012-01-22");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            oRMTap_carrera3.setCar_fecha(fecha3);
            //Busca un jinete por id
			orm.dao.Tap_pistaDAO oRMTap_pistaDAO3 = lDAOFactory.getTap_pistaDAO();
			orm.Tap_pista oRMTap_pista3 = oRMTap_pistaDAO3.loadTap_pistaByQuery("pis_id='2'", null);
            //Setea el jinete al caballo
            oRMTap_carrera3.setTap_pistapis(oRMTap_pista3);
            oRMTap_carreraDAO.save(oRMTap_carrera3);
            
            orm.Tap_carrera oRMTap_carrera4 = oRMTap_carreraDAO.createTap_carrera();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_carrera4.setCar_numero(4);
            //Transforma la fecha de string a date
			SimpleDateFormat formatfecha4 = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha4 = null;
			try {
				fecha4 = formatfecha4.parse("2012-01-29");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            oRMTap_carrera4.setCar_fecha(fecha4);
            //Busca un jinete por id
			orm.dao.Tap_pistaDAO oRMTap_pistaDAO4 = lDAOFactory.getTap_pistaDAO();
			orm.Tap_pista oRMTap_pista4 = oRMTap_pistaDAO4.loadTap_pistaByQuery("pis_id='2'", null);
            //Setea el jinete al caballo
            oRMTap_carrera4.setTap_pistapis(oRMTap_pista4);
            oRMTap_carreraDAO.save(oRMTap_carrera4);
            
            orm.Tap_carrera oRMTap_carrera5 = oRMTap_carreraDAO.createTap_carrera();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_carrera5.setCar_numero(5);
            //Transforma la fecha de string a date
			SimpleDateFormat formatfecha5 = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha5 = null;
			try {
				fecha5 = formatfecha5.parse("2012-05-02");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            oRMTap_carrera5.setCar_fecha(fecha5);
            //Busca un jinete por id
			orm.dao.Tap_pistaDAO oRMTap_pistaDAO5 = lDAOFactory.getTap_pistaDAO();
			orm.Tap_pista oRMTap_pista5 = oRMTap_pistaDAO5.loadTap_pistaByQuery("pis_id='3'", null);
            //Setea el jinete al caballo
            oRMTap_carrera5.setTap_pistapis(oRMTap_pista5);
            oRMTap_carreraDAO.save(oRMTap_carrera5);
                        
            t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateCarreraData createCarreraData = new CreateCarreraData();
			try {
				createCarreraData.createTestData();
			}
			finally {
				orm.ApuestaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
