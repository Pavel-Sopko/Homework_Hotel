package com.engeto.example.hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
    ArrayList<String> host = new ArrayList<String>();
    Room room;
    LocalDate begin;
    LocalDate end;

    public Reservation(Room room,
                       LocalDate begin,
                       LocalDate end) {
        this.room = room;
        this.begin = begin;
        this.end = end;
    }


    public ArrayList<String> getHost() {
        return host;
    }

    public void setHost(ArrayList<String> host) {
        this.host = host;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public void addHost(String newHost) {
        host.add(newHost);
    }

    public static String getDescription() {

        //znova udělat
        //return "Rezervace od " + begin + " do " + end + "pro: ";
    }
}