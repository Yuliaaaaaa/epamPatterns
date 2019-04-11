package com.epam.factoryMethod.system;

import com.epam.factoryMethod.system.FigureRandomizer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting:");
        String res = "+";
        while (res.equals("+")){
            FigureRandomizer.start();
            System.out.println("Press + to continue:");
            res = scanner.next();

        }

    }


}
