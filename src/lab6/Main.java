package lab6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("lab6/listPd.fxml"));
        Scene scene = new Scene(root,700,400);
        primaryStage.setTitle("Shopping");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
