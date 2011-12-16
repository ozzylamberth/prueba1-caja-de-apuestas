/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.orm.*;
public class CreateRegCaballoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {

            orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
            
            orm.dao.Tap_regcaballoDAO oRMTap_reg_CarrCabDAO = lDAOFactory.getTap_regcaballoDAO();
            
            orm.Tap_regcaballo oRMTap_regCarrCab1 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO1 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo1 = oRMTap_caballoDAO1.loadTap_caballoByQuery("cab_id='1'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab1.setORM_Tap_caballocab(oRMTap_caballo1);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO1= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera1 = oRMTap_carreraDAO1.loadTap_carreraByQuery("car_id='1'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab1.setORM_Tap_carreracar(oRMTap_carrera1);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab1);
            
            orm.Tap_regcaballo oRMTap_regCarrCab2 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO2 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo2 = oRMTap_caballoDAO2.loadTap_caballoByQuery("cab_id='3'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab2.setORM_Tap_caballocab(oRMTap_caballo2);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO2= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera2 = oRMTap_carreraDAO2.loadTap_carreraByQuery("car_id='1'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab2.setORM_Tap_carreracar(oRMTap_carrera2);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab2);
            
            orm.Tap_regcaballo oRMTap_regCarrCab3 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO3 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo3 = oRMTap_caballoDAO3.loadTap_caballoByQuery("cab_id='7'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab3.setORM_Tap_caballocab(oRMTap_caballo3);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO3= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera3 = oRMTap_carreraDAO3.loadTap_carreraByQuery("car_id='1'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab3.setORM_Tap_carreracar(oRMTap_carrera3);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab3);
                        
            
            orm.Tap_regcaballo oRMTap_regCarrCab4 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO4 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo4 = oRMTap_caballoDAO4.loadTap_caballoByQuery("cab_id='2'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab4.setORM_Tap_caballocab(oRMTap_caballo4);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO4= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera4 = oRMTap_carreraDAO4.loadTap_carreraByQuery("car_id='2'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab4.setORM_Tap_carreracar(oRMTap_carrera4);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab4);
            
            orm.Tap_regcaballo oRMTap_regCarrCab5 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO5 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo5 = oRMTap_caballoDAO5.loadTap_caballoByQuery("cab_id='5'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab5.setORM_Tap_caballocab(oRMTap_caballo5);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO5= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera5 = oRMTap_carreraDAO5.loadTap_carreraByQuery("car_id='2'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab5.setORM_Tap_carreracar(oRMTap_carrera5);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab5);
            
            orm.Tap_regcaballo oRMTap_regCarrCab6 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO6 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo6 = oRMTap_caballoDAO6.loadTap_caballoByQuery("cab_id='7'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab6.setORM_Tap_caballocab(oRMTap_caballo6);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO6= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera6 = oRMTap_carreraDAO6.loadTap_carreraByQuery("car_id='2'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab6.setORM_Tap_carreracar(oRMTap_carrera6);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab6);
            
            orm.Tap_regcaballo oRMTap_regCarrCab7 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO7 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo7 = oRMTap_caballoDAO7.loadTap_caballoByQuery("cab_id='10'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab7.setORM_Tap_caballocab(oRMTap_caballo7);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO7= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera7 = oRMTap_carreraDAO7.loadTap_carreraByQuery("car_id='2'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab7.setORM_Tap_carreracar(oRMTap_carrera7);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab7);
            
            
            orm.Tap_regcaballo oRMTap_regCarrCab8 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO8 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo8 = oRMTap_caballoDAO8.loadTap_caballoByQuery("cab_id='1'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab8.setORM_Tap_caballocab(oRMTap_caballo8);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO8= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera8 = oRMTap_carreraDAO8.loadTap_carreraByQuery("car_id='3'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab8.setORM_Tap_carreracar(oRMTap_carrera8);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab8);
            
