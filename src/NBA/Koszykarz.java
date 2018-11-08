package NBA;

import javax.swing.*;
import java.awt.*;


public class Koszykarz {

    private String imieNazwisko;
    double zarobki;
    int numery[];

    final static double salary = 94;

    Koszykarz(String imieNazwisko, int zarobki, int numery[]){
        this.imieNazwisko = imieNazwisko;
        this.zarobki = zarobki;
        this.numery = numery;
    }

    Koszykarz(String imieNazwisko, int zarobki){
        this.imieNazwisko = imieNazwisko;
        this.zarobki = zarobki;
    }

    public void tyleZarabiam(){
        double procentSalary = (zarobki/salary)*100;
        double wartosc = procentSalary;

        if(wartosc >= 0 && wartosc < 40) {wartosc=0;}
        else if(wartosc >= 40 && wartosc < 60) {wartosc=1;}
        else if(wartosc >= 60 && wartosc < 80) {wartosc=2;}
        else {wartosc=3;};
        System.out.println();

        switch((int)wartosc){
            case 0: System.out.println(imieNazwisko + " zarabia " + zarobki + "mln $, co stanowi " + procentSalary + "% salary klubu. Jest on dobrym graczem");
            break;
            case 1: System.out.println(imieNazwisko + " zarabia " + zarobki + "mln $, co stanowi " + procentSalary + "% salary klubu. Jest on bardzo dobrym graczem");
            break;
            case 2: System.out.println(imieNazwisko + " zarabia " + zarobki + "mln $, co stanowi " + procentSalary + "% salary klubu. Jest on All-Stare'em");
            break;
            case 3: System.out.println(imieNazwisko + " zarabia " + zarobki + "mln $, co stanowi " + procentSalary + "% salary klubu. Jest on przepłaconym graczem");
            break;
            default: System.out.println("Wystąpił problem. Spróbuj jeszcze raz.");
        }
    }

    public void zainteresowanie(Liga.Kluby klub){
        int ile = 0;

        for (int i =0; i <  numery.length; i++){
            ile++;
        }

        System.out.println("Zawodnikiem " + imieNazwisko + ", który nosił " + ile + " numerów na koszulce, interesuje się klub " + klub);
    }



}
