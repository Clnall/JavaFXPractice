//https://www.youtube.com/watch?v=S_JN7zO12H4
//JavaFX Java GUI Tutorial - 2 - Handle User Events

import javafx.application.Application;
//import javafx.event.ActionEvent; //unused again
//import javafx.event.EventHandler; //unused again
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ep3 extends Application{
    public static void main(String[] args){
        launch(args);
    }

    Button button;

    @Override 
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First Window"); 

        button = new Button(); 
        button.setText("Click me");
        
        //this class will handle the button events
        button.setOnAction(e -> {
            System.out.println("Hello"); //can have more functionality here
            System.out.println("World");
        });

        StackPane layout = new StackPane(); 
        layout.getChildren().add(button); 

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }

}