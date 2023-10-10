package Autodromo;

public class Autodromo {
	public static void main(String[] args) {
		
		Carro jeep = new Carro();
		
		jeep.setChassi("4848418128");
		System.out.println(jeep.getChassi());
	
		jeep.ligar();
	
	
		Moto z400 = new Moto();
		z400.setChassi("52959558");
		z400.ligar();
		System.out.println(z400.getChassi());
		
		
		Veiculo coringa = jeep;
		
		coringa.ligar();
	}
	
}
