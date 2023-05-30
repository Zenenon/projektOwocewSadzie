package org.example;

import java.util.Random;
import java.util.ArrayList;
public class Czlowiek {
    private String imie;
    private int szybkosc;
    private int max_pracy;
    private int pozycja_x;
    private int pozycja_y;
    private int zebrane_owoce;

    public Czlowiek(String imie, int szybkosc, int max_pracy, int pozycja_x, int pozycja_y, int zebrane_owoce) {
        this.imie = imie;
        this.szybkosc = szybkosc;
        this.max_pracy = max_pracy;
        this.pozycja_x = pozycja_x;
        this.pozycja_y = pozycja_y;
        this.zebrane_owoce = zebrane_owoce;
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

    public void setZebrane_owoce(int zebrane_owoce){
        this.zebrane_owoce = zebrane_owoce;
    }

    //metoda odpowiedzialna za ruch człowieka
    public void ruch(int pozycja_x, int pozycja_y, int tura){
        Random generator = new Random();
        int x = -1;
        int y = -1;
        x = generator.nextInt(2);
        y = generator.nextInt(2);
        if(x==0){
            pozycja_x--;
        }
        if(x==2){
            pozycja_x++;
        }

        if(y==0){
            pozycja_y--;
        }
        if(y==2){
            pozycja_y++;
        }
        // jezeli czlowiek bedzie probowal wyjsc poza sad to zostanie zatrzymany
        if(pozycja_x>10){
            pozycja_x--;
        }
        if(pozycja_x<0){
            pozycja_x++;
        }
        if(pozycja_y>10){
            pozycja_y--;
        }
        if(pozycja_y<0){
            pozycja_y++;
        }
        tura++;
    }
    //Dorosly jacek = new Dorosly("Jacek",2,10,1,1,0);
    Dorosly placek = new Dorosly("Placek",2,10,2,2,0);
    // deklaracja listy ludzi
    ArrayList<Czlowiek> ludzie = new ArrayList<>();
    Czlowiek jacek = new Czlowiek("Jacek",2,10,1,1,0);

    ludzie.add(Czlowiek("Jacek",2,10,1,1,0));
}