            orm.Tap_regcaballo oRMTap_regCarrCab9 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO9 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo9 = oRMTap_caballoDAO9.loadTap_caballoByQuery("cab_id='10'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab9.setORM_Tap_caballocab(oRMTap_caballo9);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO9= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera9 = oRMTap_carreraDAO9.loadTap_carreraByQuery("car_id='3'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab9.setORM_Tap_carreracar(oRMTap_carrera9);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab9);
            
            
            orm.Tap_regcaballo oRMTap_regCarrCab10 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO10 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo10 = oRMTap_caballoDAO10.loadTap_caballoByQuery("cab_id='2'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab10.setORM_Tap_caballocab(oRMTap_caballo10);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO10= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera10 = oRMTap_carreraDAO10.loadTap_carreraByQuery("car_id='4'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab10.setORM_Tap_carreracar(oRMTap_carrera10);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab10);
            
            orm.Tap_regcaballo oRMTap_regCarrCab11 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO11 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo11 = oRMTap_caballoDAO11.loadTap_caballoByQuery("cab_id='3'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab11.setORM_Tap_caballocab(oRMTap_caballo11);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO11= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera11 = oRMTap_carreraDAO11.loadTap_carreraByQuery("car_id='4'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab11.setORM_Tap_carreracar(oRMTap_carrera11);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab11);
            
            orm.Tap_regcaballo oRMTap_regCarrCab12 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO12 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo12 = oRMTap_caballoDAO12.loadTap_caballoByQuery("cab_id='8'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab12.setORM_Tap_caballocab(oRMTap_caballo12);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO12= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera12 = oRMTap_carreraDAO12.loadTap_carreraByQuery("car_id='4'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab12.setORM_Tap_carreracar(oRMTap_carrera12);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab12);
            
            
            orm.Tap_regcaballo oRMTap_regCarrCab13 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO13 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo13 = oRMTap_caballoDAO13.loadTap_caballoByQuery("cab_id='1'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab13.setORM_Tap_caballocab(oRMTap_caballo13);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO13= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera13 = oRMTap_carreraDAO13.loadTap_carreraByQuery("car_id='5'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab13.setORM_Tap_carreracar(oRMTap_carrera13);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab13);
            
            orm.Tap_regcaballo oRMTap_regCarrCab14 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO14 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo14 = oRMTap_caballoDAO14.loadTap_caballoByQuery("cab_id='4'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab14.setORM_Tap_caballocab(oRMTap_caballo14);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO14= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera14 = oRMTap_carreraDAO14.loadTap_carreraByQuery("car_id='5'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab14.setORM_Tap_carreracar(oRMTap_carrera14);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab14);
            
            orm.Tap_regcaballo oRMTap_regCarrCab15 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO15 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo15 = oRMTap_caballoDAO15.loadTap_caballoByQuery("cab_id='5'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab15.setORM_Tap_caballocab(oRMTap_caballo15);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO15= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera15 = oRMTap_carreraDAO15.loadTap_carreraByQuery("car_id='5'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab15.setORM_Tap_carreracar(oRMTap_carrera15);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab15);
            
            orm.Tap_regcaballo oRMTap_regCarrCab16 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO16 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo16 = oRMTap_caballoDAO16.loadTap_caballoByQuery("cab_id='7'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab16.setORM_Tap_caballocab(oRMTap_caballo16);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO16= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera16 = oRMTap_carreraDAO16.loadTap_carreraByQuery("car_id='5'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab16.setORM_Tap_carreracar(oRMTap_carrera16);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab16);
            
            orm.Tap_regcaballo oRMTap_regCarrCab17 = oRMTap_reg_CarrCabDAO.createTap_regcaballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            //Busca un caballo por id
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO17 = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo17 = oRMTap_caballoDAO17.loadTap_caballoByQuery("cab_id='9'", null);
            //Setea el caballo al registro
            oRMTap_regCarrCab17.setORM_Tap_caballocab(oRMTap_caballo17);
            //Busca una carrera por id
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO17= lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera17 = oRMTap_carreraDAO17.loadTap_carreraByQuery("car_id='5'", null);
            //Setea la carrera al registro
            oRMTap_regCarrCab17.setORM_Tap_carreracar(oRMTap_carrera17);
            oRMTap_reg_CarrCabDAO.save(oRMTap_regCarrCab17);
            
            t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateRegCaballoData createRegCarrCabData = new CreateRegCaballoData();
			try {
				createRegCarrCabData.createTestData();
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
