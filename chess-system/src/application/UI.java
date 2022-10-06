package application;

import chess.ChessPiece;

//Classe para imprimer o tabuleiro de xadrez.
public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		//pega o tamanho do tabuleiro no for e imprime a sequencia
		for(int i = 0; i<pieces.length;i++) {
			System.out.print((8-i)+" ");	//numero antes da peca
			for(int j=0; j<pieces.length;j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("  a b c d e f g h");
	}
	//printar uma peca.
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {		//Uma peca null nao iniciada eh um traco
			System.out.print("-");
		}
		else {		//peca
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
