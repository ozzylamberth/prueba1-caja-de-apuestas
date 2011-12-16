package unit;

public class JineteUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INICIO ");

		System.out.println("Resultado Jinete por id "
				+ new ws.JineteSOA().getById(1));
		System.out.println("Resultado Jinete todas "
				+ new ws.JineteSOA().getAll());
		
		System.out.println("FIN ");
	}

}
