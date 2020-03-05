package Assignment5Chua;

import assignment1.Fraction;
import assignment5.StudentSql;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public static Stage mainstage;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        mainstage = primaryStage;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            primaryStage.setTitle("Student");
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.show();
        }catch (Exception e){

        }
    }
}
