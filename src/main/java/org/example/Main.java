package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int drzewa_z_owocami = 2;
        int ile_tur = 0;
        int[][] tablica = new int[11][11];
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 11; j++) {
                tablica[i][j] = 0;
            }
        }

        Drzewo wisnia = new Drzewo("Wisnia",10,1,true,0,0);
        przypisz_pozycje_male(tablica, wisnia.getPozycja_x(), wisnia.getPozycja_y());

        Drzewo czeresnia = new Drzewo("Czeresnia",10,1,true,1,0);
        przypisz_pozycje_male(tablica, czeresnia.getPozycja_x(), czeresnia.getPozycja_y());

        Drzewo jablon = new Drzewo("Jablon",10,2,true,2,6);
        przypisz_pozycje_duze(tablica, jablon.getPozycja_x(), jablon.getPozycja_y());



        Drzewo gruszka = new Drzewo("Gruszka",10,2,true,3,3);
        przypisz_pozycje_srednie(tablica, gruszka.getPozycja_x(), gruszka.getPozycja_y());

        Dorosly jacek = new Dorosly("Jacek",0,10,1,1);
        Dorosly placek = new Dorosly("Placek",0,10,2,2);
        //Dziecko kasia = new Dziecko("Kasia",0,5,9,1 );

        //System.out.printf("Imie: " + jacek.getImie() + " zebrane owoce: " + jacek.getZebrane_owoce() + " max pracy " + jacek.getMax_pracy() + " x: " + jacek.getPozycja_x() + " y: " + jacek.getPozycja_y());


        tablica[0][0] = 1;
        tablica[1][0] = 1;
        tablica[2][0] = 1;
        tablica[3][0] = 1;
        tablica[1][1] = 2;
        tablica[2][2] = 2;
        System.out.println(tablica[2][0]);

        while (drzewa_z_owocami > 0)/*||(krzewy > 0)*/{
            //if(jacek.getMax_pracy()|ile_tur)
            if(tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] == 7){
                jacek.zbior(20);
                tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] = 0;
                drzewa_z_owocami--;
            } else if (tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] == 8){
                jacek.zbior(15);
                tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] = 0;
                drzewa_z_owocami--;
            }
            else if (tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] == 9){
                jacek.zbior(10);
                tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] = 0;
                drzewa_z_owocami--;
            }

            System.out.println(jacek.getPozycja_x() + " " + jacek.getPozycja_y());
            System.out.println("  ");
            jacek.ruch();
            System.out.println(jacek.getPozycja_x() + " " + jacek.getPozycja_y());
            System.out.println("  ");
            //System.out.println("max pracy " + jacek.getMax_pracy());


            ile_tur++;
        }

        System.out.println("Ilosc tur: " + ile_tur);
        System.out.println("Ilosc zebranych owocow: " + jacek.getZebrane_owoce());
        System.out.println("Max pracy " + jacek.getMax_pracy());
        System.out.println(jacek.getPozycja_x() + " " + jacek.getPozycja_y());


        }
        static void przypisz_pozycje_duze(int[][] tablica, int pozycja_x, int pozycja_y){
            tablica[pozycja_x][pozycja_y]=7;
        }
        static void przypisz_pozycje_srednie(int[][] tablica, int pozycja_x, int pozycja_y){
        tablica[pozycja_x][pozycja_y]=8;
        }
        static void przypisz_pozycje_male(int[][] tablica, int pozycja_x, int pozycja_y){
        tablica[pozycja_x][pozycja_y]=9;
        }

}