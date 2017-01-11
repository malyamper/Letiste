
package letiste;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Hra {
    
private static Hra instance = new Hra();

private Hra(){
    
}
public static Hra vratInstanci(){
    return instance;
}   


Port port = new Port(); 
LetadlaVeHre letadla = new LetadlaVeHre();  

                    
     public void novaHra(){
     port.vytvorLetiste();
     run();
               
     }
     
     public void run(){
      LetadlaVeHre letadlaveHre = new LetadlaVeHre(); 
      letadlaveHre.noveLetadlo();
      
     
      
      
     }

     
     
     
     
       
}
