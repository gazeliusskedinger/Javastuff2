/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifx;


import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author delorian1986
 */
public class OneTwoTree extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Text topText = new Text("One");
        
        Text middleText = new Text("Two");
        
        Text bottomText = new Text("Three");
    
        StackPane top = new StackPane();
        top.setPrefSize(500,100);
        top.setStyle("-fx-background-color: #336699;");
        top.getChildren().addAll(topText);
        top.setAlignment(Pos.TOP_LEFT);
        
        StackPane middle = new StackPane();
        middle.setPrefSize(500,100);
        middle.setStyle("-fx-background-color: #993366;");
        middle.getChildren().addAll(middleText);
        middle.setAlignment(Pos.CENTER);
        
        StackPane bottom = new StackPane();
        bottom.setPrefSize(500, 100);
        bottom.setStyle("-fx-background-color: #669933;");
        bottom.getChildren().addAll(bottomText);
        bottom.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox root = new VBox(1, top, middle, bottom);
        root.setStyle("-fx-background-color: #000000;");
        Scene scene = new Scene(root, 500, 300);
        
        primaryStage.setTitle("OneTwoThree");
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
