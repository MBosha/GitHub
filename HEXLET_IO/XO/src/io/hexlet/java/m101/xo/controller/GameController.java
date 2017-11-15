package io.hexlet.java.m101.xo.controller;

import io.hexlet.java.m101.xo.model.Player;

public class GameController {

    private final static int MIN_COORDINATE = 0;

    private final static int MAX_COORDINATE = 3;

    private final String gameName;

    private final Board board;

    private Player[] players;

    public GameController (String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public Board getBoard() {
      return board;
    }

    public boolean move(final int x, final int y) {
        if (!checkCoordinate(x) || !checkCoordinate(y)) {
            return false;
        }

        //TODO

        else {
            return true;
        }

    }

    public Player[] getPlayers() {
        return players;
    }

    private static boolean checkCoordinate(final int coordinate) {
        if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) {
            return false;
        }
        else return true;
    }


}
