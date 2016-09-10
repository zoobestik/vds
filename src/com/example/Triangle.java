package com.example;

public class Triangle extends Figure {
    public Triangle(int a, int b, int c) {
        sides = new int[3];

        sides[0] = a;
        sides[1] = b;
        sides[2] = c;
    }

    public Triangle(String a, String b, String c) {
        this(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c));
    }

    @Override
    public int square() {
        return sides[0] * sides[1] / 2;
    }
}
