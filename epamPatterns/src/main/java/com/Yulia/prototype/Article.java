package com.Yulia.prototype;

public class Article implements Cloneable {



    private String articleName;
    private String articleContent;

    public Article(String articleName, String articleContent) {
        this.articleName = articleName;
        this.articleContent = articleContent;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Object clone(){
        try{
            return super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
