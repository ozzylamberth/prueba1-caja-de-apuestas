/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateJineteData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {

            orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
            
            orm.dao.Tap_jineteDAO oRMTan_jineteDAO = lDAOFactory.getTap_jineteDAO();
            
            orm.Tap_jinete oRMTap_jinete1 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete1.setJin_rut("12735465");
            oRMTap_jinete1.setJin_nombre("Luis Oliva");
            oRMTan_jineteDAO.save(oRMTap_jinete1);
            
            orm.Tap_jinete oRMTap_jinete2 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete2.setJin_rut("14244832");
            oRMTap_jinete2.setJin_nombre("Andres Retamal");
            oRMTan_jineteDAO.save(oRMTap_jinete2);
            
            orm.Tap_jinete oRMTap_jinete3 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete3.setJin_rut("13772991");
            oRMTap_jinete3.setJin_nombre("Juan Godoy");
            oRMTan_jineteDAO.save(oRMTap_jinete3);
            
            orm.Tap_jinete oRMTap_jinete4 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete4.setJin_rut("14093512");
            oRMTap_jinete4.setJin_nombre("Gabriel Vergara");
            oRMTan_jineteDAO.save(oRMTap_jinete4);
            
            orm.Tap_jinete oRMTap_jinete5 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete5.setJin_rut("15521734");
            oRMTap_jinete5.setJin_nombre("Pedro Valenzuela");
            oRMTan_jineteDAO.save(oRMTap_jinete5);
            
            orm.Tap_jinete oRMTap_jinete6 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete6.setJin_rut("11825348");
            oRMTap_jinete6.setJin_nombre("Rodrigo Mendez");
            oRMTan_jineteDAO.save(oRMTap_jinete6);
            
            orm.Tap_jinete oRMTap_jinete7 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete7.setJin_rut("16322294");
            oRMTap_jinete7.setJin_nombre("Raul Rojas");
            oRMTan_jineteDAO.save(oRMTap_jinete7);
            
            orm.Tap_jinete oRMTap_jinete8 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete8.setJin_rut("13823458");
            oRMTap_jinete8.setJin_nombre("Sebastian Pereira");
            oRMTan_jineteDAO.save(oRMTap_jinete8);
            
            orm.Tap_jinete oRMTap_jinete9 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete9.setJin_rut("14823716");
            oRMTap_jinete9.setJin_nombre("Esteban Saez");
            oRMTan_jineteDAO.save(oRMTap_jinete9);
            
            orm.Tap_jinete oRMTap_jinete10 = oRMTan_jineteDAO.createTap_jinete();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_jinete10.setJin_rut("15329045");
            oRMTap_jinete10.setJin_nombre("Eduardo Lopez");
            oRMTan_jineteDAO.save(oRMTap_jinete10);
                        
            t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateJineteData createJineteData = new CreateJineteData();
			try {
				createJineteData.createTestData();
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
