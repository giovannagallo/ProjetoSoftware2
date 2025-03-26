package contas;

public class ContaMes {

	public static void main(String[] args) {

		double janAlim, jevAgua, janAgua, janLuz, fevAlim, fevAgua, fevLuz;
		
		// Gastos janeiro
		janAlim = 1000;
		janAgua = 300;
		janLuz = 300;
		
		// Gastos Fevereiro
		fevAlim = 1500;
		fevAgua= 300;
		fevLuz = 300;
		
		// Gastos total
		double gastoTotalJan = janAgua + janAlim + janLuz;
		double gastosTotalFev = fevAgua + fevAlim + fevLuz;
		
		if (gastoTotalJan > gastosTotalFev) {
			System.out.println ("O gasto de fevereiro foi maior:");
			
		}
		else if ( gastosTotalFev > gastoTotalJan) {
			System.out.println ("O gasto de fevereiro foi maior");
			
		}
		else {
			System.out.println("Ambos os meses tiveram os mesmos gastos");
			
		}
		
	}

}
