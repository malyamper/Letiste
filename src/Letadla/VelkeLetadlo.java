package Letadla;

import javafx.scene.image.ImageView;
import letiste.FXMLDocumentController;
import letiste.Hra;

public class VelkeLetadlo extends Plane {

    private final byte velikost = 2;
    private final int palivoMax = 125000;
    private ImageView obrazek = new ImageView("Images/velke.png");

    public void natankuj(int litry) {
        if ((getPalivo() + litry) <= palivoMax) {
            setPalivo(getPalivo() + litry);
        } else {
            //vyhodí chybu
        }
    }

    public void zatoc(boolean strana) {
        if (strana == true) {
            FXMLDocumentController.instance.zatoc(obrazek, -90);
        } else {
            FXMLDocumentController.instance.zatoc(obrazek, 90);
        }
    }

    public void landing(int runway) {
        
        switch (runway) {
            case 9:
                x = 1330;
                y = 0;
                strana = 180;
                break;
            case 27:
                x = -1330;
                y = 0;
                strana = 0;
                break;
            case 18:
                x = 0;
                y = 1330;
                strana = -90;
                break;
            case 36:
                x = 0;
                y = -1330;
                strana = 90;
                break;

        }

        FXMLDocumentController.instance.pristan(obrazek, x, y, strana);
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
