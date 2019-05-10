package com.Yulia.flyweight;

public abstract class Bacteria {
    private static boolean exists;

    public Bacteria(){
        exists = true;
    }


    abstract void bacteryInfo();

    /*void breeding(int number){
        bacteryInfo();
        if(number>numberOfType){
            System.out.println("We can't breed!");
            return;
        }
        else if(number == 1)
            System.out.println("I am breeding!");
        else
            System.out.println("We are breeding!");
        System.out.println("Our colony had " + numberOfType + " bacteries");
        numberOfType+=number;
        System.out.println("Now we have " + numberOfType + " bacteries");
    }*/

    public Bacteria breed(){
        return this;
    }


}
