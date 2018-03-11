package mainPrueba;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;
import mainPrueba.HelloAndroid;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import mainPrueba.Vacio;



public class main extends Application {
    
    @Override
    public void start (Stage stage) throws Exception {
        int cnt = 0;
        Screen primaryScreen = Screen.getPrimary();
        Rectangle2D visualBounds = primaryScreen.getVisualBounds();
        double width = visualBounds.getWidth();
        double height = visualBounds.getHeight();
        Label l = new Label("Click the button.");
        l.setTranslateY(30);
        Button button = new Button("Hello Android");
        button.setOnAction(e -> l.setText("You clicked the button."));
        Rectangle rectangle = new Rectangle(width-20, height-20);
        rectangle.setFill(Color.LIGHTBLUE);
        rectangle.setArcHeight(6);
        rectangle.setArcWidth(6);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(rectangle, button, l);
        Scene scene = new Scene (stackPane, visualBounds.getWidth(), visualBounds.getHeight());
       
        stage.setScene(scene);
        stage.show();
//        System.out.println(getClass().getResource("/home/ubuntu/NetBeansProjects/rootPrueba/prueba/src/main/java/login.fxml"));
//        
//        FXMLLoader loader=new FXMLLoader(getClass().getResource("login.fxml"));
//        Parent root=(Parent)loader.load();
//
//        Vacio vacio=loader.getController();
//        vacio.initStage(root);
    }
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        launch(args);
        
    }
   
}
