
package CastiLetiste;


public class Krizovatka {
   private final short id;
    private final double x;
    private final double y;
    
    
    // id sousednich krizovatek
    short severId;
    short jihId;
    short vychodId;
    short zapadId;

    public Krizovatka(short id, double x, double y, short severId, short jihId, short vychodId, short zapadId) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.severId = severId;
        this.jihId = jihId;
        this.vychodId = vychodId;
        this.zapadId = zapadId;
    }
   
    
}
