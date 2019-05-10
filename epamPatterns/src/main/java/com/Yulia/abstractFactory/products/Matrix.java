package com.Yulia.abstractFactory.products;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.factories.languageFactories.Soundtrack;
import com.Yulia.abstractFactory.factories.languageFactories.Subtitles;

public class Matrix extends Film {


    public Matrix(Soundtrack soundLanguage, Subtitles subLanguage) {
        super(soundLanguage, subLanguage);
    }

    public void outputFilmInfo() {
        System.out.println("MATRIX");
        this.outputLanguageInfo();
    }
}
