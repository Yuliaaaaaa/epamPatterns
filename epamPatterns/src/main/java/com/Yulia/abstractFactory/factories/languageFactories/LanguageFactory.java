package com.Yulia.abstractFactory.factories.languageFactories;

public class LanguageFactory {
    private Subtitles subs;
    private Soundtrack soundtrack;

    public LanguageFactory(Subtitles subs, Soundtrack soundtrack) {
        this.subs = subs;
        this.soundtrack = soundtrack;
    }


    public Subtitles getSubs() {
        return subs;
    }

    public Soundtrack getSoundtrack() {
        return soundtrack;
    }
}

