package application;

import boardgame.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {

        ChessPosition pos = new ChessPosition(3, 5);
        System.out.println(pos);
    }
}
