package com.Yulia.prototype;

import java.util.LinkedList;
import java.util.List;

public class Prototype{
    private static List<Article> articles = new LinkedList<Article>();



    static {
        addToPrototype(new CarArticle("BMW", "I am a prototype about BMW"));
        addToPrototype(new CarArticle("Skoda", "I am a prototype about Skoda"));
        addToPrototype(new CarArticle("Lamborghini", "I am a prototype about Lamborghini"));
        addToPrototype(new AnimalArticle("Cats", "I am a prototype about Cats"));
        addToPrototype(new AnimalArticle("Dogs", "I am a prototype about Dogs"));
        addToPrototype(new AnimalArticle("Pigs", "I am a prototype about Pigs"));
        addToPrototype(new AnimalArticle("Horses", "I am a prototype about Horses"));
    }


    public static List<Article> getArticles() {
        List<Article> newArticles = new LinkedList<Article>();
        for(int i = 0; i < articles.size(); i++){
            newArticles.add((Article) articles.get(i).clone());
        }
        return newArticles;
    }

    public static void addToPrototype(Article article){
        articles.add(article);
    }
}
