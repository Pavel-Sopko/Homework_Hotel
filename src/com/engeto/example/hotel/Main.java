package com.engeto.example.hotel;

import java.time.LocalDate;

public class Main {

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
        System.out.println("První host: " + host1.getName() + ", " + host1.getSurname() + ", narozen: " + host1.getBorn());
        System.out.println("Druhý host: " + host2.getName() + ", " + host2.getSurname() + ", narozen: " + host2.getBorn());


        Room pokoj1 = new Room(1, 1, 1000, true, true);
        Room pokoj2 = new Room(2, 1, 1000, true, true);
        Room pokoj3 = new Room(3, 3, 2400, false, true);

        System.out.println("Pokoj číslo: " + pokoj1.getNumber() + ", počet lůžek: " + pokoj1.getBeds() + ", cena: " + pokoj1.getPrice() + "Kč/noc, Balkon: ");
    }
}
