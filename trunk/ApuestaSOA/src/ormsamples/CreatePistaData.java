/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreatePistaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {

            orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
            
            orm.dao.Tap_pistaDAO oRMTan_jineteDAO = lDAOFactory.getTap_pistaDAO();
            
            orm.Tap_pista oRMTap_pista1 = oRMTan_jineteDAO.createTap_pista();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_pista1.setPis_nombre("Pista norte");
            oRMTan_jineteDAO.save(oRMTap_pista1);
            
            orm.Tap_pista oRMTap_pista2 = oRMTan_jineteDAO.createTap_pista();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_pista2.setPis_nombre("Pista central");
            oRMTan_jineteDAO.save(oRMTap_pista2);
            
            orm.Tap_pista oRMTap_pista3 = oRMTan_jineteDAO.createTap_pista();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_pista3.setPis_nombre("Pista sur");
            oRMTan_jineteDAO.save(oRMTap_pista3);
                        
            t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreatePistaData createJineteData = new CreatePistaData();
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
