package com.Yulia.strategy;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CharacterStrategy> list = new LinkedList<CharacterStrategy>();

        list.add(new Pegas());
        list.add(new Harpia());
        list.add(new Vampire());
        list.add(new Ork());
        list.add(new Troll());
        list.add(new Elf());

        for (CharacterStrategy character: list) {
            character.characterInfo();
            character.move();
            System.out.println();
        }
    }
}
