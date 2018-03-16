/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randompanel;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
/**
 *
 * @author delorian1986
 */
public class RandomPanel extends BorderPane{
    
    RandomPanel(){
       Text text = new Text();
       text.setFont(Font.font(100));
       
       Button random = new Button();
       random.setText("new random");
       random.setOnAction(new EventHandler<ActionEvent>(){
  
           @Override
           public void handle(ActionEvent event) {
               String number = randomNum();
               text.setText(number);
           }
            
        });
       
       
        
       StackPane top = new StackPane();
       top.getChildren().add(text);
       top.setPrefSize(200, 100);
       top.setAlignment(Pos.CENTER);
       top.setStyle("-fx-background-color: #996699;");
       
       StackPane bottom = new StackPane();
       bottom.getChildren().add(random);
       bottom.setPrefSize(200, 100);
       bottom.setAlignment(Pos.CENTER);
       bottom.setStyle("-fx-background-color: #336699;");
       
       
       setTop(top);
       setBottom(bottom);
    }
    
    public String randomNum(){
        int random = (int)(Math.random()*100)+1;
        String number = Integer.toString(random);
        return number;
        
    }
}

