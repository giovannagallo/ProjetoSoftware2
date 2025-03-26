package poooo;

public class principal {

	public static void main(String[] args) {

		contasMes janeiro  = new contasMes();
		contasMes fevereiro = new contasMes();
		
		// gastos janeiro
		janeiro.agua = 1000;
		janeiro.alimentacao = 1000;
		janeiro.luz = 300;
		
		//gastos fevereiro
		fevereiro.alimentacao = 1000;
		fevereiro.agua = 300;
		fevereiro.luz = 300;
		
		// gasto total 
		double gastoJan = janeiro.somaGasto ();
		double gastoFev = fevereiro.somaGasto ();
		
		if (gastoJan > gastoFev) {
			System.out.println ("o gasto em janeiro foi maior:");
			
		}
		else if (gastoFev > gastoJan ) {
			System.out.println ("o gasto em fevereiro foi maior:");
		}
		else {
			System.out.println ("ambos tiveram os mesmos gastos:");
		}
	}
	

}
