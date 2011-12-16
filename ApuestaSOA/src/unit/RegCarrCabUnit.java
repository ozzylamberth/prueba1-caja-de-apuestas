package unit;

public class RegCarrCabUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("INICIO ");

		System.out.println("Resultado Reg por id "
				+ new ws.RegCarrCabSOA().getById(1));
		System.out.println("Resultado Reg todas "
				+ new ws.RegCarrCabSOA().getAll());
		
		System.out.println("FIN ");
	}

}
