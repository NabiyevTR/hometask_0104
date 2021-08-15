package ru.geekbrains.ntr_0104;


import ru.geekbrains.ntr_0104.players.AIIPlayer;
import ru.geekbrains.ntr_0104.players.HumanPlayer;

import static ru.geekbrains.ntr_0104.TicTacToeGame.ticTacToeGame;

public class Main {

    public static void main(String[] args) {
        {

            HumanPlayer vasya = new HumanPlayer("Вася");
            AIIPlayer skyNet = new AIIPlayer("SkyNet");
            AIIPlayer alisa = new AIIPlayer("Алиса");
            ticTacToeGame(vasya, skyNet);
            ticTacToeGame(alisa, skyNet);
        }
    }
}
