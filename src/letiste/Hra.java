package letiste;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.util.Duration;

public class Hra {

    private static Hra instance;

    private Port port;
    private LetadlaVeHre letadla;
    private int aktualniDraha = 27;
    int x = 10;

    private Hra() {

    }

    public int getAktualniDraha() {
        return aktualniDraha;
    }

    public void setAktualniDraha(int aktualniDraha) {
        this.aktualniDraha = aktualniDraha;
    }

    public static Hra vratInstanci() {
        if (instance == null) {
            instance = new Hra();
        }
        return instance;
    }

    public void novaHra() {

        Port.vratInstanci().vytvorLetiste();
        run();

    }

    public void run() {
        letadla = new LetadlaVeHre();
        letadla.noveLetadlo(aktualniDraha);

        
        PauseTransition wait = new PauseTransition(Duration.seconds(x));

        wait.setOnFinished((e) -> {

            letadla.noveLetadlo(aktualniDraha);
            wait.playFromStart();
        });
        wait.play();

    }

}
