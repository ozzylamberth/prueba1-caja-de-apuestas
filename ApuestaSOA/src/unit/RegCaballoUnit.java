package unit;

public class RegCaballoUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("INICIO ");

		System.out.println("Resultado Reg por id "
				+ new ws.RegCaballoSOA().getById(1));
		System.out.println("Resultado Reg todas "
				+ new ws.RegCaballoSOA().getAll());
		System.out.println("Resultado Reg caballo "
				+ new ws.RegCaballoSOA().getByCaballo(2));
		System.out.println("Resultado Reg Carrera "
				+ new ws.RegCaballoSOA().getByCarrera(5));
		
		System.out.println("FIN ");
	}

}
