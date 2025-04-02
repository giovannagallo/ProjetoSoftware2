package novolivro;

public class novoLivro {

		//Atributos
	
		public String livro;
		public String autor;
		public int quantidade;
		public double valorUnit;
	
		//Metodos 
		public String exibeInfo() {
			return " Livro: " + livro +
					"\nAutor: " + autor +
					"\nQuantidade: " + quantidade +
					"\nValor Unitario: " + valorUnit;
	
	}

}
