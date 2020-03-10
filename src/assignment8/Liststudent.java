package assignment8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Liststudent implements Initializable {
    public Button btnbackto = new Button();
    public ListView<Student> listview = new ListView<>();
    public static StudentDataAccessObject sdao = StudentDataAccessObject.getInstance();
    public static ObservableList<Student> listdata = FXCollections.observableArrayList();
    public static ArrayList<Student> ls = new ArrayList<>();

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            reloadData();
            listview.setItems(listdata);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void reloadData() throws Exception {
        ls = sdao.list();
        listdata.addAll(ls);
    }

    public void backtostudent(ActionEvent actionEvent) {
        try {
            if (Main.formPagestudent == null)
                Main.formPagestudent = FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.listPagestudent.getScene().setRoot(Main.formPagestudent);
            // mainStage la 1 bien static trong lop Main
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
