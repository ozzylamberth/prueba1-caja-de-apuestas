package SOAPVO;

public class PistaSOAPVO {

	
	int id;
	String nombre;
	
	/**
	 * Crea un nuevo jinete
	 * @param pistaOrm
	 * @return
	 */
	
	public static PistaSOAPVO crearPistaSOAPVO(orm.Tap_pista pistaOrm) {
		PistaSOAPVO objeto = new PistaSOAPVO();
		objeto.setId(pistaOrm.getPis_id());
		objeto.setNombre(pistaOrm.getPis_nombre());
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
	
	
}
