package EXEMPLO;

public class CARRO {
	//Atributos
	
	double motor;
	String fabricante;
	String modelo;
	int ano;
	String placa;
	String cor;
	int velocidade;
	
	public void exibirInfo() {
		System.out.println(
				"Fabricante: " + fabricante +
				" Modelo: " + modelo +
				"Cor: " + cor +
				"Placa: " + placa +
				"motor:" + motor +
				"velocidade: " + velocidade 			
				);
	
	}
	
}
