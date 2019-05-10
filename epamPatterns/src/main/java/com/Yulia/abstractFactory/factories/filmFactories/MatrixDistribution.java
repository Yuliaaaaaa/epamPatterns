package com.Yulia.abstractFactory.factories.filmFactories;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.products.Film;
import com.Yulia.abstractFactory.products.Matrix;

public class MatrixDistribution implements FilmDistribution {
    public Film createFilm(LanguageFactory languageFactory) {
        return new Matrix(languageFactory.getSoundtrack(), languageFactory.getSubs());
    }
}
