package unit;

public class CajaUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INICIO ");

		System.out.println("Resultado Caja por id "
				+ new ws.CajaSOA().getById(1));
		System.out.println("Resultado Caja todas "
				+ new ws.CajaSOA().getAll());
		
		System.out.println("FIN ");
	}

}
