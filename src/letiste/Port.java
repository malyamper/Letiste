package letiste;

import CastiLetiste.Apron;
import CastiLetiste.Krizovatka;
import CastiLetiste.Runway;
import java.util.ArrayList;

public class Port {
    
    private static Port instance;
    
    private Port(){
    
}
    public static Port vratInstanci(){
   if(instance == null){
       instance = new Port();
   }
   return instance;
}   

     ArrayList<Apron> stojanky = new ArrayList<Apron>();//list stojánků
    ArrayList<Runway> drahy = new ArrayList<Runway>();//list přistávacích drah
    
    final ArrayList<Krizovatka> krizovatky = new ArrayList<Krizovatka>();//list krizovatek;
    private int aktualniDraha = 27;
    short pocetnaPlose = 0;
    short volnychStojanku = 0;

    public void setAktualniDraha(int aktualniDraha) {
        this.aktualniDraha = aktualniDraha;
    }

    public int getAktualniDraha() {
        return aktualniDraha;
    }
    

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

    //metoda vrati x souradnici aktualni drahy
      public int  vratSouradniceXAktualnidrahy (){
         int x = 0;
        for (int i = 0; i < drahy.size(); i++) {
            if(aktualniDraha == drahy.get(i).getCislo() ){
                x = drahy.get(i).getStartX();
            }
        }
        return x;
    }
       //metoda vrati y souradnici aktualni drahy
      public int  vratSouradniceYAktualnidrahy (){
         int y = 0;
        for (int i = 0; i < drahy.size(); i++) {
            if(aktualniDraha == drahy.get(i).getCislo() ){
                y = drahy.get(i).getStartY();
            }
        }
        return y;
    }
    // metoda vytvori drahy
    void nastavDrahy() {
        Runway r1 = new Runway(9,-246,157);
        drahy.add(r1);
        Runway r2 = new Runway(27,1485,157);
        drahy.add(r2);
        Runway r3 = new Runway(18,323,-700);    
        drahy.add(r3);
        Runway r4 = new Runway(36,323,1592);
        drahy.add(r4);

    }
    
    
    void naPlosePlus(){
        pocetnaPlose++;
        FXMLDocumentController.instance.naPlose();
    }
    
    void naPloseMinus(){
        pocetnaPlose--;
        FXMLDocumentController.instance.naPlose();
    }
  
    void nastavKrizovatky(){
       
        
    }
    
    void vytvorLetiste(){
        nastavDrahy();
        nastavStojanky();
        nastavKrizovatky();
    }

}
