package org.example;
import java.util.ArrayList;


public class Dorosly extends Czlowiek{
    public Dorosly(String imie, int max_pracy, int pozycja_x, int pozycja_y, int zebrane_owoce) {
        super(imie, max_pracy, pozycja_x, pozycja_y, zebrane_owoce);
    }
    ArrayList<Dorosly> dorosly = new ArrayList<>();

}
