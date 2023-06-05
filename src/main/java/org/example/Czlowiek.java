package org.example;

import java.util.Random;
import java.util.ArrayList;
public class Czlowiek {
    private String imie;

    private int zebrane_owoce;
    private int max_pracy;
    private int pozycja_x;
    private int pozycja_y;
    private int zebrane_owoce;
    private static int tura=0;


    public Czlowiek(String imie, int zebrane_owoce, int max_pracy, int pozycja_x, int pozycja_y) {
        this.imie = imie;
        this.zebrane_owoce = zebrane_owoce;

        this.max_pracy = max_pracy;
        this.pozycja_x = pozycja_x;
        this.pozycja_y = pozycja_y;
        this.zebrane_owoce = zebrane_owoce;
        this.tura = tura;
    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }


    public int getZebrane_owoce() {
        return zebrane_owoce;
    }

    public void setZebrane_owoce(int zebrane_owoce) {
        this.zebrane_owoce = zebrane_owoce;
    }


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
    public int getZebrane_owoce(int zebrane_owoce){return this.zebrane_owoce;}
    public int getTura(int tura){return this.tura;}
    public static void main(String[] args) {
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
    }

    //metoda odpowiedzialna za ruch człowieka

    public void ruch(){

        getPozycja_x();
        getPozycja_y();
        Random generator = new Random();
        int x = -1;
        int y = -1;
        x = generator.nextInt(3);
        y = generator.nextInt(3);
        //System.out.printf(" 1111   x=%d, y=%d tura: %d\n",x,y,tura+1);

        if(x==0){
            this.pozycja_x--;
        }
        if(x==2){
            this.pozycja_x++;
        }

        if(y==0){
            this.pozycja_y--;
        }
        if(y==2){
            this.pozycja_y++;
        }
        // jezeli czlowiek bedzie probowal wyjsc poza sad to zostanie zatrzymany
        if(pozycja_x>10){
            this.pozycja_x--;
        }
        if(pozycja_x<0){
            this.pozycja_x++;
        }
        if(pozycja_y>10){
            this.pozycja_y--;
        }
        if(pozycja_y<0){
            this.pozycja_y++;
        }
    }
    public void zbior(int zebrane_owoce){
        this.zebrane_owoce += zebrane_owoce;

    }

}


