package com.game;

import com.game.model.Cell;

import java.io.PrintStream;

public class TicTackTowBoard implements Board {
    private Cell[][] cells;

    public TicTackTowBoard() {
        cells =  new Cell[3][3];
        initializeCells(cells, '-');
    }

    private void initializeCells(Cell[][] cells, char initialValue) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(i, j, initialValue);
            }
        }
    }

    public void printGrid(PrintStream out) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                out.print(cells[i][j].getValue() + " ");
            }
            out.println();
        }

    }
}
