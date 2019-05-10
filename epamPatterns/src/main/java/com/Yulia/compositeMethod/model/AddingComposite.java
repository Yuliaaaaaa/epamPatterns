package com.Yulia.compositeMethod.model;

import java.util.LinkedList;
import java.util.List;

public class AddingComposite implements MathOperation{

    private MathOperation operation1;
    private MathOperation operation2;

    public AddingComposite(MathOperation operation1, MathOperation operation2) {
        this.operation1 = operation1;
        this.operation2 = operation2;
    }


    public double doMathOperation() {
        SumOperation operation = new SumOperation(operation1.doMathOperation(), operation2.doMathOperation());
        return operation.doMathOperation();
    }
}
