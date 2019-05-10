package com.Yulia.observer;

import java.util.List;

public class Publishing implements Observable{

    private String publishingName;
    private PostalOffice postalOffice;
    private List<Subscriber> subscribers;


    public Publishing(String publishingName, List<Subscriber> subscribers, PostalOffice office) {
        this.publishingName = publishingName;
        this.subscribers = subscribers;
        this.postalOffice = office;
    }


    public void sendMagazines(){
        postalOffice.receiveMessages(this);
    }


    public List<Subscriber> getSubscribers() {
        return subscribers;
    }


    public void update() {
        for (Subscriber subscriber : subscribers) {
            System.out.println("Publisher "+ publishingName +
                    " is sending magazines to " + subscriber.getSubscriberName());

        }
    }
}
