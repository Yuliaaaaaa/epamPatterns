package com.Yulia.abstractFactory.factories.filmFactories;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.products.Film;
import com.Yulia.abstractFactory.products.PiratesOfCaribbean;

public class PiratesOfCaribbeanDistribution implements FilmDistribution {
    public Film createFilm(LanguageFactory languageFactory) {
        return new PiratesOfCaribbean(languageFactory.getSoundtrack(), languageFactory.getSubs());
    }
}
