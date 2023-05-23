package org.example;

public class Drzewo {
    private String nazwa;
    private int ile_owocow;
    private int rodzaj_owocow;
    // rodzaj owocow: 1-male 2-duze
    private int pozycja_x;
    private int pozycja_y;
    private boolean czy_wysokie;
    public Drzewo(String nazwa, int ile_owocow, int rodzaj_owocow, boolean czy_wysokie, int pozycja_x, int pozycja_y) {
        this.nazwa = nazwa;
        this.ile_owocow = ile_owocow;
        this.rodzaj_owocow = rodzaj_owocow;
        this.czy_wysokie = czy_wysokie;
        this.pozycja_x = pozycja_x;
        this.pozycja_y = pozycja_y;
    }
    public String getNazwa(){
        return this.nazwa;
    }
    public int getIle_owocow(){
        return this.ile_owocow;
    }
    public int getRodzaj_owocow(){
        return this.rodzaj_owocow;
    }
    public boolean getCzy_wysokie(){return this.czy_wysokie;}
    public int getPozycja_x(){return this.pozycja_x;}
    public int getPozycja_y(){return this.pozycja_y;}
}
