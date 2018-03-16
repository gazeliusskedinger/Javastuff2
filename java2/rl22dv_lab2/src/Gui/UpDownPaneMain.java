/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.GridPane.setConstraints;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

/**
 *
 * @author delorian1986
 */
public class UpDownPaneMain extends Application {
    int x = 4;
    int y = 4;
    int oldY;
    int oldX;
   
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        Image spindel = new Image(getClass().getResourceAsStream("Spindel.png"));
        Image bakgrund = new Image(getClass().getResourceAsStream("Bakgrund.png"));
        
        // skapar spelplanen
        for(int i = 1; i < 8; i++ ){
            for(int j = 1; j < 8; j++){
                root.add(new ImageView(bakgrund),i,j);
            }
        }
        root.add(new ImageView(spindel), x, y);
        Scene scene = new Scene(root, 112, 112);
        // styr saken med piltangenterna.
        scene.setOnKeyPressed(e -> {
            oldX = x;
            oldY = y;
            if(e.getCode() == KeyCode.UP){
                y--;
            }
            else if(e.getCode() == KeyCode.DOWN){
                y++;
            }
            else if(e.getCode() == KeyCode.LEFT){
                x--;
            }
            else if(e.getCode() == KeyCode.RIGHT){
                x++;
            }
            
            x = positionCheck(x);
            y = positionCheck(y);
            
            root.add(new ImageView(bakgrund),oldX,oldY);
            root.add(new ImageView(spindel), x, y);
        });
        
        // 
        primaryStage.setTitle("UpDownPane");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    // position limit setter.
    public static int positionCheck(int pos){
        if(pos > 7){
            pos = 1;
        }
        else if(pos <= 0){
            pos = 7;
        }
        return pos;
    }
}
