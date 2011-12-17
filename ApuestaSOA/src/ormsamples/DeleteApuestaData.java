/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteApuestaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete = oRMTap_jineteDAO.loadTap_jineteByQuery(null, null);
			// Delete the persistent object
			oRMTap_jineteDAO.delete(oRMTap_jinete);
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo = oRMTap_caballoDAO.loadTap_caballoByQuery(null, null);
			// Delete the persistent object
			oRMTap_caballoDAO.delete(oRMTap_caballo);
			orm.dao.Tap_cajaDAO oRMTap_cajaDAO = lDAOFactory.getTap_cajaDAO();
			orm.Tap_caja oRMTap_caja = oRMTap_cajaDAO.loadTap_cajaByQuery(null, null);
			// Delete the persistent object
			oRMTap_cajaDAO.delete(oRMTap_caja);
			orm.dao.Tap_pistaDAO oRMTap_pistaDAO = lDAOFactory.getTap_pistaDAO();
			orm.Tap_pista oRMTap_pista = oRMTap_pistaDAO.loadTap_pistaByQuery(null, null);
			// Delete the persistent object
			oRMTap_pistaDAO.delete(oRMTap_pista);
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO = lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera = oRMTap_carreraDAO.loadTap_carreraByQuery(null, null);
			// Delete the persistent object
			oRMTap_carreraDAO.delete(oRMTap_carrera);
			orm.dao.Tap_regcaballoDAO oRMTap_regcaballoDAO = lDAOFactory.getTap_regcaballoDAO();
			orm.Tap_regcaballo oRMTap_regcaballo = oRMTap_regcaballoDAO.loadTap_regcaballoByQuery(null, null);
			// Delete the persistent object
			oRMTap_regcaballoDAO.delete(oRMTap_regcaballo);
			orm.dao.Tap_apuestaDAO oRMTap_apuestaDAO = lDAOFactory.getTap_apuestaDAO();
			orm.Tap_apuesta oRMTap_apuesta = oRMTap_apuestaDAO.loadTap_apuestaByQuery(null, null);
			// Delete the persistent object
			oRMTap_apuestaDAO.delete(oRMTap_apuesta);
			orm.dao.Tap_logDAO oRMTap_logDAO = lDAOFactory.getTap_logDAO();
			orm.Tap_log oRMTap_log = oRMTap_logDAO.loadTap_logByQuery(null, null);
			// Delete the persistent object
			oRMTap_logDAO.delete(oRMTap_log);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteApuestaData deleteApuestaData = new DeleteApuestaData();
			try {
				deleteApuestaData.deleteTestData();
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
