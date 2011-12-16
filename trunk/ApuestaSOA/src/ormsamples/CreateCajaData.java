/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateCajaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {

            orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
            
            orm.dao.Tap_cajaDAO oRMTap_cajaDAO = lDAOFactory.getTap_cajaDAO();
            
            orm.Tap_caja oRMTap_caja1 = oRMTap_cajaDAO.createTap_caja();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caja1.setCaj_nombre("Caja A");
            oRMTap_cajaDAO.save(oRMTap_caja1);
            
            orm.Tap_caja oRMTap_caja2 = oRMTap_cajaDAO.createTap_caja();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tda_anotacion, tan_nombre
            oRMTap_caja2.setCaj_nombre("Caja B");
            oRMTap_cajaDAO.save(oRMTap_caja2);
                        
            t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateCajaData createCajaData = new CreateCajaData();
			try {
				createCajaData.createTestData();
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
