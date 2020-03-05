package lab6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class From implements Initializable {
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtDes;
    @FXML
    private TextField txtPrice;
    @FXML
    private TextField txtAmount;
    @FXML
    private Button btnSubmit;

    private Stage stage;
    private Parent root;
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
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("lab6/listPd.fxml"));
            root.prefHeight(700);
            root.prefWidth(900);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addProduct(javafx.event.ActionEvent actionEvent) throws IOException {
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("lab6/product.fxml"));
            root.prefHeight(700);
            root.prefWidth(900);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DisplayProduct(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("lab6/listPd.fxml"));
            root.prefHeight(700);
            root.prefWidth(900);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void submitProduct(ActionEvent actionEvent) {
        Product pd = new Product();
        pd.setName(txtName.getText());
        pd.setDes(txtDes.getText());
        pd.setPrice(Integer.parseInt(txtPrice.getText()));
        pd.setAmount(Integer.parseInt(txtAmount.getText()));
        model.add(pd);

        try {
            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            root = FXMLLoader.load(getClass().getClassLoader().getResource("lab6/listPd.fxml"));
            stage.setTitle("List Product");
            stage.setScene(new Scene(root, 600, 400));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
