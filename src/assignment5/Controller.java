package assignment5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAge;
    @FXML
    private TextField txtMark;
    @FXML
    private TableView listStudent;
    @FXML
    private Button btnSubmit;
    int index;
    StudentSql sql = new StudentSql();
    ObservableList<Student> data;

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
        TableColumn id = new TableColumn("ID");
        TableColumn name = new TableColumn("Name");
        TableColumn age = new TableColumn("Age");
        TableColumn mark = new TableColumn("Mark");
        listStudent.getColumns().addAll(id, name, age, mark);

        data = FXCollections.observableArrayList(sql.getlist());
        id.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        age.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
        mark.setCellValueFactory(new PropertyValueFactory<Student, Integer>("mark"));
        listStudent.setItems(data);
    }

    public void addNewStudent(ActionEvent actionEvent) {
        Student student = new Student();
        student.setName(txtName.getText());
        student.setAge(Integer.parseInt(txtAge.getText()));
        student.setMark(Integer.parseInt(txtMark.getText()));
        Student st = sql.add(student);
        if (st != null) {
            txtName.clear();
            txtAge.clear();
            txtMark.clear();
        }
        data = FXCollections.observableArrayList(sql.getlist());
        listStudent.getItems().clear();
        listStudent.setItems(data);
    }
}
