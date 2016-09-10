package com.example;

class App {
    public static void printFigure(Rectangle f) {
        System.out.println("Rectangle! perimetr: " + f.perimetr() + " square: " + f.square() + " isSquare: " + f.isSquare());
    }

    public static void printFigure(Figure f) {
        System.out.println("Figure! perimetr: " + f.perimetr() + " square: " + f.square());
    }

    public static Rectangle newFigure(int a, int b) {
        return new Rectangle(a, b);
    }

    public static Triangle newFigure(int a, int b, int c) {
        return new Triangle(a, b, c);
    }

    public static void main(String[] args) {
        Rectangle f1 = newFigure(1, 2);
        printFigure(f1);

        Figure f2 = newFigure(5, 5);
        printFigure(f2);

        Figure t1 = new Triangle("1", "2", "3");
        printFigure(t1);

        Figure t2 = newFigure(1, 2, 3);
        printFigure(t2);
    }
}