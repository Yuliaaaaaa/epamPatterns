package com.Yulia.abstractFactory.factories.filmFactories;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.products.Batman;
import com.Yulia.abstractFactory.products.Film;

public class BatmanDistribution implements FilmDistribution {
    public Film createFilm(LanguageFactory languageFactory) {
        return new Batman(languageFactory.getSoundtrack(), languageFactory.getSubs());
    }
}
