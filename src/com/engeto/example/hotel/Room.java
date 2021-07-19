package com.engeto.example.hotel;


public class Room {
    int number;
    int beds;
    int price;
    boolean terrace;
    boolean seaView;

    public Room(int number, int beds, int price, boolean terrace, boolean seaView) {
        this.beds = beds;
        this.number = number;
        this.price = price;
        this.terrace = terrace;
        this.seaView = seaView;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isTerrace() {
        return terrace;
    }

    public void setTerrace(boolean terrace) {
        this.terrace = terrace;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }
    public String getDescription() {
        return "Pokoj č. " + number + ", lůžek k dispozici: " + beds + ", cena: " + price + " Kč/noc";
    }
}