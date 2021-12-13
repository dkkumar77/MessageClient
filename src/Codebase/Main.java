package Codebase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ms.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        primaryStage.setResizable(true);
        primaryStage.centerOnScreen();
        primaryStage.setMaxHeight(600);
        primaryStage.setMaxWidth(600);
        primaryStage.setHeight(400);
        primaryStage.setMinWidth(600);



    }

    public static void main(String[] args) {
        launch(args);

    }


}
