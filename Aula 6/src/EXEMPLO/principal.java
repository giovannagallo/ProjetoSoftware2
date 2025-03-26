package EXEMPLO;

public class principal {

	public static void main(String[] args) {
		
		CARRO civic = new CARRO();
		
		civic.fabricante = "Honda";
		civic.modelo = "civic";
		civic.modelo = "2.0";
		civic.placa = "CAP0330";
		civic.cor = "prata";
		civic.velocidade = 0;
		civic.ano = 2024;
		civic.exibirInfo();
		
		CARRO corolla = new CARRO ();
		corolla.fabricante= "Toyota";
		corolla.modelo = "corolla";
		corolla.motor = 2.0;
		corolla.placa = "EUC-2015";
		corolla.cor = "preto";
		corolla.ano = 2023;
		corolla.velocidade =0;
		corolla.exibirInfo();
		
		CARRO azera = new CARRO ();
		azera.fabricante = "Hyundai";
		azera.modelo = "azera";
		azera.motor = 3.3;
		azera.placa = "EBJ-5606";
		azera.cor = "preto";
		azera.ano = 2010;
		azera.velocidade = 200;
		azera.exibirInfo();		
		

	}

}
