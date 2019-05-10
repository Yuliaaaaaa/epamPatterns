package com.Yulia.compositeMethod.model;

public class MultiplyingComposite implements MathOperation{

    private double number;
    private SumOperation sumOperation;

    public MultiplyingComposite(double number, SumOperation sumOperation) {
        this.number = number;
        this.sumOperation = sumOperation;
    }

    public double doMathOperation() {
        MultipleOperation operation = new MultipleOperation(number, sumOperation.doMathOperation());
        return operation.doMathOperation();
    }
}
