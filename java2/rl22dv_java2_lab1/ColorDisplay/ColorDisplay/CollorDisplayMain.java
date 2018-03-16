/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColorDisplay;

import com.sun.deploy.util.StringUtils;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author delorian1986
 */
public class CollorDisplayMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        String bluue = "0";
        String reed = "0";
        String greeen  = "0";
        
        Text redText = new Text("Red");
        
        TextField red = new TextField("0");
        red.setPromptText("red");
        red.setPrefColumnCount(5);
        
        Text blueText = new Text("Blue");
        
        TextField blue = new TextField("0");
        blue.setPromptText("blue");
        blue.setPrefColumnCount(5);
        
        Text greenText = new Text("Green");
        
        TextField green = new TextField("0");
        green.setPromptText("green");
        green.setPrefColumnCount(5);
        
        
        GridPane middle = new GridPane();
        middle.getChildren().addAll(red,blue,green,redText,blueText,greenText );
        middle.setAlignment(Pos.CENTER);
        GridPane.setRowIndex(red, 2);
        GridPane.setColumnIndex(red, 1);
        GridPane.setRowIndex(green, 2);
        GridPane.setColumnIndex(green, 2);
        GridPane.setRowIndex(blue, 2);
        GridPane.setColumnIndex(blue, 3);
        GridPane.setRowIndex(redText, 1);
        GridPane.setColumnIndex(redText, 1);
        GridPane.setRowIndex(greenText, 1);
        GridPane.setColumnIndex(greenText, 2);
        GridPane.setRowIndex(blueText, 1);
        GridPane.setColumnIndex(blueText, 3);

        middle.setStyle("-fx-padding: 10;"+
                "-fx-border-style: solid inside;"+
                "-fx-border-width: 2;"+
                "-fx-border-insets: 5;"+
                "-fx-border-radius: 2;"+
                "-fx-border-color:blue;");
        
        middle.setPrefSize(100, 300);
        middle.setStyle("-fx-background-color: #993366;");
        
        
       
        
        Text colorDisp = new Text("Color Display");
        colorDisp.setFont(Font.font(45));
        
        StackPane top = new StackPane();
        top.setPrefSize(100, 300);
        top.setStyle("-fx-background-color: rgb("+reed+","+greeen+","+bluue+");");
        top.getChildren().add(colorDisp);
        Button newColor = new Button("set color");
        newColor.setOnAction(new EventHandler<ActionEvent>(){
  
           @Override
           public void handle(ActionEvent event) {
              final String reeed = red.getText();
              final String greeeen = green.getText();
              final String bluuue = blue.getText();
              System.out.println(bluuue+" "+greeeen+" "+reeed);
   
              top.setStyle("-fx-background-color: rgb("+reeed+","+greeeen+","+bluuue+");");
                
           }
            
        });
        StackPane bottom = new StackPane();
        bottom.setPrefSize(100, 300);
        bottom.setStyle("-fx-background-color: #669933;");
        bottom.getChildren().add(newColor);
        
        VBox root = new VBox(1,top,middle,bottom);
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("Hello World!");
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
