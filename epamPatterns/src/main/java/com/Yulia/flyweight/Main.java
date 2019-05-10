package com.Yulia.flyweight;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BacteriaType1 bacteriaType1 = new BacteriaType1();
        Bacteria newBacteria = bacteriaType1.breed();
        System.out.println((Object) bacteriaType1 + "\n" + (Object) newBacteria);
    }
}
