package org.example;

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
    public String getImie(){
        return this.imie;
    }
    public int getSzybkosc(){
        return this.szybkosc;
    }
    public int getMax_pracy(){
        return this.max_pracy;
    }
    public int getPozycja_x(){return this.pozycja_x;
    }

    public void setPozycja_x(int pozycja_x) {
        this.pozycja_x = pozycja_x;
    }

    public int getPozycja_y(){return this.pozycja_y;
    }
    public void setPozycja_y(int pozycja_y) {
        this.pozycja_y = pozycja_y;
    }
}


