package com.Yulia.abstractFactory;

import com.Yulia.abstractFactory.factories.filmFactories.*;
import com.Yulia.abstractFactory.factories.languageFactories.EnglishLanguageFactory;
import com.Yulia.abstractFactory.factories.languageFactories.UkrainianLanguageFactory;
import com.Yulia.abstractFactory.products.Film;

import java.util.Scanner;

public class AbstractFactory {

    public static FilmDistribution getFilmFactory(FilmEnum films){
        FilmDistribution filmDistribution;
        switch (films){
            case BATMAN:{
                filmDistribution = new BatmanDistribution();
                break;
            }
            case MATRIX:{
                filmDistribution = new MatrixDistribution();
                break;
            }
            case SPIDER_MAN:{
                filmDistribution = new SpiderManDistribution();
                break;
            }
            case FINDING_NEMO:{
                filmDistribution = new FindingNemoDistribution();
                break;
            }
            case HARRY_POTTER:{
                filmDistribution = new HarryPotterDistribution();
                break;
            }
            case PIRATES_OF_CARIBBEAN:{
                filmDistribution = new PiratesOfCaribbeanDistribution();
                break;
            }
            case UNDEFINED:{
                throw new IllegalArgumentException("Film is undefined!");
            }
            default:{
                throw new IllegalArgumentException("Film not found!");
            }
        }
        return filmDistribution;
    }

    public static Film returnFilm(FilmDistribution filmDistribution){
        System.out.println("Insert sound language:\t");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("english"))
                return filmDistribution.createFilm(new EnglishLanguageFactory());
        if(answer.equalsIgnoreCase("ukrainian"))
                return filmDistribution.createFilm(new UkrainianLanguageFactory());
        return null;
    }


    public static void main(String[] args) {
        System.out.println("Film:\n");
        Scanner scanner = new Scanner(System.in);
        String film = scanner.next();
        Film flm = returnFilm(getFilmFactory(getEnum(film)));
        flm.outputFilmInfo();
    }

    public static FilmEnum getEnum(String film){
        return FilmEnum.valueOf(film.toUpperCase());
    }
}
