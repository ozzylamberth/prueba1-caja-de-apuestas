/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateCaballoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {

            orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
            
            orm.dao.Tap_caballoDAO oRMTap_caballoDAO = lDAOFactory.getTap_caballoDAO();
            
            orm.Tap_caballo oRMTap_caballo1 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo1.setCab_nombre("El arrepentio");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO1 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete1 = oRMTap_jineteDAO1.loadTap_jineteByQuery("jin_id='1'", null);
            //Setea el jinete al caballo
            oRMTap_caballo1.setTap_jinetejin(oRMTap_jinete1);
            oRMTap_caballoDAO.save(oRMTap_caballo1);
            
            orm.Tap_caballo oRMTap_caballo2 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo2.setCab_nombre("La sombra");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO2 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete2 = oRMTap_jineteDAO2.loadTap_jineteByQuery("jin_id='2'", null);
            //Setea el jinete al caballo
            oRMTap_caballo2.setTap_jinetejin(oRMTap_jinete2);
            oRMTap_caballoDAO.save(oRMTap_caballo2);
            
            orm.Tap_caballo oRMTap_caballo3 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo3.setCab_nombre("Sepulturero");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO3 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete3 = oRMTap_jineteDAO3.loadTap_jineteByQuery("jin_id='3'", null);
            //Setea el jinete al caballo
            oRMTap_caballo3.setTap_jinetejin(oRMTap_jinete3);
            oRMTap_caballoDAO.save(oRMTap_caballo3);
            
            orm.Tap_caballo oRMTap_caballo4 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo4.setCab_nombre("La pelolais");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO4 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete4 = oRMTap_jineteDAO4.loadTap_jineteByQuery("jin_id='4'", null);
            //Setea el jinete al caballo
            oRMTap_caballo4.setTap_jinetejin(oRMTap_jinete4);
            oRMTap_caballoDAO.save(oRMTap_caballo4);
            
            orm.Tap_caballo oRMTap_caballo5 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo5.setCab_nombre("Nebuloso");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO5 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete5 = oRMTap_jineteDAO5.loadTap_jineteByQuery("jin_id='5'", null);
            //Setea el jinete al caballo
            oRMTap_caballo5.setTap_jinetejin(oRMTap_jinete5);
            oRMTap_caballoDAO.save(oRMTap_caballo5);
            
            orm.Tap_caballo oRMTap_caballo6 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo6.setCab_nombre("La flecha");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO6 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete6 = oRMTap_jineteDAO6.loadTap_jineteByQuery("jin_id='6'", null);
            //Setea el jinete al caballo
            oRMTap_caballo6.setTap_jinetejin(oRMTap_jinete6);
            oRMTap_caballoDAO.save(oRMTap_caballo6);
            
            orm.Tap_caballo oRMTap_caballo7 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo7.setCab_nombre("Terminator");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO7 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete7 = oRMTap_jineteDAO7.loadTap_jineteByQuery("jin_id='7'", null);
            //Setea el jinete al caballo
            oRMTap_caballo7.setTap_jinetejin(oRMTap_jinete7);
            oRMTap_caballoDAO.save(oRMTap_caballo7);
            
            orm.Tap_caballo oRMTap_caballo8 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo8.setCab_nombre("El invisible");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO8 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete8 = oRMTap_jineteDAO8.loadTap_jineteByQuery("jin_id='8'", null);
            //Setea el jinete al caballo
            oRMTap_caballo8.setTap_jinetejin(oRMTap_jinete8);
            oRMTap_caballoDAO.save(oRMTap_caballo8);
            
            orm.Tap_caballo oRMTap_caballo9 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo9.setCab_nombre("El vengador");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO9 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete9 = oRMTap_jineteDAO9.loadTap_jineteByQuery("jin_id='9'", null);
            //Setea el jinete al caballo
            oRMTap_caballo9.setTap_jinetejin(oRMTap_jinete9);
            oRMTap_caballoDAO.save(oRMTap_caballo9);
            
            orm.Tap_caballo oRMTap_caballo10 = oRMTap_caballoDAO.createTap_caballo();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caballo10.setCab_nombre("El vagabundo");
            //Busca un jinete por id
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO10 = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete10 = oRMTap_jineteDAO10.loadTap_jineteByQuery("jin_id='10'", null);
            //Setea el jinete al caballo
            oRMTap_caballo10.setTap_jinetejin(oRMTap_jinete10);
            oRMTap_caballoDAO.save(oRMTap_caballo10);
                        
            t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateCaballoData createCaballoData = new CreateCaballoData();
			try {
				createCaballoData.createTestData();
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
