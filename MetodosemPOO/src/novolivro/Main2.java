package novolivro;

import entidades.Livro;

public class Main2 {

	public static void main(String[] args) {
	Livro oSegredo= new Livro ();
		
		oSegredo.livro = "O Segredo";
		oSegredo.autor = "Rhonda Byrne";
		oSegredo.quantidade = 100;
		oSegredo.valorUnit = 80;
		
		System.out.println(oSegredo.exibeInfo());
	}

}

