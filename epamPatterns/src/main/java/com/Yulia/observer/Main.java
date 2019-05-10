package com.Yulia.observer;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostalOffice postalOffice = new PostalOffice();
        List<Subscriber> subs = new LinkedList<Subscriber>();
        subs.add(new Subscriber("John"));
        subs.add(new Subscriber("Mary"));
        subs.add(new Subscriber("Ada"));
        subs.add(new Subscriber("Kraster"));
        subs.add(new Subscriber("Sam"));
        Publishing publishing = new Publishing("Publishing1", subs, postalOffice);
        publishing.sendMagazines();
        postalOffice.sendMagazines();
    }
}
