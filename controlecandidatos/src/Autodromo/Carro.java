package Autodromo;

public class Carro  extends Veiculo{
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro Ligado");
	}
	
	public void confereCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	
	
	public void confereCambio() {
		System.out.println("Conferindo o cambio");
	}
}
