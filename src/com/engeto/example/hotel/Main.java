package com.engeto.example.hotel;

import java.time.LocalDate;

public class Main {

    public static void roomGetDescription(){


    }

    public static void reservation(Person host, Room pokoj){

    }

    public static void main(String[] args) {

        Person host1 = new Person(
                "Adela",
                "Malíková",
                LocalDate.of(1993,3,13)
        );
        Person host2 = new Person(
                "Jan",
                "Dvořáček",
                LocalDate.of(1995,5,5)
        );
        System.out.println(host1.getDescription());
        System.out.println(host2.getDescription());


        Room pokoj1 = new Room(1, 1, 1000, true, true);
        Room pokoj2 = new Room(2, 1, 1000, true, true);
        Room pokoj3 = new Room(3, 3, 2400, false, true);

        System.out.println(pokoj1.getDescription());
        System.out.println(pokoj2.getDescription());
        System.out.println(pokoj3.getDescription());
    }
}
