package com.company;

public class Osoba implements IPierwszy, IDrugi {

    public int getWiek() {
        return IDrugi.super.getWiek();
    }
}
