package org.example;

public class Dorosly extends Czlowiek{
    public Dorosly(String imie, int szybkosc, int max_pracy, int pozycja_x, int pozycja_y) {
        super(imie, szybkosc, max_pracy, pozycja_x, pozycja_y);
    }

    //metoda odpowiedzialna za ruch człowieka
    @Override
    public void ruch(int pozycja_x, int pozycja_y) {
        super.ruch(pozycja_x, pozycja_y);
    }
}
