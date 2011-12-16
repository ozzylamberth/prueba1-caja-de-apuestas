package SOAPVO;

public class CaballoSOAPVO {

	int id;
	String nombre;
	String nombreJinete;
	
	/**
	 * Crea un nuevo caballo
	 * @param caballoOrm
	 * @return caballo
	 */
	
	public static CaballoSOAPVO crearCaballoSOAPVO(orm.Tap_caballo caballoOrm) {
		CaballoSOAPVO objeto = new CaballoSOAPVO();
		objeto.setId(caballoOrm.getCab_id());
		objeto.setNombre(caballoOrm.getCab_nombre());
		objeto.setNombreJinete(caballoOrm.getTap_jinetejin().getJin_nombre());
		return objeto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreJinete() {
		return nombreJinete;
	}
	public void setNombreJinete(String nombreJinete) {
		this.nombreJinete = nombreJinete;
	}
	
	
	
}
