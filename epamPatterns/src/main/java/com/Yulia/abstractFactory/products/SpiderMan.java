package com.Yulia.abstractFactory.products;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.factories.languageFactories.Soundtrack;
import com.Yulia.abstractFactory.factories.languageFactories.Subtitles;

public class SpiderMan extends Film {


    public SpiderMan(Soundtrack soundLanguage, Subtitles subLanguage) {
        super(soundLanguage, subLanguage);
    }

    public void outputFilmInfo() {
        System.out.println("SPIDERMAN");
        this.outputLanguageInfo();
    }
}
