package com.Yulia.chainResponsibility;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BuildingChains.normalPayment(true, true, true, false);
        System.out.println();
        BuildingChains.countryPayment(true, true, true, true, true);
        System.out.println();
        BuildingChains.insideBankPayment(false, true, true, true, true);
        System.out.println();
        BuildingChains.privilegyPayment(true, false, true, true, true);
    }

}
