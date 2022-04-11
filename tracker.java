/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package tracker;

import javafx.application.Application;
import javafx.stage.Stage;

public class tracker extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        new MainPage().setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
