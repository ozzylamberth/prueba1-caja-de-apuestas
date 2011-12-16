package unit;

public class PistaUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INICIO ");

		System.out.println("Resultado Pista por id "
				+ new ws.PistaSOA().getById(1));
		System.out.println("Resultado Pista todas "
				+ new ws.PistaSOA().getAll());
		
		System.out.println("FIN ");
	}

}
