package com.example;

public abstract class Figure {
    protected int[] sides;

    public int perimetr() {
        Integer p = 0;
        for (int i=0; i<sides.length; i++) {
            p += sides[i];
        }

        return p;
    }

    public abstract int square();
}

