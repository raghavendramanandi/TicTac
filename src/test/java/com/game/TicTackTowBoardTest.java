package com.game;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TicTackTowBoardTest {

    @Test
    public void ShouldPrintAnEmptyBoard(){
        Board board = new TicTackTowBoard();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outContent);
        System.setOut(stream);

        board.printGrid(System.out);

        assertEquals("- - - \n" +
                        "- - - \n" +
                        "- - - \n"
                , outContent.toString()
        );
    }



}