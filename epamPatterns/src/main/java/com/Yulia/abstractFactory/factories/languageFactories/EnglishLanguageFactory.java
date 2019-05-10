package com.Yulia.abstractFactory.factories.languageFactories;

public class EnglishLanguageFactory extends LanguageFactory {
    public EnglishLanguageFactory()
    {
        super(new EnglishSubtitles(), new EnglishSoundtrack());
    }
}
