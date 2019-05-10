package com.Yulia.strategy;

public class Pegas extends CharacterStrategy {
    protected Pegas() {
        super(true, true, false);
    }
    public void characterInfo() {
        System.out.println("I am pegas!");
    }
}
