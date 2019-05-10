package com.Yulia.strategy;

public class Vampire extends CharacterStrategy {
    protected Vampire() {
        super(true, false, true);
    }

    public void characterInfo() {
        System.out.println("I am vampire!");
    }
}
