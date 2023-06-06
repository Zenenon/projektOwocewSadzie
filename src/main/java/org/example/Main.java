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


        while (drzewa_z_owocami > 0){
            drzewa_z_owocami = zbieranie_owocow(drzewa_z_owocami, tablica, jacek, duze_drzewo, srednie_drzewo, male_drzewo);
            //wywolanie metody odpowiedzialnej za zbior oraz liczenie ilosci pozostalych drzew

            jacek.ruch();
            System.out.println(jacek.getPozycja_x() + " " + jacek.getPozycja_y());
            System.out.println("  ");



            ile_tur++;
            }
        System.out.println("Ilosc tur: " + ile_tur);
        System.out.println("Ilosc zebranych owocow: " + jacek.getZebrane_owoce());

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
