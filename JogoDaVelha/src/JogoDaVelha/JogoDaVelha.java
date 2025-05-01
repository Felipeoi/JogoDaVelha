package JogoDaVelha;
import java.util.Scanner;


public class JogoDaVelha {

	public static char[][] tabuleiro = {
			{' ', ' ',' '},
			{' ', ' ',' '},
			{' ', ' ',' '}
			
    };
	private static char jogadorAtual = 'X';
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean jogoAtivo = true;
		
		while (jogoAtivo) {
			imprimirTabuleiro();
			System.out.println("Jogador " + jogadorAtual + ", difite sua jogada (linha e coluna de 0 a 2):");
			int linha = scanner.nextInt();
			int coluna = scanner.nextInt();
			
		 if (linha < 0|| linha > 2 || coluna < 0 || coluna >2 || tabuleiro[linha] [coluna] != ' ' ) {
			 System.out.println("Jogada invalida! Tente novamente.");
			 continue;
		 }
		 
		 tabuleiro[linha][coluna] = jogadorAtual;
		 
		 if (verificarVencedor()) {
			 imprimirTabuleiro();
			 System.out.println("Jogador" + jogadorAtual + "venceu !!");
			 jogoAtivo = false;
		 } else if (tabuleiroCheio()) {
			 imprimirTabuleiro();
			 System.out.println("Empate!");
			 jogoAtivo = false;
		 } else {
			 jogadorAtual = (jogadorAtual == 'X') ? '0' : 'X';
		 }
		 
	}
	
	   scanner.close();

  }


  public static void imprimirTabuleiro() {
	   System.out.println("-----------");
	   for (int i= 0; i<3; i++) {
		   System.out.print("| ");
		   for (int j = 0; j < 3; j++) {
			   System.out.print(tabuleiro[i][j] + " | ");
		   }
		   System.out.println("\n----------------");
	   }
  }
  
  public static boolean verificarVencedor() {
	  //verificar linhas
	  for (int i = 0; i < 3; i++) {
		  if (tabuleiro[i][0] == jogadorAtual &&
			  tabuleiro[i][1] == jogadorAtual &&
			  tabuleiro[i][2] == jogadorAtual) {
			  
			  return true;
	  }
	}
	  
	  //verificar colunas
	  
	  for (int i = 0; i < 3; i++) {
		  if (tabuleiro[0][i] == jogadorAtual &&
			  tabuleiro[1][i] == jogadorAtual &&
			  tabuleiro[2][i] == jogadorAtual) {
			  
			  return true;
	  }
	
	  }
	  
	  //verificar diagonais
	 
		  if (tabuleiro[0][0] == jogadorAtual &&
			  tabuleiro[1][1] == jogadorAtual &&
			  tabuleiro[2][2] == jogadorAtual) {
			  
			  return true;
	  }
		  
	
			  if (tabuleiro[0][2] == jogadorAtual &&
				  tabuleiro[1][1] == jogadorAtual &&
				  tabuleiro[2][0] == jogadorAtual) {
				  
				  return true;
		  }
		
		  
	return false;
  }
  
  public static boolean tabuleiroCheio() {
	  for(int i = 0; i < 3; i++) {
		  for (int j = 0; j < 3; j++) {
			  if (tabuleiro[i][j] == ' ') {
				  
				  return false;
			  }
		  }
	  }
	  
	  return true;
  
  }
  
  
  }
	
	
	
	
	
	
	
	
