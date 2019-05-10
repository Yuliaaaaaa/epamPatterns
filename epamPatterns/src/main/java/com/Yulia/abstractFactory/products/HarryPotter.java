package com.Yulia.abstractFactory.products;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.factories.languageFactories.Soundtrack;
import com.Yulia.abstractFactory.factories.languageFactories.Subtitles;

public class HarryPotter extends Film {

    public HarryPotter(Soundtrack soundLanguage, Subtitles subLanguage) {
        super(soundLanguage, subLanguage);
    }

    public void outputFilmInfo() {
        System.out.println("HARRY POTTER");
        this.outputLanguageInfo();
    }
}
