package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int drzewa_z_owocami = 2;
        //zmienna do zatrzymania dzialania programu, ustawiana recznie
        //zmniejsza sie o jeden za kazdym zebranym drzewem
        int ile_tur = 0;


        //zmienna do zliczenia, ile tur/cykli trwala dana symulacja
        int[][] tablica = new int[11][11];
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 11; j++) {
                tablica[i][j] = 0;
            }
        }
        //zadeklarowanie i wyzerowanie tablicy, ktora sluzy jako plansza

        Drzewo wisnia = new Drzewo("Wisnia",10,1,true,0,0);
        przypisz_pozycje_male(tablica, wisnia.getPozycja_x(), wisnia.getPozycja_y());

        Drzewo czeresnia = new Drzewo("Czeresnia",10,1,true,1,0);
        przypisz_pozycje_male(tablica, czeresnia.getPozycja_x(), czeresnia.getPozycja_y());

        Drzewo jablon = new Drzewo("Jablon",10,2,true,2,6);
        przypisz_pozycje_duze(tablica, jablon.getPozycja_x(), jablon.getPozycja_y());


        Drzewo gruszka = new Drzewo("Gruszka",10,2,true,3,3);
        przypisz_pozycje_srednie(tablica, gruszka.getPozycja_x(), gruszka.getPozycja_y());

        Dorosly jacek = new Dorosly("Jacek",0,10,1,1);
        Dorosly placek = new Dorosly("Placek",2,10,2,2);
        //deklaracja obiektow do symulacji

        //Dziecko kasia = new Dziecko("Kasia",0,5,9,1 );

        //System.out.printf("Imie: " + jacek.getImie() + " zebrane owoce: " + jacek.getZebrane_owoce() + " max pracy " + jacek.getMax_pracy() + " x: " + jacek.getPozycja_x() + " y: " + jacek.getPozycja_y());


        tablica[0][0] = 1;
        tablica[1][0] = 1;
        tablica[2][0] = 1;
        tablica[3][0] = 1;
        tablica[1][1] = 2;
        tablica[2][2] = 2;
        System.out.println(tablica[2][0]);
//ile_tur-jacek.getIle_przerw()
        while (drzewa_z_owocami > 0)/*||(krzewy > 0)*/{
            if(((ile_tur - jacek.getIle_przerw()) % (jacek.getMax_pracy())) == 0){
                System.out.println("ile przerw " + jacek.getIle_przerw());
                jacek.getPrzerwa_plus();
            }else{
                if (tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] == 7) {
                    jacek.zbior(20);
                    tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] = 0;
                    drzewa_z_owocami--;
                } else if (tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] == 8) {
                    jacek.zbior(15);
                    tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] = 0;
                    drzewa_z_owocami--;
                } else if (tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] == 9) {
                    jacek.zbior(10);
                    tablica[jacek.getPozycja_x()][jacek.getPozycja_y()] = 0;
                    drzewa_z_owocami--;
                }
                jacek.ruch();
            }

            //System.out.println(jacek.getPozycja_x() + " " + jacek.getPozycja_y());
            //System.out.println("  ");

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
    //metoda odpowiadajaca za liczenie drzew oraz zbior owocow
    private static int zbieranie_owocow(int drzewa_z_owocami, int[][] tablica, Czlowiek czlowiek, int duze_drzewo, int srednie_drzewo, int male_drzewo) {
        if(tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] == 7){
            czlowiek.zbior(duze_drzewo);
            tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] = 1;
            drzewa_z_owocami--;
            //1 warunek, sprawdzam czy na pozycji czlowieka jest duze drzewo(wstepne oznaczone jako 7)
            //jesli tak, zbieram owoce(deklaruje z gory, ile owocy moze miec drzewo duze,srednie,male i ta ilosc dodaje do pola zebrane_owoce czlowieka
            //zmieniam wartosc tego pola w tablicy na 1 - oznaczam, ze to drzewo zostalo zebrane
            //zmniejszam zmienna od ilosci drzew o jeden
        } else if (tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] == 8){
            czlowiek.zbior(srednie_drzewo);
            tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] = 1;
            drzewa_z_owocami--;
            //sprawdzam, czy drzewo jest srednie( czy na obecnej pozycji w tablicy jest 8-wstepne oznaczenie sredniego drzewa
            //reszta analogicznie
        }
        else if (tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] == 9){
            czlowiek.zbior(male_drzewo);
            tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] = 1;
            drzewa_z_owocami--;
        }
        return drzewa_z_owocami;
        //zeby w latwy sposob moc zmieniac ta zmienna, nasza metoda zwraca int
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