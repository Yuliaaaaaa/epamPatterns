package com.Yulia.abstractFactory.factories.filmFactories;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.products.Film;
import com.Yulia.abstractFactory.products.FindingNemo;

public class FindingNemoDistribution implements FilmDistribution {
    public Film createFilm(LanguageFactory languageFactory) {
        return new FindingNemo(languageFactory.getSoundtrack(), languageFactory.getSubs());
    }
}
