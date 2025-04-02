package entidades;

public class Livro {

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
		
		
		public void emprestaLivro(int quantidade) {
			this.quantidade -= quantidade;
		
		
				
	}

	@Override
	public String toString() {
		return "Livro [livro=" + livro + ", autor=" + autor + ", quantidade=" + quantidade + ", valorUnit=" + valorUnit
				+ "]";
	}
	
}
