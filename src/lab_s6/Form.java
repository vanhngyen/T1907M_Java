package lab_s6;

import connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.sql.*;
import java.util.ArrayList;

public class Form {
    public TextField txtName = new TextField();
    public TextArea txtDesc = new TextArea();
    public TextField txtPrice = new TextField();
    public TextField txtQty = new TextField();

    public static ObservableList<Product> listData = FXCollections.observableArrayList();
    public static ArrayList<Product> ls = new ArrayList<>();
    public void submit(){
        try {
            // Step 2
            Class.forName("com.mysql.jdbc.Driver");

            // Step 3:
            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username = "root";// thuong thi luon la root
            String password = ""; // "" neu dung xampp "root" neu dung mamp

            //Step 4
            Connection conn = DriverManager.getConnection(url,username,password);

            String name = txtName.getText();
            String desc = txtDesc.getText();
            Double price = Double.parseDouble(txtPrice.getText());
            Integer qty = Integer.parseInt(txtQty.getText());

            String sql_text = "INSERT INTO products(name,description,price,quantity) VALUES(?,?,?,?)";

            PreparedStatement prStm = conn.prepareStatement(sql_text);
            prStm.setString(1,name);
            prStm.setString(2,desc);
            prStm.setDouble(3,price);
            prStm.setInt(4,qty);
            if(!prStm.execute()){
                Main.productStage.getScene().setRoot(Main.listPage);
                List.reloadData();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}