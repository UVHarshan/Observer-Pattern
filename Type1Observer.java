package com.company.observer;

public class Type1Observer implements Observer {

    // accept the email address as a constructor parameter
    private String email;

    public  Type1Observer(String email) {
        this.email = email;
    }

    @Override
    public void notifyObserver(String news) {

        System.out.println("Reading the news: " + news);
    }
}
