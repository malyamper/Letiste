package letiste;

import CastiLetiste.Apron;
import CastiLetiste.Krizovatka;
import CastiLetiste.Runway;
import java.util.ArrayList;

public class Port {

     ArrayList<Object> stojanky = new ArrayList<Object>();//list stojánků
    ArrayList<Object> drahy = new ArrayList<Object>();//list přistávacích drah
    final ArrayList<Object> krizovatky = new ArrayList<Object>();//list krizovatek;

    //metoda nastaví parametry jednotlivým stojánků
    void nastavStojanky() {
        byte[] velikosti = {
            1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 2
        };
        boolean[] smery = {
            //leva =true, prava = false
            false, true, false, true, false, true, false, true, false, true, false, true, false, true
        };

        for (byte i = 0; i < velikosti.length; i++) {
            if (i <= 7) {
                Apron apron = new Apron(i, velikosti[i], smery[i]);
                stojanky.add(apron);
            } else {
                Apron apron = new Apron((byte) (i + 3), velikosti[i], smery[i]);
                stojanky.add(apron);
            }
        }

    }

    // metoda vytvori drahy
    void nastavDrahy() {
        Runway r1 = new Runway(9);
        drahy.add(r1);
        Runway r2 = new Runway(27);
        drahy.add(r2);
        Runway r3 = new Runway(18);
        drahy.add(r3);
        Runway r4 = new Runway(36);
        drahy.add(r4);

    }
    
    void nastavKrizovatky(){
       
        
    }
    
    void vytvorLetiste(){
        nastavDrahy();
        nastavStojanky();
        nastavKrizovatky();
    }

}
