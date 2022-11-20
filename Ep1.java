//https://www.youtube.com/watch?v=FLkOX4Eez6o
//JavaFX Java GUI Tutorial - 1 - Creating a Basic Window

import javafx.application.Application;
//import javafx.event.ActionEvent; //Unused
//import javafx.event.EventHandler; //Unused
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ep1 extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override //type "start" then press enter for auto generation of method
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First Window"); //name the Stage or Window

        Button button = new Button(); //create new button
        button.setText("Click me"); //apply text on top of button

        StackPane layout = new StackPane(); //create new StackPane
        layout.getChildren().add(button); //pop button into the layout

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene); //pops scene (contents of the window) into the Stage (Window)
        primaryStage.show(); //makes window appear
    }

}
