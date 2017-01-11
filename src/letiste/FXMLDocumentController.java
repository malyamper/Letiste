
package letiste;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
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
    private void handleButtonAction(ActionEvent event) {
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    
    
    public void pridejObrazek(ImageView obrazek, int x, int y){
        canvas.getChildren().add(obrazek);
        obrazek.relocate(x, y);
        
    }
    
    public void jed(ImageView image, int x, int y){
        
        
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(10000), image);
        translateTransition.setToX(-1400);
        translateTransition.play();       
    }
    
    private void pristan(ImageView image, int x, int y){
        
        
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(10000), image);
        translateTransition.setToX(x);
        translateTransition.setToY(y);
        translateTransition.play();       
    }
    
    private void jedRovne(ImageView image, int x, int y){
        
        
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
    
}
