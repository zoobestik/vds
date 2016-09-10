package com.example;

public class Rectangle extends Figure {

    public Rectangle(int a, int b) {
        sides = new int[4];

        sides[0] = a;
        sides[1] = b;
        sides[2] = a;
        sides[3] = b;
    }

    public boolean isSquare(){
        return sides[0] == sides[1];
    }

    @Override
    public int square() {
        return sides[0] * sides[1];
    }
}
