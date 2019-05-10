package com.Yulia.abstractFactory.factories.filmFactories;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.products.Film;
import com.Yulia.abstractFactory.products.HarryPotter;

public class HarryPotterDistribution implements FilmDistribution {
    public Film createFilm(LanguageFactory languageFactory) {
        return new HarryPotter(languageFactory.getSoundtrack(), languageFactory.getSubs());
    }
}
