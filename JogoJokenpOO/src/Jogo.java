import javax.swing.JOptionPane;

public class Jogo {


	private static int placarJogador = 0;
	private static int placarComputador = 0;
	
	//Escolhas
	// 1 - Pedra 2 - Papel 3 - Tesoura
	
	private static double escolhaJogador;
	private static int escolhaComputador;
	
	public void play() {
		
		aberturaJogo();
		
	}
		
	
		
	private static void aberturaJogo() {
		
				double rodadas = 0;
				int reiniciaJogo = 0;
				rodadas = Double.parseDouble(JOptionPane.showInputDialog("\n : : : JOKENPÔ : : : \n"
																		+ "\n : : : Digite a quantidade de rodadas: "));
				
				
				if (rodadas >= 1) {
				
				
				for (int i = 1; i <= rodadas; ++i) { 
					escolhaComputador = (int)(Math.random()*3) + 1; //gera 3 números aleatórios
					rotuloEscolhaJogador();
					mostrarResultados();
					verificarResultado();
					exibirPlacar();
					
					
				}
				ganhouJogo();
				zerarPontuacao();
				
				} else {
					
					JOptionPane.showMessageDialog(null,"-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-==-=-=-"
												+ "\n Coloque uma quantidade igual ou maior que 1"
												+ "\n -=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-==-=-=-");  
				}
					reiniciaJogo = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");
				
					while(reiniciaJogo == 0){
						double rodadasN = 0;
						
						rodadasN = Double.parseDouble(JOptionPane.showInputDialog(" : : : JOKENPÔ : : : "
								+ "\n : : : Digite a quantidade de rodadas: "));
						
						if(rodadasN >= 1) {
							
						
						for (int i = 1; i <= rodadasN; ++i) { 
							escolhaComputador = (int)(Math.random()*3) + 1; //gera 3 números aleatórios
							rotuloEscolhaJogador();
							mostrarResultados();
							verificarResultado();
							exibirPlacar();
							
							
				}		
				ganhouJogo();
				zerarPontuacao();
				
				reiniciaJogo = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");
		
				} else {
				
				JOptionPane.showMessageDialog(null,"-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-==-=-=-"
											+ "\n Coloque uma quantidade igual ou maior que 1"
											+ "\n -=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-==-=-=-");  
			}
			}
					
				JOptionPane.showMessageDialog(null,"*-=*-=*-=*-=*-=*-=*-=*-=*"	
												+ "\n OBRIGADO POR JOGAR!"
												+ "\n *-=*-=*-=*-=*-=*-=*-=*-=*");

				
					
					

						
	}
	
	private static void exibirPlacar() {
		
		JOptionPane.showMessageDialog(null,": : : PLACAR"
									+ "\nJogador: " + placarJogador
								 	+ "\nComputador: " + placarComputador);
		
	}
	
	private static void verificarResultado() {
		
		if(escolhaJogador == escolhaComputador) {
			
			JOptionPane.showMessageDialog(null,"-----------------------------------------"
										+"\nESSA RODADA DEU EMPATE!!"
										+"\n-----------------------------------------");     //1 - Pedra 2 - Papel 3 - Tesoura
			
		} else if ((escolhaJogador == 1 && escolhaComputador == 3)/*pedra ganha tesoura*/
		|| (escolhaJogador == 2 && escolhaComputador == 1) /* papel ganha pedra*/
		|| (escolhaJogador == 3 && escolhaComputador == 2))/* tesoura ganha papel*/{
			
			JOptionPane.showMessageDialog(null,"---------------------------------------------------"
										+"\nJOGADOR GANHOU ESSA RODADA!"
										+"\n---------------------------------------------------");
				darPontoJogador();
		} else {
			JOptionPane.showMessageDialog(null,"-----------------------------------------"
										+"\nCOMPUTADOR GANHOU ESSA RODADA!"
										+"\n-----------------------------------------");
				darPontoComputador();
		}
	}
	private static void rotuloEscolhaJogador() {
		
		escolhaJogador = Double.parseDouble(JOptionPane.showInputDialog(": : : Escolha: "
																		+ "\n 1 - Pedra"
																		+ "\n 2 - Papel"
																		+ "\n 3 - Tesoura"));
		
	}
	private static void mostrarResultados() {
		
		if (escolhaJogador == 1) {
			JOptionPane.showMessageDialog(null,"Você escolheu: " + escolhaJogador + " - Pedra");
		} else if (escolhaJogador == 2) {
			JOptionPane.showMessageDialog(null,"Você escolheu: " + escolhaJogador + " - Papel");
		} else if (escolhaJogador == 3) {
			JOptionPane.showMessageDialog(null,"Você escolheu: " + escolhaJogador + " - Tesoura"); } 
		if (escolhaComputador == 1) {
			JOptionPane.showMessageDialog(null,"Computador escolheu: " + escolhaComputador + " - Pedra");
		} else if (escolhaComputador == 2) {
			JOptionPane.showMessageDialog(null,"Computador escolheu: " + escolhaComputador + " - Papel");
		} else if (escolhaComputador == 3) {
			JOptionPane.showMessageDialog(null,"Computador escolheu: " + escolhaComputador + " - Tesoura"); 
			}
	}
	private static void ganhouJogo() {
		
		if(placarJogador == placarComputador) {
			JOptionPane.showMessageDialog(null,"---------------------------"
										+ "\n O JOGO EMPATOU!!!"
										+ "\n---------------------------");
		} else if(placarJogador > placarComputador) {
			JOptionPane.showMessageDialog(null,"--------------------------------------------"
										+ "\n Parabéns você ganhou o jogo!!"
										+ "\n--------------------------------------------");
		} else {
			JOptionPane.showMessageDialog(null,"--------------------------------------------"
										+ "\n Computador ganhou o jogo!!"
										+ "\n--------------------------------------------");
		}
	}
	private static void zerarPontuacao() {
		
		placarJogador = 0;
		placarComputador = 0;
	}
	private static void darPontoJogador() {
		placarJogador += 1;
	}
	private static void darPontoComputador() {
		placarComputador += 1;
	}
}
