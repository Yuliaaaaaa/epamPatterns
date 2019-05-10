package com.Yulia.abstractFactory.factories.filmFactories;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.products.Film;

public interface FilmDistribution {
    Film createFilm(LanguageFactory languageFactory);
}
