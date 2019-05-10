package com.Yulia.prototype;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Article> articles = Prototype.getArticles();
        System.out.println("Article name:\t");
        Scanner scanner = new Scanner(System.in);
        Article article = searchForName(scanner.nextLine(),articles);
        article.setArticleContent("I have changed!");

        List<Article> prototypes = Prototype.getArticles();

        for (int i =0; i < articles.size(); i++){
            System.out.println(articles.get(i).getArticleName() + "\t" +
                    articles.get(i).getArticleContent() + "\t" + prototypes.get(i).getArticleContent());
        }
    }

    public static Article searchForName(String name, List<Article> prototypes){
        for(int i = 0; i < prototypes.size(); i++){
            if(prototypes.get(i).getArticleName().equalsIgnoreCase(name))
                return prototypes.get(i);
        }
        return null;
    }
}
