
package letiste;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FXMLMenuController implements Initializable {
    @FXML
    private Button novaHra;
   
    @FXML
    private Button nejlepsiVysledky;
    
    @FXML
    private Button ukoncit;
    
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    @FXML
    private void start(ActionEvent event) {
        
        Stage stage = new Stage();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            stage.setFullScreen(true);
            stage.setScene(scene);
            stage.show();
           
        } catch (IOException ex) {
            Logger.getLogger(FXMLMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Hra.vratInstanci().novaHra();
    }
    
     @FXML
     private void vysledky(ActionEvent event) {

        Stage stage = new Stage();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLVysledky.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
           
        } catch (IOException ex) {
            Logger.getLogger(FXMLMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void ukoncit(ActionEvent event) {
        Platform.exit();
    }
    
}
