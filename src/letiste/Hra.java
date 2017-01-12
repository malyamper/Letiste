
package letiste;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Hra {
    
private static Hra instance;

private Port port;
private LetadlaVeHre letadla;

private Hra(){
    
}
public static Hra vratInstanci(){
   if(instance == null){
       instance = new Hra();
   }
   return instance;
}    

                    
     public void novaHra(){
     port = new Port();
     port.vytvorLetiste();
     run();
               
     }
     
     public void run(){
      letadla = new LetadlaVeHre(); 
      letadla.noveLetadlo();
      
     
      
      
     }

     
     
     
     
       
}
