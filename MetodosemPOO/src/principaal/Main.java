package principaal;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		
		Livro culpaDasEstrelas = new Livro ();
		
		culpaDasEstrelas.livro = "A culpa é das estrelas";
		culpaDasEstrelas.autor = "John Grren";
		culpaDasEstrelas.quantidade = 100;
		culpaDasEstrelas.valorUnit = 80;
		culpaDasEstrelas.emprestaLivro(5);
		
		System.out.println(culpaDasEstrelas.exibeInfo());
		
		
		
	}

}
