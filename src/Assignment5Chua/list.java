package Assignment5Chua;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class list implements Initializable {
    public ListView<Student> lsview = new ListView<>();
    @FXML
    Button btnAdd;

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
            //step2: khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            //step3 : tao url db
            String url = "jdbc:mysql://localhost:3306/t1907m?serverTimezone=UTC";
            String username = "root";
            String password = "";
            //step 4: ket noi DB
            Connection connection = DriverManager.getConnection(url, username, password);
            //query SQL
            String sql_text = "SELECT * FROM students";
            Statement stn = connection.createStatement();

            ResultSet resultSet = stn.executeQuery(sql_text);
            //1 danh sách cho FX
            ObservableList ls = FXCollections.observableArrayList();
            while (resultSet.next()) {
                Student student = new Student(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age"), resultSet.getInt("mark"));
                ls.add(student);
            }

            lsview.setOrientation(Orientation.VERTICAL);
            lsview.getItems().addAll(ls);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void from() {
        //dat ka noi chuyen man hinh
        try {
            Parent from = FXMLLoader.load(getClass().getResource("From.fxml"));
            Main.mainstage.getScene().setRoot(from);
        } catch (Exception e) {
        }
    }
}
