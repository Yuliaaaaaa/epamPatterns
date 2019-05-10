package com.Yulia.abstractFactory.products;

import com.Yulia.abstractFactory.factories.languageFactories.LanguageFactory;
import com.Yulia.abstractFactory.factories.languageFactories.Soundtrack;
import com.Yulia.abstractFactory.factories.languageFactories.Subtitles;

public abstract class Film {
    private Soundtrack soundLanguage;
    private Subtitles subLanguage;


    public Film(Soundtrack soundLanguage, Subtitles subLanguage) {
        this.soundLanguage = soundLanguage;
        this.subLanguage = subLanguage;
    }

    public abstract void outputFilmInfo();
    public void outputLanguageInfo(){
        System.out.println("Sound language:\t" + soundLanguage);
        System.out.println("Sub language:\t" + subLanguage);
    }


    public void setSoundAndSubtitlesLanguage(LanguageFactory languageFactory){
        soundLanguage = languageFactory.getSoundtrack();
        subLanguage = languageFactory.getSubs();
    }


}
