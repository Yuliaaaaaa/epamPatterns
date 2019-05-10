package com.Yulia.observer;

public class Subscriber implements Observable{

    private String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }


    public void update() {
        System.out.println("Subscriber " + subscriberName + " has received magazine");
    }

    public String getSubscriberName() {
        return subscriberName;
    }
}
