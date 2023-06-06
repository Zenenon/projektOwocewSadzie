package org.example;

import java.util.Random;
import java.util.ArrayList;
public class Czlowiek {
    private String imie;
    //private int szybkosc;
    private int max_pracy;
    private int pozycja_x;
    private int pozycja_y;
    private int zebrane_owoce;


    public Czlowiek(String imie, int max_pracy, int pozycja_x, int pozycja_y, int zebrane_owoce) {
        this.imie = imie;
        //this.szybkosc = szybkosc;
        this.max_pracy = max_pracy;
        this.pozycja_x = pozycja_x;
        this.pozycja_y = pozycja_y;
        this.zebrane_owoce = zebrane_owoce;

    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    //public int getSzybkosc() {return szybkosc;}

    //public void setSzybkosc(int szybkosc) {this.szybkosc = szybkosc;}

    public int getMax_pracy() {
        return this.max_pracy;
    }

    public void setMax_pracy(int max_pracy) {
        this.max_pracy = max_pracy;
    }

    public int getPozycja_x() {
        return this.pozycja_x;
    }

    public void setPozycja_x(int pozycja_x) {
        this.pozycja_x = pozycja_x;
    }

    public int getPozycja_y() {
        return this.pozycja_y;
    }

    public void setPozycja_y(int pozycja_y) {
        this.pozycja_y = pozycja_y;
    }

    public void setZebrane_owoce(int zebrane_owoce){
        this.zebrane_owoce = zebrane_owoce;
    }
    public int getZebrane_owoce(/*int zebrane_owoce*/){return this.zebrane_owoce;}

    /*public static void main(String[] args) {
        //Dorosly jacek = new Dorosly("Jacek",2,10,1,1,0);
        Dorosly placek = new Dorosly("Placek",  10, 2, 2, 0,0);
        // deklaracja listy ludzi
        ArrayList<Czlowiek> ludzie = new ArrayList<>();
        Dorosly jacek = new Dorosly("Jacek",  10, 1, 3, 0,0);
        ludzie.add(jacek);

        while(jacek.getTura(tura)<50) {
            jacek.ruch(jacek.getPozycja_x(), jacek.getPozycja_y());
            System.out.printf("x=%d, y=%d tura: %d\n", jacek.getPozycja_x(), jacek.getPozycja_y(), tura);
        }
    }*/

    //metoda odpowiedzialna za ruch człowieka
    public void ruch(/*int pozycja_x, int pozycja_y*/){

        getPozycja_x();
        getPozycja_y();
        // jezeli wylosuje 0 pozycja maleje o 1, jezeli wylosuje 2 pozycja zwieszka sie o 1
        // jezeli wylosuje 1 pozycja sie nie zmienia
        // jezeli zmiana pozycji mialaby sie rownac wyjsciu poza plansze, to dana pozycja (x lub y) "odbije sie" i zmieni kierunek o 180 stopni
        Random generator = new Random();
        int x = -1;
        int y = -1;
        x = generator.nextInt(3);
        y = generator.nextInt(3);
        //System.out.printf(" 1111   x=%d, y=%d tura: %d\n",x,y,tura+1);

        if(x==0){
            if(pozycja_x<1) {
                this.pozycja_x++;
            }else{
                this.pozycja_x--;
            }
        }
        if(x==2){
            if(pozycja_x>9) {
                this.pozycja_x--;
            }else{
                this.pozycja_x++;
            }
        }

        if(y==0){
            if(pozycja_y<1) {
                this.pozycja_y++;
            }else{
                this.pozycja_y--;
            }
        }
        if(y==2){
            if(pozycja_y>9) {
                this.pozycja_y--;
            }else{
                this.pozycja_y++;
            }
        }
        // jezeli czlowiek bedzie probowal wyjsc poza sad to zostanie zatrzymany
        /*if(pozycja_x>10){
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
        }*/

    }
    //metoda zwiekszajaca ilosc zebranych owocow o zadana wartosc
    public void zbior(int zebrane_owoce){
        this.zebrane_owoce += zebrane_owoce;
    }
}
