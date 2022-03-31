package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;
import boardgame.Position;

public class ChessMatch extends Board {

    private Board board;
//    private int turn;
//    private Color currentPlayer;
//    private boolean check;
//    private boolean checkMate;
//    private ChessPiece enPassantVulnerable;
//    private ChessPiece promoted;

    public ChessMatch() {
        super();
        board = new Board(8,8);
        initialSteup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][]mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i++){
            for(int j = 0 ; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return  mat;
    }

    private void initialSteup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }

}
