/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.orm.*;
public class CreateApuestasData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {

            orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
            
            orm.dao.Tap_apuestaDAO oRMTap_apuestasDAO = lDAOFactory.getTap_apuestaDAO();
            
            orm.Tap_apuesta oRMTap_apuesta1 = oRMTap_apuestasDAO.createTap_apuesta();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_apuesta1.setApu_monto(1000);
            //Busca un registro por id
			orm.dao.Tap_regcaballoDAO oRMTap_regCarrCabDAO1 = lDAOFactory.getTap_regcaballoDAO();
			orm.Tap_regcaballo oRMTap_regCarrCab1 = oRMTap_regCarrCabDAO1.loadTap_regcaballoByQuery("rc_id='1'", null);
            //Setea el registro a la apuesta
			System.out.println(oRMTap_regCarrCab1.getTap_caballocab().getCab_nombre());
            oRMTap_apuesta1.setTap_regcarrcabrcc(oRMTap_regCarrCab1);
            //Busca una caja por id
			orm.dao.Tap_cajaDAO oRMTap_cajaDAO1 = lDAOFactory.getTap_cajaDAO();
		    orm.Tap_caja oRMTap_caja1 = oRMTap_cajaDAO1.loadTap_cajaByQuery("caj_id='1'", null);
            //Setea la caja a la apuesta
			System.out.println(oRMTap_caja1);
            oRMTap_apuesta1.setTap_cajacaj(oRMTap_caja1);
            oRMTap_apuestasDAO.save(oRMTap_apuesta1);
            
            orm.Tap_apuesta oRMTap_apuesta2 = oRMTap_apuestasDAO.createTap_apuesta();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_apuesta2.setApu_monto(5000);
            //Busca un registro por id
			orm.dao.Tap_regcaballoDAO oRMTap_regCarrCabDAO2 = lDAOFactory.getTap_regcaballoDAO();
			orm.Tap_regcaballo oRMTap_regCarrCab2 = oRMTap_regCarrCabDAO2.loadTap_regcaballoByQuery("rc_id='1'", null);
            //Setea el registro a la apuesta
            oRMTap_apuesta2.setTap_regcarrcabrcc(oRMTap_regCarrCab2);
            //Busca una caja por id
			orm.dao.Tap_cajaDAO oRMTap_cajaDAO2 = lDAOFactory.getTap_cajaDAO();
			orm.Tap_caja oRMTap_caja2 = oRMTap_cajaDAO2.loadTap_cajaByQuery("caj_id='1'", null);
            //Setea la caja a la apuesta
            oRMTap_apuesta2.setTap_cajacaj(oRMTap_caja2);
            oRMTap_apuestasDAO.save(oRMTap_apuesta2);
            
            orm.Tap_apuesta oRMTap_apuesta3 = oRMTap_apuestasDAO.createTap_apuesta();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_apuesta3.setApu_monto(4500);
            //Busca un registro por id
			orm.dao.Tap_regcaballoDAO oRMTap_regCarrCabDAO3 = lDAOFactory.getTap_regcaballoDAO();
			orm.Tap_regcaballo oRMTap_regCarrCab3 = oRMTap_regCarrCabDAO3.loadTap_regcaballoByQuery("rc_id='1'", null);
            //Setea el registro a la apuesta
            oRMTap_apuesta3.setTap_regcarrcabrcc(oRMTap_regCarrCab3);
            //Busca una caja por id
			orm.dao.Tap_cajaDAO oRMTap_cajaDAO3 = lDAOFactory.getTap_cajaDAO();
			orm.Tap_caja oRMTap_caja3 = oRMTap_cajaDAO3.loadTap_cajaByQuery("caj_id='1'", null);
            //Setea la caja a la apuesta
            oRMTap_apuesta3.setTap_cajacaj(oRMTap_caja3);
            oRMTap_apuestasDAO.save(oRMTap_apuesta3);
            
            orm.Tap_apuesta oRMTap_apuesta4 = oRMTap_apuestasDAO.createTap_apuesta();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_apuesta4.setApu_monto(500);
            //Busca un registro por id
			orm.dao.Tap_regcaballoDAO oRMTap_regCarrCabDAO4 = lDAOFactory.getTap_regcaballoDAO();
			orm.Tap_regcaballo oRMTap_regCarrCab4 = oRMTap_regCarrCabDAO4.loadTap_regcaballoByQuery("rc_id='3'", null);
            //Setea el registro a la apuesta
            oRMTap_apuesta4.setTap_regcarrcabrcc(oRMTap_regCarrCab4);
            //Busca una caja por id
			orm.dao.Tap_cajaDAO oRMTap_cajaDAO4 = lDAOFactory.getTap_cajaDAO();
			orm.Tap_caja oRMTap_caja4 = oRMTap_cajaDAO4.loadTap_cajaByQuery("caj_id='1'", null);
            //Setea la caja a la apuesta
            oRMTap_apuesta4.setTap_cajacaj(oRMTap_caja4);
            oRMTap_apuestasDAO.save(oRMTap_apuesta4);
            
            orm.Tap_apuesta oRMTap_apuesta5 = oRMTap_apuestasDAO.createTap_apuesta();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_apuesta5.setApu_monto(10000);
            //Busca un registro por id
			orm.dao.Tap_regcaballoDAO oRMTap_regCarrCabDAO5 = lDAOFactory.getTap_regcaballoDAO();
			orm.Tap_regcaballo oRMTap_regCarrCab5 = oRMTap_regCarrCabDAO5.loadTap_regcaballoByQuery("rc_id='3'", null);
            //Setea el registro a la apuesta
            oRMTap_apuesta5.setTap_regcarrcabrcc(oRMTap_regCarrCab5);
            //Busca una caja por id
			orm.dao.Tap_cajaDAO oRMTap_cajaDAO5 = lDAOFactory.getTap_cajaDAO();
			orm.Tap_caja oRMTap_caja5 = oRMTap_cajaDAO5.loadTap_cajaByQuery("caj_id='1'", null);
            //Setea la caja a la apuesta
            oRMTap_apuesta5.setTap_cajacaj(oRMTap_caja5);
            oRMTap_apuestasDAO.save(oRMTap_apuesta5);
                        
            t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateApuestasData createApuestasData = new CreateApuestasData();
			try {
				createApuestasData.createTestData();
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
