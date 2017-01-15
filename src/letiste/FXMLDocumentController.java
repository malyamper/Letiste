package letiste;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FXMLDocumentController implements Initializable {

    public static FXMLDocumentController instance;
    @FXML
    private ImageView pozadi;
    @FXML
    private MenuButton menu;
    @FXML
    private ImageView plocha;
    @FXML
    private MenuItem Konec;
    @FXML
    private AnchorPane pane;
    @FXML
    private Pane canvas;
    @FXML
    private MenuButton PristavaciDraha;
    @FXML
    private Label cisloDrahy;
    @FXML
    private Label upozorneniPristani;
    @FXML
    private Label odbaveno;
    @FXML
    private Label letadelNaPlose;
    @FXML
    private Label volnychStojanku;

    @FXML
    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        instance = this;
        cisloDrahy.setText("27");
    }

    @FXML
    private void upozorneniPristani() {
        upozorneniPristani.setText("Přistává letadlo !!!");
        PauseTransition wait = new PauseTransition(Duration.seconds(8));

        wait.setOnFinished((e) -> {
            upozorneniPristani.setText("");

            wait.playFromStart();
        });

        wait.play();
    }

    @FXML
    private void set27(ActionEvent event) {
        cisloDrahy.setText("27");
        Port.vratInstanci().setAktualniDraha(27);

    }

    @FXML
    private void set09(ActionEvent event) {
        cisloDrahy.setText("09");
        Port.vratInstanci().setAktualniDraha(9);

    }

    @FXML
    private void set36(ActionEvent event) {
        cisloDrahy.setText("36");
        Port.vratInstanci().setAktualniDraha(36);

    }

    @FXML
    private void set18(ActionEvent event) {
        cisloDrahy.setText("18");
        Port.vratInstanci().setAktualniDraha(18);

    }

    public void pridejObrazek(ImageView obrazek, int x, int y) {
        canvas.getChildren().add(obrazek);
        obrazek.relocate(x, y);
        
        obrazek.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {

            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                // do something
            }
        });

    }

    public void pristan(ImageView image, int x, int y, int strana) {
        upozorneniPristani();
        image.setRotate(strana);
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(10000), image);
        translateTransition.setToX(x);
        translateTransition.setToY(y);
        translateTransition.play();
        naPlose();

    }

    public void zatoc(ImageView image, int stupne) {
        RotateTransition rotateTransition = new RotateTransition(Duration.millis(4000), image);
        rotateTransition.setByAngle(stupne);
        rotateTransition.play();

    }

    private void jedRovne(ImageView image, int x, int y) {

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(10000), image);
        translateTransition.setToX(x);
        translateTransition.setToY(y);
        translateTransition.play();
    }

    @FXML
    private void ukoncit(ActionEvent event) {
        //     Platform.exit();
        Stage stage = new Stage();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLOknoKonec.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(FXMLMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    @FXML
    public void naPlose() {
        short i = Port.vratInstanci().pocetnaPlose;
        String s = Integer.toString(i);
        letadelNaPlose.setText(s);

    }

}
