package org.example;

public class Dziecko extends Czlowiek{

    public Dziecko(String imie, int zebrane_owoce, int max_pracy, int pozycja_x, int pozycja_y) {
        super(imie, zebrane_owoce, max_pracy, pozycja_x, pozycja_y);

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
