package org.example;

public class MDrzewo {
    private String nazwa;
    private int pozycja_x;
    private int pozycja_y;
    public MDrzewo(String nazwa, int pozycja_x, int pozycja_y) {
        this.nazwa = nazwa;
        this.pozycja_x = pozycja_x;
        this.pozycja_y = pozycja_y;
    }
    public String getNazwa(){
        return this.nazwa;
    }
    public int getPozycja_x(){return this.pozycja_x; }
    public int getPozycja_y(){return this.pozycja_y; }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPozycja_x(int pozycja_x) {
        this.pozycja_x = pozycja_x;
    }

    public void setPozycja_y(int pozycja_y) {
        this.pozycja_y = pozycja_y;
    }

    public boolean czy_moze_zebrac(Czlowiek czlowiek){
        return true;
    }
}
