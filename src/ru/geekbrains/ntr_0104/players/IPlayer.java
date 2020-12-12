package ru.geekbrains.ntr_0104.players;

import ru.geekbrains.ntr_0104.DOTS;

public interface IPlayer {

    public void nextTurn();

    public String getName();

    public DOTS getDot();

    public void setDot(DOTS dot);
}
