package com.Yulia.statePattern;

public class StateTransform {
    public static State transforming(String state){
        return State.valueOf(state.toUpperCase());
    }
}
