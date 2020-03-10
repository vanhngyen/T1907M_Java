package assignment8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static ArrayList<Student> students = new ArrayList<>();
    public static Stage stageStudent;
    public static void main(String[] args) {
        launch(args);
    }
    public static Parent formPagestudent;
    public static Parent listPagestudent;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stageStudent = primaryStage;
        if(listPagestudent == null){
        listPagestudent = FXMLLoader.load(getClass().getResource("liststudent.fxml"));
        }
        primaryStage.setTitle("Nhap thong tin sinh vien");
        primaryStage.setScene(new Scene(listPagestudent,600,400));
        primaryStage.show();

    }
}
