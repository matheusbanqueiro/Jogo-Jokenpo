<h1>Jogo JokenPOO✊✋✌</h1>

> Esse projeto simples porém bem legal para brincar com os amigos desenvolvi a pedido do meu professor da faculdade onde tive que criar um jogo de JokenPô que carinhosamente apelidei de JokenPOO!

+ Utilizei a biblioteca JOptionPane. para melhorar a interação com o usuário.
+ Para criar a validação de: quando o JOGADOR GANHA/ EMPATE/ quando o COMPUTADOR GANHA. Utilizei:

~~~Java
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
				darPontoJogador(); // MÉTODO PARA DAR PONTO AO JOGADOR
		} else {
			JOptionPane.showMessageDialog(null,"-----------------------------------------"
										+"\nCOMPUTADOR GANHOU ESSA RODADA!"
										+"\n-----------------------------------------");
				darPontoComputador();// MÉTODO PARA DAR PONTO AO COMPUTADOR
		}
	}
  
