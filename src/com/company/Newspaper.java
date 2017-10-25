package com.company;

import java.util.ArrayList;

public class Newspaper {
    private String name;
    private ArrayList<Article> articleList;

    public Newspaper(){
        articleList = new ArrayList<Article>();
    }


    public ArrayList<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(ArrayList<Article> articleList) {
        this.articleList = articleList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addArticle(Article anArticle){
        articleList.add(anArticle);
    }
}
