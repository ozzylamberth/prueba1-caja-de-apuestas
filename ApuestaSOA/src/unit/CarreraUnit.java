package unit;

public class CarreraUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INICIO ");

		System.out.println("Resultado Carrera por id "
				+ new ws.CarreraSOA().getById(1));
		System.out.println("Resultado Carrera todas "
				+ new ws.CarreraSOA().getAll());
		
		System.out.println("FIN ");
	}

}
