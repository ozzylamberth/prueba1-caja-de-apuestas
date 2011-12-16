/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateApuestaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo = oRMTap_caballoDAO.loadTap_caballoByQuery(null, null);
			// Update the properties of the persistent object
			oRMTap_caballoDAO.save(oRMTap_caballo);
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete = oRMTap_jineteDAO.loadTap_jineteByQuery(null, null);
			// Update the properties of the persistent object
			oRMTap_jineteDAO.save(oRMTap_jinete);
			orm.dao.Tap_apuestaDAO oRMTap_apuestaDAO = lDAOFactory.getTap_apuestaDAO();
			orm.Tap_apuesta oRMTap_apuesta = oRMTap_apuestaDAO.loadTap_apuestaByQuery(null, null);
			// Update the properties of the persistent object
			oRMTap_apuestaDAO.save(oRMTap_apuesta);
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO = lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera = oRMTap_carreraDAO.loadTap_carreraByQuery(null, null);
			// Update the properties of the persistent object
			oRMTap_carreraDAO.save(oRMTap_carrera);
			orm.dao.Tap_pistaDAO oRMTap_pistaDAO = lDAOFactory.getTap_pistaDAO();
			orm.Tap_pista oRMTap_pista = oRMTap_pistaDAO.loadTap_pistaByQuery(null, null);
			// Update the properties of the persistent object
			oRMTap_pistaDAO.save(oRMTap_pista);
			orm.dao.Tap_cajaDAO oRMTap_cajaDAO = lDAOFactory.getTap_cajaDAO();
			orm.Tap_j oRMTap_caja = oRMTap_cajaDAO.loadTap_cajaByQuery(null, null);
			// Update the properties of the persistent object
			oRMTap_cajaDAO.save(oRMTap_caja);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Tap_caballo by Tap_caballoCriteria");
		orm.Tap_caballoCriteria tap_caballoCriteria = new orm.Tap_caballoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tap_caballoCriteria.cab_id.eq();
		System.out.println(tap_caballoCriteria.uniqueTap_caballo());
		
		System.out.println("Retrieving Tap_jinete by Tap_jineteCriteria");
		orm.Tap_jineteCriteria tap_jineteCriteria = new orm.Tap_jineteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tap_jineteCriteria.jin_id.eq();
		System.out.println(tap_jineteCriteria.uniqueTap_jinete());
		
		System.out.println("Retrieving Tap_apuesta by Tap_apuestaCriteria");
		orm.Tap_apuestaCriteria tap_apuestaCriteria = new orm.Tap_apuestaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tap_apuestaCriteria.ap_id.eq();
		System.out.println(tap_apuestaCriteria.uniqueTap_apuesta());
		
		System.out.println("Retrieving Tap_carrera by Tap_carreraCriteria");
		orm.Tap_carreraCriteria tap_carreraCriteria = new orm.Tap_carreraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tap_carreraCriteria.car_id.eq();
		System.out.println(tap_carreraCriteria.uniqueTap_carrera());
		
		System.out.println("Retrieving Tap_pista by Tap_pistaCriteria");
		orm.Tap_pistaCriteria tap_pistaCriteria = new orm.Tap_pistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tap_pistaCriteria.pis_id.eq();
		System.out.println(tap_pistaCriteria.uniqueTap_pista());
		
		System.out.println("Retrieving Tap_caja by Tap_cajaCriteria");
		orm.Tap_cajaCriteria tap_cajaCriteria = new orm.Tap_cajaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tap_cajaCriteria.caj_id.eq();
		System.out.println(tap_cajaCriteria.uniqueTap_caja());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateApuestaData retrieveAndUpdateApuestaData = new RetrieveAndUpdateApuestaData();
			try {
				retrieveAndUpdateApuestaData.retrieveAndUpdateTestData();
				//retrieveAndUpdateApuestaData.retrieveByCriteria();
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