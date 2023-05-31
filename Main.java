package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Drzewo wisnia1 = new Drzewo("wisnia", 10, 1, true, 3, 2);
        Drzewo grucha1 = new Drzewo("grucha", 15, 2, true, 7, 3);
        Krzew jagoda1 = new Krzew("jagoda", 6, 1, false, 5, 3);

        Dorosly andrzej = new Dorosly("Andrzej", 2, 10, 1, 0);
        Dorosly maja = new Dorosly("Maja", 2, 10, 3, 5);
        Dziecko piotr = new Dziecko("Piotr", 1, 5, 1, 6);
    }
}