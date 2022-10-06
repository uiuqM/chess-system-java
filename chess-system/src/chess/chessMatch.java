package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

//classe partida de xadrez.
public class chessMatch {
	private Board board;//tem um tabuleiro
	
	public chessMatch() {
		board = new Board(8, 8);//inicia o tabuleiro 8x8
		initialSetup();
	}
	//metodo para retornar a matriz de pecas.
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i=0; i<board.getRows();i++) {
			for(int j=0; j<board.getColumns();j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.BLACK), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
	}
}