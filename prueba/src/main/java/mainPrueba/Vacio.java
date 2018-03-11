/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPrueba;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ubuntu
 */
public class Vacio {

    public void initStage(Parent root) {
        Stage stage = new Stage();
        Scene scene=new Scene(root);
        
        stage.setScene(scene);
        
        stage.setTitle("prueba");
        stage.show();
    }
    
}
