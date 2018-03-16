/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.io.FileNotFoundException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

/**
 *
 * @author delorian1986
 */
public class Chart {
    
    public static ObservableList<XYChart.Series<String, Number>> makeDataToChart(int formattedData[])throws FileNotFoundException {
        // Skappar chartdata
        XYChart.Series<String,Number> theData = new XYChart.Series<>();
        theData.getData().addAll(new XYChart.Data("1-10",formattedData[0]),
                              new XYChart.Data("11-20",formattedData[1]),
                              new XYChart.Data("21-30",formattedData[2]),
                              new XYChart.Data("31-40",formattedData[3]),
                              new XYChart.Data("41-50",formattedData[4]),
                              new XYChart.Data("51-60",formattedData[5]),
                              new XYChart.Data("61-70",formattedData[6]),
                              new XYChart.Data("71-80",formattedData[7]),
                              new XYChart.Data("81-90",formattedData[8]),
                              new XYChart.Data("91-100",formattedData[9]),
                              new XYChart.Data("101 <...",formattedData[10]));
        
        ObservableList<XYChart.Series<String,Number>> data = FXCollections.<XYChart.Series<String, Number>>observableArrayList();
        data.add(theData);
                
        return data;
    }
    
}
