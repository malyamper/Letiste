package Letadla;

import javafx.scene.image.ImageView;
import letiste.FXMLDocumentController;
import letiste.Hra;

public class MaleLetadlo extends Plane {

    private final byte velikost = 1;
    private final int palivoMax = 52000;
    private ImageView obrazek = new ImageView("Images/planeV.png");

    public void natankuj(int litry) {
        if ((getPalivo() + litry) <= palivoMax) {
            setPalivo(getPalivo() + litry);
        } else {
            //vyhodí chybu
        }
    }

    public void landing(int runway) {
        switch (runway) {
            case 9:
                x = 1400;
                y = 0;
                break;
            case 27:
                x = -1400;
                y = 0;
                break;
            case 18:
                x = 0;
                y = 1400;
                break;
            case 36:
                x = 0;
                y = -1400;
                break;

        }

        FXMLDocumentController.instance.jed(obrazek, x, y);

    }

    public byte getVelikost() {
        return velikost;
    }

    public int getPalivoMax() {
        return palivoMax;
    }

    public ImageView getObrazek() {
        return obrazek;
    }
    
    
    
}
