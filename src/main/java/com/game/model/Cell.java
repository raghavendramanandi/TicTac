package com.game.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Cell {

    @Getter @Setter
    private int x;

    @Getter @Setter
    private int y;

    @Getter @Setter
    private char value;
}
