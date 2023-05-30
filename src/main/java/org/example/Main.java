package org.example;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int tura = 0;
        boolean czy_zostaly_owoce = true;
        int[][] tablica = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) {
                tablica[i][j] = 0;
            }
        }
        Drzewo wisnia = new Drzewo("Wisnia",10,1,true,0,0);
        Drzewo czeresnia = new Drzewo("Czeresnia",10,1,true,1,0);
        Drzewo jablon = new Drzewo("Jablon",10,2,true,2,0);
        Drzewo gruszka = new Drzewo("Gruszka",10,2,true,3,0);

        //Dorosly jacek = new Dorosly("Jacek",2,10,1,1,0);
        //Dorosly placek = new Dorosly("Placek",2,10,2,2,0);

        tablica[0][0] = 1;
        tablica[1][0] = 1;
        tablica[2][0] = 1;
        tablica[3][0] = 1;
        tablica[1][1] = 2;
        tablica[2][2] = 2;

        //jacek.ruch(jacek.getPozycja_x(),jacek.getPozycja_y(),tura);



    }
}