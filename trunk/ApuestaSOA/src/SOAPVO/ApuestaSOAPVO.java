package SOAPVO;

import java.util.Date;

public class ApuestaSOAPVO {

	int id;
	int monto;
	Date fecha;
	String nombreCaballo;
	int numeroCarrera;
	String nombreCaja;
	
	/**
	 * Crea una nueva apuesta
	 * @param apuestaOrm
	 * @return apuesta
	 */
	
	public static ApuestaSOAPVO crearApuestaSOAPVO(orm.Tap_apuesta apuestaOrm) {
		ApuestaSOAPVO objeto = new ApuestaSOAPVO();
		objeto.setId(apuestaOrm.getApu_id());
		objeto.setMonto(apuestaOrm.getApu_monto());
		objeto.setFecha(apuestaOrm.getApu_fecha());
		objeto.setNombreCaballo(apuestaOrm.getTap_regcarrcabrcc().getTap_caballocab().getCab_nombre());
		objeto.setNumeroCarrera(apuestaOrm.getTap_regcarrcabrcc().getTap_carreracar().getCar_numero());
		objeto.setNombreCaja(apuestaOrm.getTap_cajacaj().getCaj_nombre());
		return objeto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
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
	public int getNumeroCarrera() {
		return numeroCarrera;
	}
	public void setNumeroCarrera(int numeroCarrera) {
		this.numeroCarrera = numeroCarrera;
	}
	public String getNombreCaja() {
		return nombreCaja;
	}
	public void setNombreCaja(String nombreCaja) {
		this.nombreCaja = nombreCaja;
	}
	
	
}
