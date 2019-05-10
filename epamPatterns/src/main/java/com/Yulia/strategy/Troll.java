package com.Yulia.strategy;

public class Troll extends CharacterStrategy {
    protected Troll() {
        super(true, false, false);
    }
    public void characterInfo() {
        System.out.println("I am troll!");
    }
}
