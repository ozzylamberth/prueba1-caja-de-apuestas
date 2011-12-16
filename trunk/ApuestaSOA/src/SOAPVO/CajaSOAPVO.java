package SOAPVO;

public class CajaSOAPVO {
	
	int id;
	String nombre;
	
	/**
	 * Crea una nueva caja
	 * @param cajaOrm
	 * @return caja
	 */
	
	public static CajaSOAPVO crearCajaSOAPVO(orm.Tap_caja cajaOrm) {
		CajaSOAPVO objeto = new CajaSOAPVO();
		objeto.setId(cajaOrm.getCaj_id());
		objeto.setNombre(cajaOrm.getCaj_nombre());
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
