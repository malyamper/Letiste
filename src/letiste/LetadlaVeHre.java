package letiste;

import CastiLetiste.Runway;
import Letadla.MaleLetadlo;
import Letadla.VelkeLetadlo;
import java.util.ArrayList;
import java.util.Random;

public class LetadlaVeHre {

    private Random random = new Random();

    public int getPocetMalych() {
        return pocetMalych;
    }

    public int getPocetVelkych() {
        return pocetVelkych;
    }

    public ArrayList<Object> getLetadlaVeHre() {
        return letadlaVeHre;
    }

    int pocetMalych = 0;
    int pocetVelkych = 0;

    // List všech současných letadel ve hře 
    ArrayList<Object> letadlaVeHre = new ArrayList<Object>();

    // metoda přidá do hry malé letadlo
    private void noveMaleLetadloDoHry(int x, int y) {
        MaleLetadlo m = new MaleLetadlo();
        letadlaVeHre.add(m);
        pocetMalych++;
        FXMLDocumentController.instance.pridejObrazek(m.getObrazek(), x, y);
        m.landing(Port.vratInstanci().getAktualniDraha());
        //  m.zatoc(true);
    }

    // metoda přidá do hry velké letadlo
    private void noveVelkeLetadloDoHry(int x, int y) {
        VelkeLetadlo m = new VelkeLetadlo();
        letadlaVeHre.add(m);
        pocetVelkych++;
        FXMLDocumentController.instance.pridejObrazek(m.getObrazek(), x, y);
        m.landing(Port.vratInstanci().getAktualniDraha());

        // m.zatoc(true);
    }
// po dbavení metoda odebere letadlo

    void odeberLetadlo(int cislo) {
        letadlaVeHre.remove(cislo);

    }
    //metoda určí, zda bude letadlo malé nebo velké

    void noveLetadlo(int cisloDrahy) {

        int x = Port.vratInstanci().vratSouradniceXAktualnidrahy();
        int y = Port.vratInstanci().vratSouradniceYAktualnidrahy();
        int a = random.nextInt(4);
        if (a == 0 && pocetVelkych < 4) {
            noveVelkeLetadloDoHry(x, y);
        } else {
            noveMaleLetadloDoHry(x, y);
        }
        Port.vratInstanci().naPlosePlus();

    }

}
