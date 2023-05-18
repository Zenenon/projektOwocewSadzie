package org.example;

public class Czlowiek {
    private String imie;
    private double szybkosc;
    private int max_pracy;
    private int pozycja;

    public Czlowiek(String imie, double szybkosc, int max_pracy, int pozycja) {
        this.imie = imie;
        this.szybkosc = szybkosc;
        this.max_pracy = max_pracy;
        this.pozycja = pozycja;
    }
    public String getImie(){
        return this.imie;
    }
    public double getSzybkosc(){
        return this.szybkosc;
    }
    public double getMax_pracy(){
        return this.max_pracy;
    }
    public double getPozycja(){return this.pozycja;
    }
}


