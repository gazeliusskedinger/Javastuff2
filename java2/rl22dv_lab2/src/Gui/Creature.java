/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author delorian1986
 */
public class Creature {
    
    Image spindel = new Image(getClass().getResourceAsStream("SpiderBig.png"));
    ImageView spider;
    int points = 0;
    
    Creature(){
        spider = new ImageView(spindel);
    }
    // skapar avataren
    public ImageView getCreature(){
        spider.setOnMousePressed(e -> {// fick ej denna att funka...
            points++;
            System.out.println(points);
        });
        return spider;
    }
    // skickar ut samlad poäng under stunden. 
    public int getPoints(){
          return points;
    }
    
}
