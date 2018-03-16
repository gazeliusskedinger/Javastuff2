/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randompanel;

import javafx.application.Application;
import javafx.event.ActionEvent;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author delorian1986
 */
public class BorderRandomPanelMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        RandomPanel root = new RandomPanel();
        
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Border Random Panel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
