package application;

import boardgame.Board;
import boardgame.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {

        Board board = new Board(8,8);
        System.out.println(board);
    }
}
