
package CastiLetiste;

import letiste.Port;


public class Runway {
    
     private  int cislo;
     private int startX;
     private int startY;

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }
     
    public int getCislo() {
        return cislo;
    }
    
    public Runway(int cislo, int startX, int startY) {
        this.cislo = cislo;
        this.startX = startX;
        this.startY = startY;
    }
   
   
}


