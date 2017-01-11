
package CastiLetiste;


public class Apron {

   private final byte cislo;
   private final byte velikost;
   private final boolean smer;
   private boolean obsazenost = false;
    
    
    public Apron(byte cislo, byte velikost, boolean smer) {
        this.cislo = cislo;
        this.velikost = velikost;
        this.smer = smer;
    }
    
    boolean jePrazdna(){
        return obsazenost == true;
    }
    
    
}

