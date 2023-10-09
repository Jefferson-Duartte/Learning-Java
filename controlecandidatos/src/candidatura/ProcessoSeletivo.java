package candidatura;

import java.util.Random;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE", "MARCIA" , "JULIA", "PAULO", "AUGUSTO"};

		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
			
			int tentativasRealizadas = 1;
			boolean continuarTentando = true;
			boolean atendeu=false;
			do {
				atendeu= atender();
				continuarTentando = !atendeu;
				if(continuarTentando)
					tentativasRealizadas++;
				else
					System.out.println("CONTATO REALIZADO COM SUCESSO");
				
			}while(continuarTentando && tentativasRealizadas<3);
			
			if(atendeu)
				System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
			else
				System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
			
			
		}
		
		static boolean atender() {
			return new Random().nextInt(3)==1;	
		}
	
	
	static void imprimirCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA" , "JULIA", "PAULO", "AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

		for(int i =0; i < candidatos.length; i++) {
			System.out.println("O candidato de n ° " + (i+1) + " é: " + candidatos[i]);
		}
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
			
		
	}
	
	static void analisarCandidato (double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contraproposta");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
		
	}
	
}
