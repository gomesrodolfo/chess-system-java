package boardgame;

public class Piece {

    protected ChessPosition position;
    protected Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

}
