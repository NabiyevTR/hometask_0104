package ru.geekbrains.ntr_0104;

import ru.geekbrains.ntr_0104.players.IPlayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TicTacToeGame {

    public static Map map;
    public static final int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static boolean gameOver = false;

    public static void ticTacToeGame(IPlayer player1, IPlayer player2) {

        int turnsCounter = 0;
        map = Map.getInstance(SIZE);
        map.printMap();
        player1.setDot(DOTS.CROSS);
        player2.setDot(DOTS.ZERO);

        while (!gameOver){
            if (turnsCounter % 2 == 0) {
                gameTurn(player1);
            } else {
                gameTurn(player2);
            }
            turnsCounter++;
        }
    }

    public static void gameTurn(IPlayer player) {
        player.nextTurn();
        map.printMap();
        if (playerWin(player)) {
            System.out.printf("Выиграл %s\n", player.getName());
            gameOver = true;
        } else if (map.isFull()) {
            System.out.println("Ничья!");
            gameOver = true;
        }

    }

    public static boolean playerWin (IPlayer player) {
        return map.hasInRow(player.getDot(), DOTS_TO_WIN);
    }
}

