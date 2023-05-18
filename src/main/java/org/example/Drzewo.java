package org.example;

public class Drzewo {
    private String nazwa;
    private int ile_owocow;
    private int rodzaj_owocow;
    private boolean czy_wysokie;
    public Drzewo(String nazwa, int ile_owocow, int rodzaj_owocow, boolean czy_wysokie) {
        this.nazwa = nazwa;
        this.ile_owocow = ile_owocow;
        this.rodzaj_owocow = rodzaj_owocow;
        this.czy_wysokie = czy_wysokie;
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
}
