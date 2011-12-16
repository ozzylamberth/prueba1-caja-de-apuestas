package SOAPVO;

import java.util.Date;

public class CarreraSOAPVO {
	
	int id;
	int numero;
	Date fecha;
	String nombreCaballo;
	String nombrePista;
	
	/**
	 * Crea una nueva carrera
	 * @param carreraOrm
	 * @return carrera
	 */
	
	public static CarreraSOAPVO crearCarreraSOAPVO(orm.Tap_carrera carreraOrm) {
		CarreraSOAPVO objeto = new CarreraSOAPVO();
		objeto.setId(carreraOrm.getCar_id());
		objeto.setNumero(carreraOrm.getCar_numero());
		objeto.setFecha(carreraOrm.getCar_fecha());
		objeto.setNombreCaballo(carreraOrm.getTap_caballocab().getCab_nombre());
		objeto.setNombrePista(carreraOrm.getTap_pistapis().getPis_nombre());
		return objeto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNombreCaballo() {
		return nombreCaballo;
	}
	public void setNombreCaballo(String nombreCaballo) {
		this.nombreCaballo = nombreCaballo;
	}
	public String getNombrePista() {
		return nombrePista;
	}
	public void setNombrePista(String nombrePista) {
		this.nombrePista = nombrePista;
	}
	
	
	

}
