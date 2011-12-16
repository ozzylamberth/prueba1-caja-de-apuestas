package unit;

public class CaballoUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INICIO ");

		System.out.println("Resultado Caballo por id "
				+ new ws.CaballoSOA().getById(1));
		System.out.println("Resultado caballo todas "
				+ new ws.CaballoSOA().getAll());
		
		System.out.println("FIN ");
	}

}
