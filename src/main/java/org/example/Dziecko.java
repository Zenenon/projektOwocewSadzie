package org.example;

public class Dziecko extends Czlowiek{
    public Dziecko(String imie, int szybkosc, int max_pracy, int pozycja_x, int pozycja_y, int zebrane_owoce) {
        super(imie, szybkosc, max_pracy, pozycja_x, pozycja_y, zebrane_owoce);
    }
    //sprawdzam, czy dziecko jest oddalone o nie więcej niż 3 pola od dorosłego
    Boolean jedz_owoce(int pozycja_x, int pozycja_y){
        int roznica_x = Math.abs(pozycja_x - this.getPozycja_x());
        int roznica_y = Math.abs(pozycja_y - this.getPozycja_y());
        if(roznica_x <= 3 && roznica_y <= 3){
            return false;
        }
        else{
            return true;
        }
    }
}
