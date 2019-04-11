package com.epam.factoryMethod.system;

import com.epam.factoryMethod.model.Figures;
import com.epam.factoryMethod.model.TetrisFigureFactory;

public class FigureRandomizer {
    public static void start(){
        int randomNum = 1 + (int)(Math.random()*6);
        Figures figures = Figures.UNDEFINED;
        switch (randomNum){
            case 1:{
                figures = Figures.HORIZONTAL;
                break;
            }
            case 2:{
                figures = Figures.VERTICAL;
                break;
            }
            case 3:{
                figures = Figures.SQUARE;
                break;
            }
            case 4:{
                figures = Figures.S_SHAPE;
                break;
            }
            case 5:{
                figures = Figures.SUPERVERTICAL;
                break;
            }
            case 6:{
                figures = Figures.SUPERHORIZONTAL;
                break;
            }
            default:{
            }
        }

        TetrisFigureFactory.getFigure(figures).build();
    }
}
