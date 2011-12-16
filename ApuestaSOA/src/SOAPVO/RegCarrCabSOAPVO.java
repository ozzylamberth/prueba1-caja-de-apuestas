package SOAPVO;

public class RegCarrCabSOAPVO {
	
	int id;
	String nombreCaballo;
	int numeroCarrera;
	
	/**
	 * Crea un nuevo registro de carrera para un caballo
	 * @param regCarrCabOrm
	 * @return apuesta
	 */
	
	public static RegCarrCabSOAPVO crearRegCarrCabSOAPVO(orm.Tap_regcarrcab regCarrCabOrm) {
		RegCarrCabSOAPVO objeto = new RegCarrCabSOAPVO();
		objeto.setId(regCarrCabOrm.getRcc_id());
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
