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
import javafx.stage.Stage;

/**
 *
 * @author Carlos
 */

public class ReversiBoard extends Application {
    /*
    Hittade allt det här på:
    https://docs.oracle.com/javafx/2/api/javafx/stage/Stage.html
    */
    @Override
    public void start(Stage primaryStage) {
        
        GridPane board = new GridPane();
        final int numSqr = 8;
        
        for (int row = 0; row < numSqr; row++) {
            for (int col = 0; col < numSqr; col ++) {
                
                StackPane square = new StackPane();
                String color;
                
                if ((row + col) % 2 == 0) { // each other square / varannan ruta
                    color = "FORESTGREEN"; // List of colors here: https://docs.oracle.com/javafx/2/api/javafx/scene/paint/Color.html
                } else {
                    color = "GREEN";
                }
                square.setStyle("-fx-background-color: "+ color +";"); // mark this and...
                //square.setStyle("-fx-border-color: FORESTGREEN"); // Unmark this and see what you get...
                board.add(square, col, row);
            }
        }
        
        for (int i = 0; i < numSqr; i++) {
            
            /* Creates a column constraint object with a fixed size range, horizontal grow priority, horizonal alignment, and horizontal fill behavior.
            Hittade allt det här på:
            https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/ColumnConstraints.html
            */
            board.getColumnConstraints().add(new ColumnConstraints(10, Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, HPos.CENTER, true));
            board.getRowConstraints().add(new RowConstraints(10, Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, VPos.CENTER, true));
        }
        
        primaryStage.setScene(new Scene(board, 400, 400));  // dictates the size of the whole thing...
        primaryStage.show();
    }

    public static void main(String[] args){
        
        Application.launch(args);
    }
}