package org.example;

import java.util.Random;

public abstract class Czlowiek {
    private String imie;
    private int szybkosc;
    private int max_pracy;
    private int pozycja_x;
    private int pozycja_y;

    public Czlowiek(String imie, int szybkosc, int max_pracy, int pozycja_x, int pozycja_y) {
        this.imie = imie;
        this.szybkosc = szybkosc;
        this.max_pracy = max_pracy;
        this.pozycja_x = pozycja_x;
        this.pozycja_y = pozycja_y;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getSzybkosc() {
        return szybkosc;
    }

    public void setSzybkosc(int szybkosc) {
        this.szybkosc = szybkosc;
    }

    public int getMax_pracy() {
        return max_pracy;
    }

    public void setMax_pracy(int max_pracy) {
        this.max_pracy = max_pracy;
    }

    public int getPozycja_x() {
        return pozycja_x;
    }

    public void setPozycja_x(int pozycja_x) {
        this.pozycja_x = pozycja_x;
    }

    public int getPozycja_y() {
        return pozycja_y;
    }

    public void setPozycja_y(int pozycja_y) {
        this.pozycja_y = pozycja_y;
    }

    //metoda odpowiedzialna za ruch człowieka
    public void ruch(){
        Random generator = new Random();
        pozycja_x = generator.nextInt(10);
        pozycja_y = generator.nextInt(10);
    }
}


