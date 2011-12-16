package SOAPVO;

public class RegCaballoSOAPVO {
	
	int id;
	int idCaballo;
	String nombreCaballo;
	int numeroCarrera;
	
	/**
	 * Crea un nuevo registro de carrera para un caballo
	 * @param regCarrCabOrm
	 * @return apuesta
	 */
	
	public static RegCaballoSOAPVO crearRegCarrCabSOAPVO(orm.Tap_regcaballo regCarrCabOrm) {
		RegCaballoSOAPVO objeto = new RegCaballoSOAPVO();
		objeto.setId(regCarrCabOrm.getRc_id());
		objeto.setIdCaballo(regCarrCabOrm.getTap_caballocab().getCab_id());
		objeto.setNombreCaballo(regCarrCabOrm.getTap_caballocab().getCab_nombre());
		objeto.setNumeroCarrera(regCarrCabOrm.getTap_carreracar().getCar_numero());
		return objeto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getIdCaballo() {
		return idCaballo;
	}

	public void setIdCaballo(int idCaballo) {
		this.idCaballo = idCaballo;
	}

	public String getNombreCaballo() {
		return nombreCaballo;
	}
	public void setNombreCaballo(String nombreCaballo) {
		this.nombreCaballo = nombreCaballo;
	}
	public int getNumeroCarrera() {
		return numeroCarrera;
	}
	public void setNumeroCarrera(int numeroCarrera) {
		this.numeroCarrera = numeroCarrera;
	}
	
	

}
