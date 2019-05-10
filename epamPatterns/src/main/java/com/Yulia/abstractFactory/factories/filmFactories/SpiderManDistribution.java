package com.Yulia.abstractFactory.factories.filmFactories;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.products.Film;
import com.Yulia.abstractFactory.products.SpiderMan;

public class SpiderManDistribution implements FilmDistribution {
    public Film createFilm(LanguageFactory languageFactory) {
        return new SpiderMan(languageFactory.getSoundtrack(), languageFactory.getSubs());
    }
}
