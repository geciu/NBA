package NBA;

import javax.swing.*;
import java.awt.*;


public class Koszykarz {

    private String imieNazwisko;
    double zarobki;
    int numery[];

    final static double salary = 94;

    Koszykarz(String imieNazwisko, double zarobki, int numery[]){
        this.imieNazwisko = imieNazwisko;
        this.zarobki = zarobki;
        this.numery = numery;
    }

    Koszykarz(String imieNazwisko, double zarobki){
        this.imieNazwisko = imieNazwisko;
        this.zarobki = zarobki;
    }

    public void tyleZarabiam(){
        double procentSalary = (zarobki/salary)*100;
        if(procentSalary < 40) System.out.println(imieNazwisko + " zarabia " + zarobki + " dolarow, co stanowi " + procentSalary + "% salary klubu. Jest on dobrym graczem");
        else if(procentSalary >= 40 && procentSalary < 60) System.out.println(imieNazwisko + " zarabia " + zarobki + " dolarow, co stanowi " + procentSalary + "% salary klubu. Jest on bardzo dobrym graczem");
        else if(procentSalary >= 60 && procentSalary < 80) System.out.println(imieNazwisko + " zarabia " + zarobki + " dolarow, co stanowi " + procentSalary + "% salary klubu. Jest on All-Stare'em");
        else System.out.println(imieNazwisko + " zarabia " + zarobki + " dolarow, co stanowi " + procentSalary + "% salary klubu. Jest on przepłaconym graczem");
        System.out.println();
    }
}
