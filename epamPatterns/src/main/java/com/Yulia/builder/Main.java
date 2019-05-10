package com.Yulia.builder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Recipe recipe = new Recipe("eat sweet", new Date(122, 11, 2));
        System.out.println(recipe.toString());
        recipe.getBuilder().changeExpireDate(new Date(123, 11, 5));
        System.out.println(recipe.toString());
    }
}
