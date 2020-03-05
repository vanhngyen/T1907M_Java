package lab6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class CartController implements Initializable {
    @FXML
    private TableView tbCartlist;
    @FXML
    private Button btnToBack;
    Stage stage;
    Parent root;

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
        TableColumn name = new TableColumn("Name");
        TableColumn price = new TableColumn("Price");
        TableColumn amount = new TableColumn("Amount");
        tbCartlist.getColumns().addAll(name, price, amount);

        ObservableList cartlist = FXCollections.observableArrayList(Common.listCart);
        name.setCellValueFactory(new PropertyValueFactory<String, Product>("name"));
        price.setCellValueFactory(new PropertyValueFactory<Integer, Product>("price"));
        amount.setCellValueFactory(new PropertyValueFactory<Integer, Product>("amount"));
        tbCartlist.setItems(cartlist);
    }

    public void addMore(ActionEvent actionEvent) throws IOException {
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getClassLoader().getResource("lab6/listPd.fxml"));
        stage.setTitle("List Product");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }
}
