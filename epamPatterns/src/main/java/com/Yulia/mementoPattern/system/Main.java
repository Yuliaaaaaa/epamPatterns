package com.Yulia.mementoPattern.system;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kross-Zeros\n\n");
        KrossZeroAlgo krossZeroAlgo = new KrossZeroAlgo();
        View view = new View(krossZeroAlgo.getKrossZeroBoard());
        view.printBoard();
        System.out.println("\nNew\n");
        krossZeroAlgo.addSymbolAndCheckWinner((byte) 1, 1, 1);
        view.printBoard();
        System.out.println("\nNew\n");
        krossZeroAlgo.goBack();
        view.printBoard();

        System.out.println("\nNew\n");
        krossZeroAlgo.addSymbolAndCheckWinner((byte) 0, 1, 1);
        krossZeroAlgo.addSymbolAndCheckWinner((byte) 1, 0, 1);
        krossZeroAlgo.addSymbolAndCheckWinner((byte) 0, 1, 2);
        view.printBoard();

        System.out.println("\nNew\n");
        krossZeroAlgo.goBack();
        view.printBoard();


    }
}
