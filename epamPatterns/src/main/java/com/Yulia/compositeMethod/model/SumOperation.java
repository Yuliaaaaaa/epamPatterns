package com.Yulia.compositeMethod.model;

public class SumOperation implements MathOperation {

    private double a;
    private double b;

    public SumOperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double doMathOperation() {
        return a+b;
    }
}
