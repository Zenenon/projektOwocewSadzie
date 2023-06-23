package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Wyniki {

    private int ile_tur;
    private Czlowiek czlowiek1;
    private Czlowiek czlowiek2;
    private Dziecko dziecko1;
    private Dziecko dziecko2;

    public Wyniki(Czlowiek czlowiek1, Czlowiek czlowiek2, Dziecko dziecko1, Dziecko dziecko2, int ile_tur){
        this.czlowiek1 = czlowiek1;
        this.czlowiek2 = czlowiek2;
        this.dziecko1 = dziecko1;
        this.dziecko2 = dziecko2;
        this.ile_tur = ile_tur;
    }

    public void Wypisz_wyniki() throws IOException {
        Writer output;
        output = new BufferedWriter(new FileWriter("wyniki.txt", true));  //clears file every time
        output.append(ile_tur + ";" + czlowiek1.getZebrane_owoce()+";"+czlowiek1.getIle_przerw()+";"+ czlowiek2.getZebrane_owoce()+";"+czlowiek2.getIle_przerw()+";"+
                dziecko1.getZebrane_owoce()+";" + dziecko1.getIle_przerw() + ";" + dziecko1.getZjedzone_owoce() + ";"+ dziecko2.getZebrane_owoce() + ";"
                + dziecko2.getIle_przerw() + ";" + dziecko2.getZjedzone_owoce() + "\n");
        output.close();
    }
}
