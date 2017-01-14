/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letiste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jiří
 */
public class FXMLVysledkyController implements Initializable {

    @FXML
    private GridPane pane;
    @FXML
    private Button tlacitko;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void tabulka() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; i < 2; i++) {
                try (BufferedReader br = new BufferedReader(new FileReader("Images/skore.txt"))) {
                    String s;
                    while ((s = br.readLine()) != null) {
                        pane.add(pane, i, j);
                    }

                } catch (Exception e) {
                }
                System.err.println("Chyba při četení ze souboru.");
            }
        }
    }

    @FXML
    private void zpet(ActionEvent event) {
        Stage stage = (Stage) tlacitko.getScene().getWindow();
        stage.close();
    }

}
