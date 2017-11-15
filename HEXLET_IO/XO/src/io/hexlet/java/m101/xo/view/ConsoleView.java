package io.hexlet.java.m101.xo.view;

import io.hexlet.java.m101.xo.controller.Game;


public class ConsoleView {

  protected final GameController gameController;

    public void show(final Game game) {}

    public boolean move(final Game game) {
        return false;
    }

    public void showBoard() {
      System.out.println(gameController.getBoard().getFigure(0,0));

    }

    public void show(Game game) {
        System.out.println("show");
    }
}
