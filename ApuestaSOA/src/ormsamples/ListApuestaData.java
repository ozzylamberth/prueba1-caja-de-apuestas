/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListApuestaData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		System.out.println("Listing Tap_jinete...");
		orm.Tap_jinete[] oRMTap_jinetes = lDAOFactory.getTap_jineteDAO().listTap_jineteByQuery(null, null);
		int length = Math.min(oRMTap_jinetes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTap_jinetes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tap_caballo...");
		orm.Tap_caballo[] oRMTap_caballos = lDAOFactory.getTap_caballoDAO().listTap_caballoByQuery(null, null);
		length = Math.min(oRMTap_caballos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTap_caballos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tap_caja...");
		orm.Tap_caja[] oRMTap_cajas = lDAOFactory.getTap_cajaDAO().listTap_cajaByQuery(null, null);
		length = Math.min(oRMTap_cajas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTap_cajas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tap_pista...");
		orm.Tap_pista[] oRMTap_pistas = lDAOFactory.getTap_pistaDAO().listTap_pistaByQuery(null, null);
		length = Math.min(oRMTap_pistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTap_pistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tap_carrera...");
		orm.Tap_carrera[] oRMTap_carreras = lDAOFactory.getTap_carreraDAO().listTap_carreraByQuery(null, null);
		length = Math.min(oRMTap_carreras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTap_carreras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tap_regcaballo...");
		orm.Tap_regcaballo[] oRMTap_regcaballos = lDAOFactory.getTap_regcaballoDAO().listTap_regcaballoByQuery(null, null);
		length = Math.min(oRMTap_regcaballos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTap_regcaballos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tap_apuesta...");
		orm.Tap_apuesta[] oRMTap_apuestas = lDAOFactory.getTap_apuestaDAO().listTap_apuestaByQuery(null, null);
		length = Math.min(oRMTap_apuestas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTap_apuestas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tap_log...");
		orm.Tap_log[] oRMTap_logs = lDAOFactory.getTap_logDAO().listTap_logByQuery(null, null);
		length = Math.min(oRMTap_logs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTap_logs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Tap_jinete by Criteria...");
		orm.Tap_jineteCriteria tap_jineteCriteria = new orm.Tap_jineteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tap_jineteCriteria.jin_id.eq();
		tap_jineteCriteria.setMaxResults(ROW_COUNT);
		orm.Tap_jinete[] oRMTap_jinetes = tap_jineteCriteria.listTap_jinete();
		int length =oRMTap_jinetes== null ? 0 : Math.min(oRMTap_jinetes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTap_jinetes[i]);
		}
		System.out.println(length + " Tap_jinete record(s) retrieved."); 
		
		System.out.println("Listing Tap_caballo by Criteria...");
		orm.Tap_caballoCriteria tap_caballoCriteria = new orm.Tap_caballoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tap_caballoCriteria.cab_id.eq();
		tap_caballoCriteria.setMaxResults(ROW_COUNT);
		orm.Tap_caballo[] oRMTap_caballos = tap_caballoCriteria.listTap_caballo();
		length =oRMTap_caballos== null ? 0 : Math.min(oRMTap_caballos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTap_caballos[i]);
		}
		System.out.println(length + " Tap_caballo record(s) retrieved."); 
		
		System.out.println("Listing Tap_caja by Criteria...");
		orm.Tap_cajaCriteria tap_cajaCriteria = new orm.Tap_cajaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tap_cajaCriteria.caj_id.eq();
		tap_cajaCriteria.setMaxResults(ROW_COUNT);
		orm.Tap_caja[] oRMTap_cajas = tap_cajaCriteria.listTap_caja();
		length =oRMTap_cajas== null ? 0 : Math.min(oRMTap_cajas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTap_cajas[i]);
		}
		System.out.println(length + " Tap_caja record(s) retrieved."); 
		
		System.out.println("Listing Tap_pista by Criteria...");
		orm.Tap_pistaCriteria tap_pistaCriteria = new orm.Tap_pistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tap_pistaCriteria.pis_id.eq();
		tap_pistaCriteria.setMaxResults(ROW_COUNT);
		orm.Tap_pista[] oRMTap_pistas = tap_pistaCriteria.listTap_pista();
		length =oRMTap_pistas== null ? 0 : Math.min(oRMTap_pistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTap_pistas[i]);
		}
		System.out.println(length + " Tap_pista record(s) retrieved."); 
		
		System.out.println("Listing Tap_carrera by Criteria...");
		orm.Tap_carreraCriteria tap_carreraCriteria = new orm.Tap_carreraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tap_carreraCriteria.car_id.eq();
		tap_carreraCriteria.setMaxResults(ROW_COUNT);
		orm.Tap_carrera[] oRMTap_carreras = tap_carreraCriteria.listTap_carrera();
		length =oRMTap_carreras== null ? 0 : Math.min(oRMTap_carreras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTap_carreras[i]);
		}
		System.out.println(length + " Tap_carrera record(s) retrieved."); 
		
		System.out.println("Listing Tap_regcaballo by Criteria...");
		orm.Tap_regcaballoCriteria tap_regcaballoCriteria = new orm.Tap_regcaballoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tap_regcaballoCriteria.rc_id.eq();
		tap_regcaballoCriteria.setMaxResults(ROW_COUNT);
		orm.Tap_regcaballo[] oRMTap_regcaballos = tap_regcaballoCriteria.listTap_regcaballo();
		length =oRMTap_regcaballos== null ? 0 : Math.min(oRMTap_regcaballos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTap_regcaballos[i]);
		}
		System.out.println(length + " Tap_regcaballo record(s) retrieved."); 
		
		System.out.println("Listing Tap_apuesta by Criteria...");
		orm.Tap_apuestaCriteria tap_apuestaCriteria = new orm.Tap_apuestaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tap_apuestaCriteria.apu_id.eq();
		tap_apuestaCriteria.setMaxResults(ROW_COUNT);
		orm.Tap_apuesta[] oRMTap_apuestas = tap_apuestaCriteria.listTap_apuesta();
		length =oRMTap_apuestas== null ? 0 : Math.min(oRMTap_apuestas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTap_apuestas[i]);
		}
		System.out.println(length + " Tap_apuesta record(s) retrieved."); 
		
		System.out.println("Listing Tap_log by Criteria...");
		orm.Tap_logCriteria tap_logCriteria = new orm.Tap_logCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tap_logCriteria.log_id.eq();
		tap_logCriteria.setMaxResults(ROW_COUNT);
		orm.Tap_log[] oRMTap_logs = tap_logCriteria.listTap_log();
		length =oRMTap_logs== null ? 0 : Math.min(oRMTap_logs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTap_logs[i]);
		}
		System.out.println(length + " Tap_log record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListApuestaData listApuestaData = new ListApuestaData();
			try {
				listApuestaData.listTestData();
				//listApuestaData.listByCriteria();
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
