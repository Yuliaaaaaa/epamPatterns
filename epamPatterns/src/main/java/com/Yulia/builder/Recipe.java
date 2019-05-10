package com.Yulia.builder;

import java.util.Date;

public class Recipe {
    private String recipe;
    private Date expireDate;
    private final Builder builder;


    public Recipe(String recipe, Date expireDate) {
        this.recipe = recipe;
        this.expireDate = expireDate;
        builder = new Builder();
    }


    public class Builder{
        public void changeExpireDate(Date newDate){
            if(expireDate.compareTo(newDate)<=1)
                expireDate = newDate;
            else
                System.out.println("Can not shorten expire time");
        }
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getRecipe() {
        return recipe;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipe='" + recipe + '\'' +
                ", expireDate=" + expireDate +
                '}';
    }
}
