package com.Yulia.observer;

import java.util.LinkedList;
import java.util.List;

public class PostalOffice {
    private List<Subscriber> subscribers = new LinkedList<Subscriber>();


    public void receiveMessages(Publishing publishing){
        publishing.update();
        addNewSubscribers(publishing.getSubscribers());

    }

    public void addNewSubscribers(List<Subscriber> newSubscribers){
        subscribers.addAll(newSubscribers);
    }

    public void sendMagazines(){
        for (Subscriber subscriber: subscribers) {
            subscriber.update();
        }
    }

}
