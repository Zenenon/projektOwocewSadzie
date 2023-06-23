package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int drzewa_z_owocami = 25;
        //zmienna do zatrzymania dzialania programu, ustawiana recznie
        //zmniejsza sie o jeden za kazdym zebranym drzewem

        int ile_tur = 1;
        //zmienna do zliczenia, ile tur/cykli trwala dana symulacjas

        int[][] tablica = new int[11][11];
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 11; j++) {
                tablica[i][j] = 0;

            }

        }
        //zadeklarowanie i wyzerowanie tablicy, ktora sluzy jako plansza

/*
        MDrzewo wisnia1 = new MDrzewo("Wisnia",1,0);
        MDrzewo wisnia2 = new MDrzewo("Wisnia",2,7);
        MDrzewo wisnia3 = new MDrzewo("Wisnia",6,3);
        MDrzewo wisnia4 = new MDrzewo("Wisnia",5,9);
        MDrzewo wisnia5 = new MDrzewo("Wisnia",10,1);

        MDrzewo czeresnia1 = new MDrzewo("Czeresnia",9,3);
        MDrzewo czeresnia2 = new MDrzewo("Czeresnia",4,4);
        MDrzewo czeresnia3 = new MDrzewo("Czeresnia",9,9);
        MDrzewo czeresnia4 = new MDrzewo("Czeresnia",8,7);
        MDrzewo czeresnia5 = new MDrzewo("Czeresnia",1,4);

        Drzewo jablon1 = new Drzewo("Jablon",1,2);
        Drzewo jablon2 = new Drzewo("Jablon",5,3);
        Drzewo jablon3 = new Drzewo("Jablon",5,6);
        Drzewo jablon4 = new Drzewo("Jablon",8,0);
        Drzewo jablon5 = new Drzewo("Jablon",10,8);

        SDrzewo gruszka1 = new SDrzewo("Gruszka",0,2);
        SDrzewo gruszka2 = new SDrzewo("Gruszka",7,10);
        SDrzewo gruszka3 = new SDrzewo("Gruszka",2,5);
        SDrzewo gruszka4 = new SDrzewo("Gruszka",7,4);
        SDrzewo gruszka5 = new SDrzewo("Gruszka",3,1);


        SDrzewo brzoskwinia1 = new SDrzewo("Brzoskwinia",2,8);
        SDrzewo brzoskwinia2 = new SDrzewo("Brzoskwinia",4,5);
        SDrzewo brzoskwinia3 = new SDrzewo("Brzoskwinia",6,0);
        SDrzewo brzoskwinia4 = new SDrzewo("Brzoskwinia",8,2);
        SDrzewo brzoskwinia5 = new SDrzewo("Brzoskwinia",7,1);
        // gdy drzewa sa ulozone losowo
*/


        MDrzewo wisnia1 = new MDrzewo("Wisnia",1,1);
        MDrzewo wisnia2 = new MDrzewo("Wisnia",3,1);
        MDrzewo wisnia3 = new MDrzewo("Wisnia",5,1);
        MDrzewo wisnia4 = new MDrzewo("Wisnia",7,1);
        MDrzewo wisnia5 = new MDrzewo("Wisnia",9,1);

        MDrzewo czeresnia1 = new MDrzewo("Czeresnia",1,3);
        MDrzewo czeresnia2 = new MDrzewo("Czeresnia",3,3);
        MDrzewo czeresnia3 = new MDrzewo("Czeresnia",5,3);
        MDrzewo czeresnia4 = new MDrzewo("Czeresnia",7,3);
        MDrzewo czeresnia5 = new MDrzewo("Czeresnia",9,3);

        Drzewo jablon1 = new Drzewo("Jablon",1,5);
        Drzewo jablon2 = new Drzewo("Jablon",3,5);
        Drzewo jablon3 = new Drzewo("Jablon",5,5);
        Drzewo jablon4 = new Drzewo("Jablon",7,5);
        Drzewo jablon5 = new Drzewo("Jablon",9,5);

        SDrzewo gruszka1 = new SDrzewo("Gruszka",1,7);
        SDrzewo gruszka2 = new SDrzewo("Gruszka",3,7);
        SDrzewo gruszka3 = new SDrzewo("Gruszka",5,7);
        SDrzewo gruszka4 = new SDrzewo("Gruszka",7,7);
        SDrzewo gruszka5 = new SDrzewo("Gruszka",9,7);

        SDrzewo brzoskwinia1 = new SDrzewo("Brzoskwinia",1,9);
        SDrzewo brzoskwinia2 = new SDrzewo("Brzoskwinia",3,9);
        SDrzewo brzoskwinia3 = new SDrzewo("Brzoskwinia",5,9);
        SDrzewo brzoskwinia4 = new SDrzewo("Brzoskwinia",7,9);
        SDrzewo brzoskwinia5 = new SDrzewo("Brzoskwinia",9,9);
        // gdy drzewa są ulozone rowno


        przypisz_pozycje_male(tablica, wisnia1.getPozycja_x(), wisnia1.getPozycja_y());
        przypisz_pozycje_male(tablica, wisnia2.getPozycja_x(), wisnia2.getPozycja_y());
        przypisz_pozycje_male(tablica, wisnia3.getPozycja_x(), wisnia3.getPozycja_y());
        przypisz_pozycje_male(tablica, wisnia4.getPozycja_x(), wisnia4.getPozycja_y());
        przypisz_pozycje_male(tablica, wisnia5.getPozycja_x(), wisnia5.getPozycja_y());

        przypisz_pozycje_male(tablica, czeresnia1.getPozycja_x(), czeresnia1.getPozycja_y());
        przypisz_pozycje_male(tablica, czeresnia2.getPozycja_x(), czeresnia2.getPozycja_y());
        przypisz_pozycje_male(tablica, czeresnia3.getPozycja_x(), czeresnia3.getPozycja_y());
        przypisz_pozycje_male(tablica, czeresnia4.getPozycja_x(), czeresnia4.getPozycja_y());
        przypisz_pozycje_male(tablica, czeresnia5.getPozycja_x(), czeresnia5.getPozycja_y());

        przypisz_pozycje_duze(tablica, jablon1.getPozycja_x(), jablon1.getPozycja_y());
        przypisz_pozycje_duze(tablica, jablon2.getPozycja_x(), jablon2.getPozycja_y());
        przypisz_pozycje_duze(tablica, jablon3.getPozycja_x(), jablon3.getPozycja_y());
        przypisz_pozycje_duze(tablica, jablon4.getPozycja_x(), jablon4.getPozycja_y());
        przypisz_pozycje_duze(tablica, jablon5.getPozycja_x(), jablon5.getPozycja_y());

        przypisz_pozycje_srednie(tablica, gruszka1.getPozycja_x(), gruszka1.getPozycja_y());
        przypisz_pozycje_srednie(tablica, gruszka2.getPozycja_x(), gruszka2.getPozycja_y());
        przypisz_pozycje_srednie(tablica, gruszka3.getPozycja_x(), gruszka3.getPozycja_y());
        przypisz_pozycje_srednie(tablica, gruszka4.getPozycja_x(), gruszka4.getPozycja_y());
        przypisz_pozycje_srednie(tablica, gruszka5.getPozycja_x(), gruszka5.getPozycja_y());

        przypisz_pozycje_srednie(tablica, brzoskwinia1.getPozycja_x(), brzoskwinia1.getPozycja_y());
        przypisz_pozycje_srednie(tablica, brzoskwinia2.getPozycja_x(), brzoskwinia2.getPozycja_y());
        przypisz_pozycje_srednie(tablica, brzoskwinia3.getPozycja_x(), brzoskwinia3.getPozycja_y());
        przypisz_pozycje_srednie(tablica, brzoskwinia4.getPozycja_x(), brzoskwinia4.getPozycja_y());
        przypisz_pozycje_srednie(tablica, brzoskwinia5.getPozycja_x(), brzoskwinia5.getPozycja_y());

        Dorosly jacek = new Dorosly("Jacek",0,30,1,1,0, true);
        Dorosly janusz = new Dorosly("Janusz",0,40,4,4,0, true);
        Dziecko kacper = new Dziecko("Kacper",0,0,20,1,3,0,false);
        Dziecko kuba = new Dziecko("Kuba",0,0,20,2,3,0,false);
        //deklaracja obiektow do symulacji

        int duze_drzewo = 20, srednie_drzewo = 15, male_drzewo = 10;

        System.out.println("\nOznakowanie ludzi oraz drzew, na ktorych sa jeszcze owoce");
        System.out.println("'D' - dorosly, 'd' - dziecko, '^' - male drzewo, '+' - srednie drzewo, '*' - duze drzewo\n");
        System.out.println("Ustawienie początkowe, tura 0");

        while (drzewa_z_owocami > 0){
            System.out.print("    0 1 2 3 4 5 6 7 8 9 10\n");
            for(int i=0; i<11; i++){
                if(i != 10) {
                    System.out.print(" " + i + " ");
                }else{
                    System.out.print(" " + i);
                }
                for(int j = 0; j < 11; j++) {
                    if (((jacek.getPozycja_x() == j) && (jacek.getPozycja_y() == i)) || ((janusz.getPozycja_x() == j) && (janusz.getPozycja_y() == i))) {
                        System.out.print(" D");
                    } else if (((kacper.getPozycja_x() == j) && (kacper.getPozycja_y() == i)) || ((kuba.getPozycja_x() == j) && (kuba.getPozycja_y() == i))) {
                        System.out.print(" d");
                    } else if (tablica[i][j]==7){
                        System.out.print(" *");
                    } else if (tablica[i][j]==8){
                        System.out.print(" +");
                    } else if (tablica[i][j]==9){
                        System.out.print(" ^");
                    } else{
                        System.out.print(" .");
                    }
                }
                System.out.print("\n");

            }
            if ((ile_tur)%(jacek.getMax_pracy()+1) != 0){
                drzewa_z_owocami = zbieranie_owocow(drzewa_z_owocami, tablica, jacek, duze_drzewo, srednie_drzewo, male_drzewo,jablon1,gruszka1,wisnia1);
                //wywolanie metody odpowiedzialnej za zbior oraz liczenie ilosci pozostalych drzew
                jacek.ruch();
            }
            else {
                jacek.setIle_przerw(jacek.getIle_przerw()+1);
            }
            //poruszanie sie czlowieka polaczone z warunkiem przerwy

            if ((ile_tur)%(janusz.getMax_pracy()+1) != 0){
                drzewa_z_owocami = zbieranie_owocow(drzewa_z_owocami, tablica, janusz, duze_drzewo, srednie_drzewo, male_drzewo,jablon1,gruszka1,wisnia1);
                janusz.ruch();
            }
            else {
                janusz.setIle_przerw(janusz.getIle_przerw()+1);
            }

            if ((ile_tur)%(kacper.getMax_pracy()+1) != 0){
                drzewa_z_owocami = zbieranie_owocow(drzewa_z_owocami, tablica, kacper, duze_drzewo, srednie_drzewo, male_drzewo,jablon1,gruszka1,wisnia1);
                kacper.ruch();
            }
            else {
                kacper.setIle_przerw(kacper.getIle_przerw()+1);
            }
            //analogicznie jak dla doroslego, ale ze zmieniona metodo do zbierania owocy
            if ((ile_tur)%(kuba.getMax_pracy()+1) != 0){
                drzewa_z_owocami = zbieranie_owocow(drzewa_z_owocami, tablica, kuba, duze_drzewo, srednie_drzewo, male_drzewo,jablon1,gruszka1,wisnia1);
                kuba.ruch();
            }
            else {
                kuba.setIle_przerw(kuba.getIle_przerw()+1);
            }

            if(kacper.getZjedzone_owoce() >= kacper.getZebrane_owoce()) {
                kacper.setZjedzone_owoce(kacper.getZebrane_owoce());
            }
            else if(kacper.jedz_owoce(jacek.getPozycja_x(), jacek.getPozycja_y()) && kacper.jedz_owoce(janusz.getPozycja_x(), janusz.getPozycja_y())){
                kacper.setZjedzone_owoce(kacper.getZjedzone_owoce()+ 2);
            }

            if(kuba.getZjedzone_owoce() >= kuba.getZebrane_owoce()) {
                kuba.setZjedzone_owoce(kuba.getZebrane_owoce());
            }
            else if(kuba.jedz_owoce(jacek.getPozycja_x(), jacek.getPozycja_y()) && kacper.jedz_owoce(janusz.getPozycja_x(), janusz.getPozycja_y())){
                kuba.setZjedzone_owoce(kuba.getZjedzone_owoce()+ 2);
            }

            System.out.printf("\n tura " + ile_tur + "\n");
            ile_tur++;

            if(drzewa_z_owocami == 0) {
                System.out.print("    0 1 2 3 4 5 6 7 8 9 10\n");
                for(int i=0; i<11; i++){
                    if(i != 10) {
                        System.out.print(" " + i + " ");
                    }else{
                        System.out.print(" " + i);
                    }
                    for(int j = 0; j < 11; j++) {
                        if (((jacek.getPozycja_x() == j) && (jacek.getPozycja_y() == i)) || ((janusz.getPozycja_x() == j) && (janusz.getPozycja_y() == i))) {
                            System.out.print(" D");
                        } else if (((kacper.getPozycja_x() == j) && (kacper.getPozycja_y() == i)) || ((kuba.getPozycja_x() == j) && (kuba.getPozycja_y() == i))) {
                            System.out.print(" d");
                        } else if (tablica[i][j]==7){
                            System.out.print(" *");
                        } else if (tablica[i][j]==8){
                            System.out.print(" +");
                        } else if (tablica[i][j]==9){
                            System.out.print(" ^");
                        } else{
                            System.out.print(" .");
                        }
                    }
                    System.out.print("\n");

                }
            }
        }


        //stworzenie pliku wyniki.txt do zapisu wynikow
        Wyniki wynik = new Wyniki(jacek, janusz, kacper, kuba, ile_tur);
        wynik.Wypisz_wyniki();
        System.out.println("Program zakończył działanie, wyniki zostały zapisane do pliku wyniki.txt");
        System.exit(0);
    }

    //metoda odpowiadajaca za liczenie drzew oraz zbior owocow
    private static int zbieranie_owocow(int drzewa_z_owocami, int[][] tablica, Czlowiek czlowiek, int duze_drzewo, int srednie_drzewo, int male_drzewo, Drzewo duze, SDrzewo srednie, MDrzewo male) {
        if((tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] == 7) && duze.czy_moze_zebrac(czlowiek)){
            czlowiek.zbior(duze_drzewo);
            tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] = 1;
            drzewa_z_owocami--;
            //1 warunek, sprawdzam czy na pozycji czlowieka jest duze drzewo(wstepne oznaczone jako 7)
            //jesli tak, zbieram owoce(deklaruje z gory, ile owocy moze miec drzewo duze,srednie,male i ta ilosc dodaje do pola zebrane_owoce czlowieka
            //zmieniam wartosc tego pola w tablicy na 1 - oznaczam, ze to drzewo zostalo zebrane
            //zmniejszam zmienna od ilosci drzew o jeden
        } else if (tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] == 8 && srednie.czy_moze_zebrac(czlowiek)){
            czlowiek.zbior(srednie_drzewo);
            tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] = 1;
            drzewa_z_owocami--;
            //sprawdzam, czy drzewo jest srednie( czy na obecnej pozycji w tablicy jest 8-wstepne oznaczenie sredniego drzewa
            //reszta analogicznie
        }
        else if (tablica[czlowiek.getPozycja_x()][czlowiek.getPozycja_y()] == 9 && male.czy_moze_zebrac(czlowiek)){
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
