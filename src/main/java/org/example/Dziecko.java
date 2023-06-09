package org.example;

public class Dziecko extends Czlowiek{
    private int zjedzone_owoce;
    public Dziecko(String imie, int zebrane_owoce,int zjedzone_owoce, int max_pracy, int pozycja_x, int pozycja_y,int ile_przerw, boolean czy_dorosly){
        super(imie, zebrane_owoce, max_pracy, pozycja_x, pozycja_y,ile_przerw,czy_dorosly);
    }
    public int getZjedzone_owoce(){
        return this.zjedzone_owoce;
    }
    public void setZjedzone_owoce(int zjedzone_owoce){
        this.zjedzone_owoce = zjedzone_owoce;
    }
    //sprawdzam, czy dziecko jest oddalone o nie więcej niż 3 pola od dorosłego
    Boolean jedz_owoce(int pozycja_x, int pozycja_y){
        int roznica_x = Math.abs(pozycja_x - this.getPozycja_x());
        int roznica_y = Math.abs(pozycja_y - this.getPozycja_y());
        if(roznica_x <= 2 && roznica_y <= 2){
            return false;
        }
        else{
            return true;
        }
    }
}
