package dio.resolucoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Desafio
* Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em jogo de pedra-papel-tesoura. 
* Atua sob o mesmo princípio básico, mas inclui outras duas armas adicionais: 
* o lagarto (formado pela mão igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star Trek). 
* Isso reduz as chances de uma rodada terminar em um empate. O jogo foi inventado por Sam Kass e Karen Bryla, 
* como "Rock Paper Scissors Lizard Spock". As regras de vantagem são as seguintes:

 - Tesoura corta papel
 - Papel cobre pedra
 - Pedra derruba lagarto
 - Lagarto adormece Spock
 - Spock derrete tesoura
 - Tesoura prende lagarto
 - Lagarto come papel
 - Papel refuta Spock
 - Spock vaporiza pedra
 - Pedra quebra tesoura

* Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um almoço para o outro, com esta brincadeira. 
* Sua missão será fazer um algoritmo que, baseado no que eles escolherem, informe quem irá ganhar ou se dará empate.

* Entrada
* Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro, representando a quantidade de casos de teste. 
* Cada caso de teste tem duas palavras, representando a escolha de Fernanda e de Marcia, respectivamente.

*Saída
*Para cada caso de teste, imprima quem venceu, ou se houve empate.
 */
public class TheBigBangTheory {

	public static class Regras {
		private String vencedor;
		private String perdedor;
		
		public Regras(String vencedor, String perdedor) {
			super();
			this.vencedor = vencedor;
			this.perdedor = perdedor;
		}
		public String getVencedor() {
			return vencedor;
		}
		public void setVencedor(String vencedor) {
			this.vencedor = vencedor;
		}
		public String getPerdedor() {
			return perdedor;
		}
		public void setPerdedor(String perdedor) {
			this.perdedor = perdedor;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casoDeTeste = sc.nextInt();
		
		sc.nextLine();
		List<Regras> regras = new ArrayList<>();
		regras.add(new Regras("tesoura", "papel"));
        regras.add(new Regras("papel", "pedra"));
        regras.add(new Regras("pedra", "lagarto"));
        regras.add(new Regras("lagarto", "spock"));
        regras.add(new Regras("spock", "tesoura"));
        regras.add(new Regras("tesoura", "lagarto"));
        regras.add(new Regras("lagarto", "papel"));
        regras.add(new Regras("papel", "spock"));
        regras.add(new Regras("spock", "pedra"));
        regras.add(new Regras("pedra", "tesoura"));
        
		for (int i = 0; i < casoDeTeste; i++) {
			List<String> palavras = Arrays.asList(sc.nextLine().split(" "));
			if (palavras.get(0).equals(palavras.get(1))) {
				System.out.println("empate");
			} else {
				boolean nomeDeQuemVence = false;
				for (Regras r : regras) {
					if (r.getVencedor().equals(palavras.get(0)) && r.getPerdedor().equals(palavras.get(1))) {
						nomeDeQuemVence = true;
						break;
					}
				}
				if (nomeDeQuemVence) {
					System.out.println("fernanda");
				} else {
					System.out.println("marcia");
				}
			}
		}
		sc.close();
		System.out.println("Fim de Jogo!");
	}
}
