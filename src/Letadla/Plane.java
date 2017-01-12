package Letadla;

import java.util.ArrayList;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import letiste.FXMLDocumentController;
import letiste.Hra;

public class Plane {
    
    Random random = new Random();

   private final short cisloLetu;
   private int palivo;
    int x;
    int y;

    public Plane() {
        this.cisloLetu = generujCisloLetu();
        this.palivo = generujPalivo();
      
    }
   
   
  
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public short getCisloLetu() {
        return cisloLetu;
    }

    public int getPalivo() {
        return palivo;
    }


    
    public void setPalivo(int palivo) {
        this.palivo = palivo;
    }
       //metoda generuje cisla letů
      //čtyřístné kody začínající na 1,2,3 nebo 
    short generujCisloLetu(){
       short cislo = 0;
       int zacatek = random.nextInt(4)+1;
       zacatek = zacatek * 1000;
       int konec = random.nextInt(1000);
       cislo = (short) (zacatek + konec);
       return cislo;
    }

      //metoda generuje zbylé palivo v letounu po přistání
    int generujPalivo(){
        int palivo = random.nextInt(20)+1;
        palivo = palivo *1000;
        return palivo;
        
    }
    
   

    void takeoff(int runway) {

    }

    void parkuj(int Apron) {

    }

    void dopredu(int x, int y, int Nx, int Ny) {

    }

    void zatoc(boolean strana) {

    }

    void pushBack(boolean smer) {

    }

    void parking(byte cislo) {
 
    }
}
