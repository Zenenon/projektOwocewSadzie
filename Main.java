package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        int drzewa_z_owocami = 25;
        //zmienna do zatrzymania dzialania programu, ustawiana recznie
        //zmniejsza sie o jeden za kazdym zebranym drzewem

        int ile_tur = 1;
        //zmienna do zliczenia, ile tur/cykli trwala dana symulacja

        int[][] tablica = new int[11][11];
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 11; j++) {
                tablica[i][j] = 0;

            }

        }
        //zadeklarowanie i wyzerowanie tablicy, ktora sluzy jako plansza

/*
        Drzewo wisnia1 = new Drzewo("Wisnia",1,0);
        Drzewo wisnia2 = new Drzewo("Wisnia",2,7);
        Drzewo wisnia3 = new Drzewo("Wisnia",6,3);
        Drzewo wisnia4 = new Drzewo("Wisnia",5,9);
        Drzewo wisnia5 = new Drzewo("Wisnia",10,1);

        Drzewo czeresnia1 = new Drzewo("Czeresnia",9,3);
        Drzewo czeresnia2 = new Drzewo("Czeresnia",4,4);
        Drzewo czeresnia3 = new Drzewo("Czeresnia",9,9);
        Drzewo czeresnia4 = new Drzewo("Czeresnia",8,7);
        Drzewo czeresnia5 = new Drzewo("Czeresnia",1,4);

        Drzewo jablon1 = new Drzewo("Jablon",1,2);
        Drzewo jablon2 = new Drzewo("Jablon",5,3);
        Drzewo jablon3 = new Drzewo("Jablon",5,6);
        Drzewo jablon4 = new Drzewo("Jablon",8,0);
        Drzewo jablon5 = new Drzewo("Jablon",10,8);

        Drzewo gruszka1 = new Drzewo("Gruszka",0,2);
        Drzewo gruszka2 = new Drzewo("Gruszka",7,10);
        Drzewo gruszka3 = new Drzewo("Gruszka",2,5);
        Drzewo gruszka4 = new Drzewo("Gruszka",7,4);
        Drzewo gruszka5 = new Drzewo("Gruszka",3,1);


        Drzewo brzoskwinia1 = new Drzewo("Brzoskwinia",2,8);
        Drzewo brzoskwinia2 = new Drzewo("Brzoskwinia",4,5);
        Drzewo brzoskwinia3 = new Drzewo("Brzoskwinia",6,0);
        Drzewo brzoskwinia4 = new Drzewo("Brzoskwinia",8,2);
        Drzewo brzoskwinia5 = new Drzewo("Brzoskwinia",7,1);
        // gdy drzewa sa ulozone losowo

 */



        Drzewo wisnia1 = new Drzewo("Wisnia",1,1);
        Drzewo wisnia2 = new Drzewo("Wisnia",3,1);
        Drzewo wisnia3 = new Drzewo("Wisnia",5,1);
        Drzewo wisnia4 = new Drzewo("Wisnia",7,1);
        Drzewo wisnia5 = new Drzewo("Wisnia",9,1);

        Drzewo czeresnia1 = new Drzewo("Czeresnia",1,3);
        Drzewo czeresnia2 = new Drzewo("Czeresnia",3,3);
        Drzewo czeresnia3 = new Drzewo("Czeresnia",5,3);
        Drzewo czeresnia4 = new Drzewo("Czeresnia",7,3);
        Drzewo czeresnia5 = new Drzewo("Czeresnia",9,3);

        Drzewo jablon1 = new Drzewo("Jablon",1,5);
        Drzewo jablon2 = new Drzewo("Jablon",3,5);
        Drzewo jablon3 = new Drzewo("Jablon",5,5);
        Drzewo jablon4 = new Drzewo("Jablon",7,5);
        Drzewo jablon5 = new Drzewo("Jablon",9,5);

        Drzewo gruszka1 = new Drzewo("Gruszka",1,7);
        Drzewo gruszka2 = new Drzewo("Gruszka",3,7);
        Drzewo gruszka3 = new Drzewo("Gruszka",5,7);
        Drzewo gruszka4 = new Drzewo("Gruszka",7,7);
        Drzewo gruszka5 = new Drzewo("Gruszka",9,7);

        Drzewo brzoskwinia1 = new Drzewo("Brzoskwinia",1,9);
        Drzewo brzoskwinia2 = new Drzewo("Brzoskwinia",3,9);
        Drzewo brzoskwinia3 = new Drzewo("Brzoskwinia",5,9);
        Drzewo brzoskwinia4 = new Drzewo("Brzoskwinia",7,9);
        Drzewo brzoskwinia5 = new Drzewo("Brzoskwinia",9,9);
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

        Dorosly jacek = new Dorosly("Jacek",0,30,1,1,0);
        Dorosly janusz = new Dorosly("Janusz",0,40,4,4,0);
        Dziecko kacper = new Dziecko("Kacper",0,0,20,1,3,0);
        Dziecko kuba = new Dziecko("Kuba",0,0,20,2,3,0);
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
                drzewa_z_owocami = zbieranie_owocow(drzewa_z_owocami, tablica, jacek, duze_drzewo, srednie_drzewo, male_drzewo);
                //wywolanie metody odpowiedzialnej za zbior oraz liczenie ilosci pozostalych drzew
                jacek.ruch();
            }
            else {
                jacek.setIle_przerw(jacek.getIle_przerw()+1);
            }
            //poruszanie sie czlowieka polaczone z warunkiem przerwy

            if ((ile_tur)%(janusz.getMax_pracy()+1) != 0){
                drzewa_z_owocami = zbieranie_owocow(drzewa_z_owocami, tablica, janusz, duze_drzewo, srednie_drzewo, male_drzewo);
                janusz.ruch();
            }
            else {
                janusz.setIle_przerw(janusz.getIle_przerw()+1);
            }

            if ((ile_tur)%(kacper.getMax_pracy()+1) != 0){
                drzewa_z_owocami = zbieranie_owocow_dziecko(drzewa_z_owocami,tablica,kacper,male_drzewo);
                kacper.ruch();
            }
            else {
                kacper.setIle_przerw(kacper.getIle_przerw()+1);
            }
            //analogicznie jak dla doroslego, ale ze zmieniona metodo do zbierania owocy
            if ((ile_tur)%(kuba.getMax_pracy()+1) != 0){
                drzewa_z_owocami = zbieranie_owocow_dziecko(drzewa_z_owocami,tablica,kuba,male_drzewo);
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


//        zapis.println(ile_tur + ";" + jacek.getZebrane_owoce()+";"+jacek.getIle_przerw()+";"+ janusz.getZebrane_owoce()+";"+
//        kacper.getZebrane_owoce()+";" + kacper.getIle_przerw() + ";" + kacper.getZjedzone_owoce() + ";"+ kuba.getZebrane_owoce() + ";"
//                + kuba.getIle_przerw() + ";" + kuba.getZjedzone_owoce());
        //dane są nadpisywane zamiast byc dopisywane, zostanie to poprawione w finalnej wersji

        //zapis.close();
        
        //stworzenie pliku wyniki.txt do zapisu wynikow
        Writer output;
        output = new BufferedWriter(new FileWriter("wyniki.txt", true));  //clears file every time
        output.append(ile_tur + ";" + jacek.getZebrane_owoce()+";"+jacek.getIle_przerw()+";"+ janusz.getZebrane_owoce()+";"+
                kacper.getZebrane_owoce()+";" + kacper.getIle_przerw() + ";" + kacper.getZjedzone_owoce() + ";"+ kuba.getZebrane_owoce() + ";"
                + kuba.getIle_przerw() + ";" + kuba.getZjedzone_owoce() + "\n");
        output.close();
        System.out.println("Program zakończył działanie, wyniki zostały zapisane do pliku wyniki.txt");
        System.exit(0);
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

    private static int zbieranie_owocow_dziecko(int drzewa_z_owocami, int[][] tablica, Dziecko dziecko, int male_drzewo) {
        if (tablica[dziecko.getPozycja_x()][dziecko.getPozycja_y()] == 9){
            dziecko.zbior(male_drzewo);
            tablica[dziecko.getPozycja_x()][dziecko.getPozycja_y()] = 1;
            drzewa_z_owocami--;
        }
        return drzewa_z_owocami;
        //analogicznie jak wyzej, z ograniczeniem tylko do niskich drzew
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
