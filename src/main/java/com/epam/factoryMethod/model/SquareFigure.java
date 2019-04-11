package com.epam.factoryMethod.model;

public class SquareFigure extends TetrisFigureFactory {
    private final FigureBlock build1 = new FigureBlock(0,0);
    private final FigureBlock build2 = new FigureBlock(0,1);
    private final FigureBlock build3 = new FigureBlock(1,0);
    private final FigureBlock build4 = new FigureBlock(1,1);

    public void build() {
        super.build();
        System.out.println("[][]");
        System.out.println("[][]");
    }
}
