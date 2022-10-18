package boardgame;

//classe tabuleiro
public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if(rows>1 || columns>1) { //Teste de quantidade de linhas e colunas no tabuleiro.
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {//checa posição existente.
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		if(!positionExists(position)) {//checa posição existente.
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//coloca as pecas no lugar
	public void placePiece(Piece piece, Position position) {
		if(ThereIsAPiece(position)) {//checa se já não tá ocupada a posição.
			throw new BoardException("There is already a piece on position "+position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column > 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean ThereIsAPiece(Position position) {
		if(!positionExists(position)) {//checa posição existente.
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
