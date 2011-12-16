/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateApuestaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ApuestaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Tap_caballoDAO oRMTap_caballoDAO = lDAOFactory.getTap_caballoDAO();
			orm.Tap_caballo oRMTap_caballo = oRMTap_caballoDAO.createTap_caballo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tap_carrera, tap_jinetejin, cab_nombre
			oRMTap_caballoDAO.save(oRMTap_caballo);
			orm.dao.Tap_jineteDAO oRMTap_jineteDAO = lDAOFactory.getTap_jineteDAO();
			orm.Tap_jinete oRMTap_jinete = oRMTap_jineteDAO.createTap_jinete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tap_caballo, jin_nombre, jin_rut
			oRMTap_jineteDAO.save(oRMTap_jinete);
			orm.dao.Tap_apuestaDAO oRMTap_apuestaDAO = lDAOFactory.getTap_apuestaDAO();
			orm.Tap_apuesta oRMTap_apuesta = oRMTap_apuestaDAO.createTap_apuesta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tap_carreracar, tap_cajacaj, ap_monto
			oRMTap_apuestaDAO.save(oRMTap_apuesta);
			orm.dao.Tap_carreraDAO oRMTap_carreraDAO = lDAOFactory.getTap_carreraDAO();
			orm.Tap_carrera oRMTap_carrera = oRMTap_carreraDAO.createTap_carrera();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tap_apuesta, tap_caballocab, tap_pistapis, car_fecha, car_numero
			oRMTap_carreraDAO.save(oRMTap_carrera);
			orm.dao.Tap_pistaDAO oRMTap_pistaDAO = lDAOFactory.getTap_pistaDAO();
			orm.Tap_pista oRMTap_pista = oRMTap_pistaDAO.createTap_pista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tap_carrera, pis_nombre
			oRMTap_pistaDAO.save(oRMTap_pista);
			orm.dao.Tap_cajaDAO oRMTap_cajaDAO = lDAOFactory.getTap_cajaDAO();
			orm.Tap_j oRMTap_caja = oRMTap_cajaDAO.createTap_caja();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tap_apuesta, caj_nombre
			oRMTap_cajaDAO.save(oRMTap_caja);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateApuestaData createApuestaData = new CreateApuestaData();
			try {
				createApuestaData.createTestData();
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
