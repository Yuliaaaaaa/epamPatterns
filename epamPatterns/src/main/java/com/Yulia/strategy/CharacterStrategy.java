package com.Yulia.strategy;

public abstract class CharacterStrategy {

    private boolean ableToWalk;
    private boolean ableToFly;
    private boolean usesMagic;

    protected CharacterStrategy(boolean ableToWalk, boolean ableToFly, boolean usesMagic) {
        this.ableToWalk = ableToWalk;
        this.ableToFly = ableToFly;
        this.usesMagic = usesMagic;
    }

    public void move(){
        tryToWalk();
        tryToFly();
    }

    private boolean tryToWalk(){
        if(ableToWalk){
            System.out.println("I walk!");
            return true;
        }
        return false;
    }
    private boolean tryToFly(){
        if(ableToFly){
            System.out.println("I fly!");
            return true;
        }
        else if(usesMagic){
            System.out.println("I fly using magic!");
            return true;
        }
        return false;
    }

    abstract void characterInfo();
}
