package io.hexlet.java.m101.xo.controller;

import io.hexlet.java.m101.xo.model.Player;

/**
 * Created by 1 on 05.03.2017.
 */
public class Game {

    private static final String GAME_NAME = "XO";

    private Player[] players;

    public String getGameName() {
        return GAME_NAME;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y) {
        return false;
    }

    public Player[] getPlayers() {
        return players;
    }
}


