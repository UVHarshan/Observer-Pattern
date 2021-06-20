package com.company.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // publisher -> Subject
        // subscriber -> Observer
        // types of observers -> NewsReader, FoodWrapper

        Observer observer1 = new Type1Observer("kamal@gmail.com"); //reading news
        Observer observer2 = new Type1Observer("sasassasa"); //reading news
        Observer observer3 = new Type2Observer();  //wrap food

        // Newspaper publisher
        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyObservers("curfew will be imposed");

        Thread.sleep( 5000);
        System.out.println("===========================");

        subject.notifyObservers("Curfew will not be imposed today");

        Thread.sleep( 5000);

        subject.unsubscribe(observer2);

        Thread.sleep(5000);
        System.out.println("===========================");

        subject.start();

        subject.notifyObservers("Fuel prices gone up!");


    }
}
