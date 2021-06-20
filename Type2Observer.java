package com.company.observer;

//wrapping the food using news papers
public class Type2Observer implements Observer {
    @Override
    public void notifyObserver(String news) {

        System.out.println("Wrap the foods using the news: " + news);
    }
}
