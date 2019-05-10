package com.Yulia.compositeMethod.model;

public class MultipleOperation implements MathOperation {
    private double a;
    private double b;

    public MultipleOperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double doMathOperation() {
        return a*b;
    }
}
