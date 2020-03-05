package lab6;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListPd implements Initializable {
    @FXML
    private TableView tbListPd;
    int index;
    Stage stage;
    Parent root;
    ProductModel model = new ProductModel();

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
        TableColumn des = new TableColumn("Des");
        TableColumn price = new TableColumn("Price");
        TableColumn amount = new TableColumn("Amount");
        TableColumn action = new TableColumn("Action");
        tbListPd.getColumns().addAll(id, name, des, price, amount, action);

        ObservableList<Product> data = FXCollections.observableArrayList(model.getlist());
        id.setCellValueFactory(new PropertyValueFactory<Integer, Product>("id"));
        name.setCellValueFactory(new PropertyValueFactory<String, Product>("name"));
        des.setCellValueFactory(new PropertyValueFactory<String, Product>("des"));
        price.setCellValueFactory(new PropertyValueFactory<Integer, Product>("price"));
        amount.setCellValueFactory(new PropertyValueFactory<Integer, Product>("amount"));
        action.setCellValueFactory(new Callback<TableColumn.CellDataFeatures, ObservableValue>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                return new SimpleBooleanProperty(param.getValue() != null);
            }
        });
        action.setCellFactory(new Callback<TableColumn, TableCell>() {

            @Override
            public TableCell call(TableColumn param) {
                return new ButtonCell();
            }
        });

        tbListPd.setItems(data);
    }

    public void backtoProduct(ActionEvent actionEvent) throws IOException {
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getClassLoader().getResource("lab6/product.fxml"));
        stage.setTitle("List Product");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }
}
