/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 *
 * @author delorian1986
 */
public class HistogramMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Skapar alla småsaker
        GridPane root = new GridPane();
        
        TextField urlPath = new TextField();
        
        Label path = new Label("Enter url:");
        path.setLabelFor(urlPath);
        path.setMnemonicParsing(true);
        
        Text text = new Text();
                    
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Data Span:");
        
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Antal:");        
        
        BarChart barChart = new BarChart<>(xAxis,yAxis);
        
        Button btn = new Button();
        btn.setText("Get Histogram");
        btn.setOnAction(new EventHandler<ActionEvent>(){
  
            @Override
            public void handle(ActionEvent event) {
                
                try{
                    // Data funktion skapar för histogrammet läsbar data
                    String url = urlPath.getText();
                    DataHandler dh = new DataHandler();
                    int formattedData[] = dh.dataFuntion(url);
                    
                    // skapar chartet
                    Chart chart = new Chart();
                    
                    // vår data
                    ObservableList<XYChart.Series<String, Number>> chartData = chart.makeDataToChart(formattedData);
                    // ger chartet datan
                    barChart.setData(chartData);
                    
                }
                catch(Exception e){
                    text.setText("the file does not exist!");
                    System.out.println(e.toString());
                }
            }
            
        });
        
        root.getChildren().addAll(urlPath, btn , path, text, barChart);
        
        // alla positioner
        GridPane.setConstraints(path, 1, 1, 1, 1, HPos.CENTER, VPos.CENTER);
        GridPane.setMargin(path, new Insets(5, 5, 5, 5));
        
        GridPane.setConstraints(urlPath, 2, 1, 1, 1, HPos.CENTER, VPos.CENTER);
        GridPane.setMargin(urlPath, new Insets(5, 5, 5, 5));
        
        GridPane.setConstraints(btn, 3, 1, 1, 1, HPos.CENTER, VPos.CENTER);
        GridPane.setMargin(btn, new Insets(5, 5, 5, 5));

        GridPane.setConstraints(text, 1, 2, 3, 1, HPos.CENTER, VPos.CENTER);
        GridPane.setMargin(text, new Insets(5, 5, 5, 5));

        GridPane.setConstraints(barChart, 1, 3, 3, 1, HPos.CENTER, VPos.CENTER);
        GridPane.setMargin(text, new Insets(5, 5, 5, 5));

        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("Histogram!");
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
