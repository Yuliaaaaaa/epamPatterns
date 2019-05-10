package com.Yulia.statePattern;

import java.util.Scanner;

public class Accepted implements DocumentState {
    public void printInfo() {

    }

    public DocumentState changeState() {
        System.out.println("Insert state to change:");
        Scanner scanner = new Scanner(System.in);
        String state = scanner.nextLine();
        switch (StateTransform.transforming(state)){
            case ACCEPTED:{
                System.out.println("Already here!\n");
                return this;
            }
            case RECALLED:{
                return new Recalled();
            }
            default:{
                System.out.println("Unable!\n");
                return this;
            }
        }
    }
}
