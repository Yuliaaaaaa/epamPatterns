package com.Yulia.abstractFactory.factories.languageFactories;

public class UkrainianLanguageFactory extends LanguageFactory {


    public UkrainianLanguageFactory() {
        super(new UkrainianSubtitles(), new UkrainianSoundtrack());
    }

}
