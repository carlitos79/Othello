/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversiboard;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author optimusprime
 */
public class OthelloCoin {
    
    private final Circle coin;
    
    public OthelloCoin(String Color){
        coin = new Circle();
 
        coin.setRadius(15);
        coin.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
        
    }
    
   public Circle getCoin(){
        return this.coin;
    }


}
