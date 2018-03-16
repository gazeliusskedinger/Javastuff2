/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.time.Duration;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author delorian1986
 */
public class CatchTheCreatureMain extends Application {
    
    
    int x = 4;
    int y = 4;
    int oldY;
    int oldX;
    int points = 0; 
    String p ="";
    @Override
    public void start(Stage primaryStage) { 
        GridPane root = new GridPane();
        Image spindel = new Image(getClass().getResourceAsStream("SpiderBig.png"));
        Image bakgrund = new Image(getClass().getResourceAsStream("BackgroundBig.png"));
        
        Text text = new Text(p);
        
        // skapar spelplanen
        for(int i = 1; i < 8; i++ ){
            for(int j = 1; j < 8; j++){
                root.add(new ImageView(bakgrund),i,j);
            }
        }
        // poäng texten
        root.add(text,8,1);
        
        Scene scene = new Scene(root, 300, 250);
        
        new AnimationTimer(){
            
            @Override
            public void handle(long now) {
                Creature creature = new Creature();
                
                //skriver över gamla positionen av splindeln
                root.add(new ImageView(bakgrund), x, y);
               // genererar ny position för spindeln
                x = random();
                y = random();
                // Skapar en spindel på ny position
                root.add(creature.getCreature(), x, y);
                
                // hur länge spindels skall finnas
                try{
                    TimeUnit.SECONDS.sleep(5);
                    
                }
                catch(Exception e){
                    System.out.println(e.toString());
                }
                // lägger ihop poäng och visar dem 
                points =+ creature.getPoints();
                p =""+points;
                text.setText(p);
            }
        
        }.start();
        
        primaryStage.setTitle("Catch The Creature");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    // skapar ny position
    public static int random(){
        
        return (int)(Math.random()*7)+1;
    }
}
