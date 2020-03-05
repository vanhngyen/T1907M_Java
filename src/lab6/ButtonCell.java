package lab6;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class ButtonCell extends TableCell {
    Button cellButton = new Button("Add to Cart");
    Stage stage;
    Parent root;

    ButtonCell() {
        cellButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Product currentProduct = (Product) ButtonCell.this.getTableView().getItems().get(ButtonCell.this.getIndex());

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText("Bạn có chắc chắn muốn thêm  " + currentProduct.getName() + " ?");
                alert.setContentText("Thêm sản phẩm này .");

                Optional<ButtonType> optional = alert.showAndWait();
                if (optional.get() == null) {

                } else if (optional.get() == ButtonType.OK) {
                    Common.listCart.add(currentProduct);
                    try {
                        root = FXMLLoader.load(getClass().getClassLoader().getResource("lab6/CartList.fxml"));
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setTitle("Cart");
                        stage.setScene(new Scene(root, 600, 400));
                        stage.show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else if (optional.get() == ButtonType.CANCEL) {

                }
            }
        });
    }

    /**
     * The updateItem method should not be called by developers, but it is the
     * best method for developers to override to allow for them to customise the
     * visuals of the cell. To clarify, developers should never call this method
     * in their code (they should leave it up to the UI control, such as the
     * {@link ListView} control) to call this method. However,
     * the purpose of having the updateItem method is so that developers, when
     * specifying custom cell factories (again, like the ListView
     * {@link ListView#cellFactoryProperty() cell factory}),
     * the updateItem method can be overridden to allow for complete customisation
     * of the cell.
     *
     * <p>It is <strong>very important</strong> that subclasses
     * of Cell override the updateItem method properly, as failure to do so will
     * lead to issues such as blank cells or cells with unexpected content
     * appearing within them. Here is an example of how to properly override the
     * updateItem method:
     *
     * <pre>
     * protected void updateItem(T item, boolean empty) {
     *     super.updateItem(item, empty);
     *
     *     if (empty || item == null) {
     *         setText(null);
     *         setGraphic(null);
     *     } else {
     *         setText(item.toString());
     *     }
     * }
     * </pre>
     *
     * <p>Note in this code sample two important points:
     * <ol>
     *     <li>We call the super.updateItem(T, boolean) method. If this is not
     *     done, the item and empty properties are not correctly set, and you are
     *     likely to end up with graphical issues.</li>
     *     <li>We test for the <code>empty</code> condition, and if true, we
     *     set the text and graphic properties to null. If we do not do this,
     *     it is almost guaranteed that end users will see graphical artifacts
     *     in cells unexpectedly.</li>
     * </ol>
     *
     * @param item  The new item for the cell.
     * @param empty whether or not this cell represents data from the list. If it
     *              is empty, then it does not represent any domain data, but is a cell
     *              being used to render an "empty" row.
     * @expert
     */
    @Override
    protected void updateItem(Object item, boolean empty) {
        super.updateItem(item, empty);
        if (!empty) {
            setGraphic(cellButton);
        }
    }
}
