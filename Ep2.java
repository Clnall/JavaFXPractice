//https://www.youtube.com/watch?v=S_JN7zO12H4
//JavaFX Java GUI Tutorial - 2 - Handle User Events

import javafx.application.Application;
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ep2 extends Application implements EventHandler<ActionEvent>{
    public static void main(String[] args){
        launch(args);
    }

    Button button; //important to now have button not declared in a method so handle can use it
    Button button2;

    @Override 
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First Window"); 

        button = new Button(); 
        button.setText("Click me"); 
        button.setOnAction(this); //"this" could be another class

        //button = new Button(); //idk how to move the button from the middle of the screen
        //button.setText("Button2");
        //button.setOnAction(this);

        StackPane layout = new StackPane(); 
        layout.getChildren().add(button); 

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }

    @Override //type "handle" then press enter for auto generation
    public void handle(ActionEvent event) {
        if(event.getSource()==button){ //getSource() what caused this method to be activated
            System.out.println("Hello World");
        }
        if(event.getSource()==button2){
            System.out.println("Another Button");
        }
    }

}