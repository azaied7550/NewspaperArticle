package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Newspaper> newspaperList = new ArrayList<>();
        ArrayList<Article> articleList = new ArrayList<>();
        Scanner Keyboard = new Scanner(System.in);

        Newspaper newNewspaper;
        Article newArticle;
        String newspaperAnswer="";
        String articleAnswer="";

        do{
            newNewspaper = new Newspaper();
            System.out.println("Enter Newspaper name: ");
            newNewspaper.setName(Keyboard.nextLine());

            do{
                newArticle = new Article();
                System.out.println("Enter article title: ");
                newArticle.setTitle(Keyboard.nextLine());
                System.out.println("Enter date: ");
                newArticle.setDate(Keyboard.nextLine());
                articleList.add(newArticle);
                newNewspaper.getArticleList().add(newArticle);


                System.out.println("Add a new article? (Y/N) ");
                articleAnswer = Keyboard.nextLine();

            }while(articleAnswer.equalsIgnoreCase("y"));


            System.out.println("(A)dd a newpaper or (Q)uit? ");
            newspaperAnswer = Keyboard.nextLine();
            newspaperList.add(newNewspaper);
        }while(newspaperAnswer.equalsIgnoreCase("A"));

        for (Newspaper eachNewspaper : newspaperList) {
            System.out.println();
            System.out.println(eachNewspaper.getName());
            for (Article eachArticle: eachNewspaper.getArticleList()){
                System.out.println("article title    : "+eachArticle.getTitle()+ "     -date  : "+eachArticle.getDate());
            }
        }
    }
}
