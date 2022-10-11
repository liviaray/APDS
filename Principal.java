package Visao;
import java.util.Scanner;
import Dominio.Dado;
import Dominio.Hello;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner userInputScanner = new Scanner(System.in);
		
		Dado dado = new Dado();
		
		int count = 0;
		
		boolean acertou = false;
		
		String entrada;
		
		Hello h = new Hello();
		
		h.oi();
		h.Falar();
		
		System.out.println("Jogo do Dado");
		System.out.println("Teste sua sorte");
		System.out.println("O jogo termina quando voce tirar o numero 6 ou atingir 10 tentativas");
		
		while(count < 10 && acertou == false){
			System.out.println("Tentativa de numero: "+count);
			System.out.println("Escreva 'jogar' para tentar: ");
			
			entrada = userInputScanner.nextLine();
			
			if("jogar".equalsIgnoreCase(entrada)){
				count++;
				dado.jogarDado();
				System.out.println("Voce tirou: "+dado.getNumero());
				
				if(dado.getNumero() == 6){
					acertou = true;
				}
			}
		} 
		
		if(acertou == true){
			System.out.println("Parabens! Voce acertou em "+count+" jogadas");
		} else {
				System.out.println("Que pena! Tente novamente");
		}
		
	}
}