package NBA;

import javax.swing.*;
import java.awt.*;

public class Liga {

    public enum Kluby {Celtics, lakers, Heat, Warriors}

    public static void main (String args[]){
        Koszykarz Kobe = new Koszykarz("Kobe", 90, new int[]{8, 24});
        Kobe.tyleZarabiam();
        Kobe.zainteresowanie(Kluby.lakers);
    }
}
