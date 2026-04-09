package alanrickmanquizjava;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner (System.in);
		
		
		System.out.println("Olá, Bem Vindo(a) ao quiz sobre Alan Rickman");
		System.out.println("Deseja jogar o quiz? /n Marque 1 para 'SIM' e 2 para 'NÃO'");
		int opcao = entradaDados.nextInt();
		
		if(opcao == 1) {
			int resposta;
			int nota = 0;
			
			System.out.println("Como jogar: leia as perguntas atentamente e mande a letra correspondente da alternativa que você achar correto. /n Serão 5 alternativas. A, B, C, D e E. /n Bom jogo! /n");
			
			System.out.println("Pergunta número 1: \n Em qual saga Alan Rickman interpretou Severus Snape? \n 1 - Harry Potter \n 2 - Senhor dos Aneis \n"
					+ " 3 - Star wars \n 4 - As Crônicas de Nárnia");
			resposta = entradaDados.nextInt();
			if (resposta == 1) {
				nota++;
			}
			
			System.out.println("Pergunta número 2: \n Qual personagem Alan Rickman interpretou no filme Die Hard? \n 1 - John McClane \n 2 - Al Powell \n"
					+ " 3 - Hans Gruber \n 4 - Holly Gennaro");			
			resposta = entradaDados.nextInt();
			if (resposta == 3) {
				nota++;
			}
			
			System.out.println("Pergunta número 3: \n Em que país Alan Rickman nasceu? \n 1 - Estados Unidos \n 2 - Inglaterra \n"
					+ " 3 - Escócia \n 4 - Irlanda");
			resposta = entradaDados.nextInt();
			if (resposta == 2) {
				nota++;
			}
			
			System.out.println("Pergunta número 4: \n Qual profissão artística Alan Rickman também exerceu além de ator de cinema?"
					+ " \n 1 - Bailarino profissional \n 2 - Pintor \n"
					+ " 3 - Cantor de ópera \n 4 - Ator de teatro");
			resposta = entradaDados.nextInt();
			if (resposta == 4) {
				nota++;
			}
			
			System.out.println("Pergunta número 5: \n Qual destes personagens foi interpretado por Alan Rickman em Robin Hood: Prince of Thieves?"
					+ " \n 1 - Robin Hood \n 2 - Little John \n"
					+ " 3 - Xerife de Nottingham \n 4 - Rei Ricardo");
			resposta = entradaDados.nextInt();
			if (resposta == 3) {
				nota++;
			}
			
			System.out.println("Pergunta número 6: \n Em Alice in Wonderland (2010), Alan Rickman deu voz a qual personagem?"
					+ " \n 1 - Lagarta Azul \n 2 - A Centopeia \n"
					+ " 3 - Gato de Cheshire \n 4 - Coelho Branco");
			resposta = entradaDados.nextInt();
			if (resposta == 1) {
				nota++;
			}
			
			System.out.println("Pergunta número 7: \n Qual destes filmes conta com Alan Rickman no elenco?"
					+ " \n 1 - Titanic \n 2 - Love Actually \n"
					+ " 3 - Gladiador \n 4 - Matrix");
			resposta = entradaDados.nextInt();
			if (resposta == 2) {
				nota++;
			}
			
			System.out.println("Pergunta número 8: \n Como se chama o personagem interpretado por Alan Rickman em Sense and Sensibility?"
					+ " \n 1 - Coronel Brandon \n 2 - Sr. Darcy \n"
					+ " 3 - Edward Ferrars \n 4 - Willoughby");
			resposta = entradaDados.nextInt();
			if (resposta == 1) {
				nota++;
			}
			
			System.out.println("Pergunta número 9: \n Alan Rickman ficou muito conhecido por interpretar personagens com presença marcante. Qual destas características combina bastante com muitos de seus papéis?"
					+ " \n 1 - Humor infantil exagerado \n 2 - Elegância e intensidade \n"
					+ " 3 - Falta de seriedade \n 4 - Personagens sempre atléticos e impulsivos");
			resposta = entradaDados.nextInt();
			if (resposta == 2) {
				nota++;
			}
			
			System.out.println("Pergunta número 10: \n Qual destes nomes está ligado a Alan Rickman?"
					+ " \n 1 - Aragorn \n 2 - Tony Stark \n"
					+ " 3 - Jack Sparrow /n 4 - Severus Snape\n ");
			resposta = entradaDados.nextInt();
			if (resposta == 4) {
				nota++;
			}
			
			System.out.println("Sua nota do quiz foi: " + nota);
			System.out.println("\n Muito Obrigado Por Jogar!");
					
		} else if (opcao >= 5 || opcao < 1){
			
			System.out.println("A alternativa precisa ser maior que 0 e menor que 5");
			
		} else {
			System.out.println("Até mais!");
		}
		
		entradaDados.close();
		
	}
}
