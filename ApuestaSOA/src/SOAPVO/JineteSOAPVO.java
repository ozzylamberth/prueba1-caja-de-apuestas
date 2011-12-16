package SOAPVO;

public class JineteSOAPVO {
	
	int id;
	String rut;
	String nombre;
	
	/**
	 * Crea un nuevo jinete
	 * @param jineteOrm
	 * @return jinete
	 */
	
	public static JineteSOAPVO crearJineteSOAPVO(orm.Tap_jinete jineteOrm) {
		JineteSOAPVO objeto = new JineteSOAPVO();
		objeto.setId(jineteOrm.getJin_id());
		objeto.setRut(jineteOrm.getJin_rut());
		objeto.setNombre(jineteOrm.getJin_nombre());
		return objeto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
