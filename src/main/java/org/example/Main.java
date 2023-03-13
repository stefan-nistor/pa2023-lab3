package org.example;

import org.example.models.Company;
import org.example.models.Designer;
import org.example.models.Person;
import org.example.models.Programmer;

import java.time.LocalDate;

public class Main {

    static Person zaha = new Programmer("Zaha", LocalDate.parse("2001-09-13"), "newbie");
    static Person rosa = new Designer("Rosa", LocalDate.parse("2001-12-19"), 5.0f);

    static Company asii = new Company("ASII", 120);

    static Network network = new Network();

    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(zaha.toString());
//        System.out.println(rosa.toString());

        zaha.addRelationship(rosa, "bff");
        zaha.addRelationship(asii, "coord");

        rosa.addRelationship(asii, "vice");
//
//        System.out.println(rosa.getRelationships().toString());
//        System.out.println(zaha.getRelationships().toString());

        network.addNode(zaha);
        network.addNode(rosa);
        network.addNode(asii);

        System.out.println(network.order().toString());

    }
}