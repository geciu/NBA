package NBA;

import javax.swing.*;
import java.awt.*;


public class Koszykarz {

    private String imieNazwisko;
    double zarobki;
    int numery[];

    Koszykarz(String imieNazwisko, double zarobki, int numery[]){
         imieNazwisko = imieNazwisko;
         zarobki = zarobki;
         numery = numery;
    }

    Koszykarz(String imieNazwisko, double zarobki){
        imieNazwisko = imieNazwisko;
        zarobki = zarobki;
    }

}
