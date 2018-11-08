package NBA;

import javax.swing.*;
import java.awt.*;

public class Liga {

    public enum Kluby {Celtics, lakers, Heat, Bulls}

    public static void main (String args[]){

        Koszykarz Kobe = new Koszykarz("Kobe Bryant", 30, new int[]{8, 24});
        Kobe.tyleZarabiam();
        Kobe.zainteresowanie(Kluby.lakers);

        Koszykarz Jordan = new Koszykarz("Michael Jordan", 60, new int[]{23, 45});
        Jordan.tyleZarabiam();
        Jordan.zainteresowanie(Kluby.Bulls);

        Kobe.noweSalary(100);       //zmieniamy salary dla wszystkich
        Kobe.tyleZarabiam();
        Jordan.tyleZarabiam();
    }
}
