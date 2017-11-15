package io.hexlet.java.m101.xo.model;

/**
 * Created by 1 on 05.03.2017.
 */
public class Board {

  private static final int SIZE_FIELD = 9;

  private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

  public void initArray() {
    figures[0][0] = new Figure("O");
    figures[2][2] = new Figure("X");
  }

  public void showBoards() {
    System.out.println(Arrays.toString(this.figures));
  }
  @Override
  public String toString() {
    return this.figure;
  }
}
