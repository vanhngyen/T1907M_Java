package Assignment5Chua;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class From {
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtAge;
    @FXML
    public TextField txtMark;

    public void submitStudent() throws Exception {
        try {
            //step2: khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            //step3 : tao url db
            String url = "jdbc:mysql://localhost:3306/t1907m?serverTimezone=UTC";
            String username = "root";
            String password = "";
            //step 4: ket noi DB
            Connection connection = DriverManager.getConnection(url, username, password);

            String name = txtName.getText();
            Integer age = Integer.parseInt(txtAge.getText());
            Integer mark = Integer.parseInt(txtMark.getText());

//            Student s = new Student(name, age, mark);
//            String sql_text = "INSERT INTO students(name,age,mark) VALUES(" + name + "," + age + "," + mark + ")";
            String query = "INSERT INTO students(name, age, mark) VALUES ('" + name + "', " + age + ", " + mark + ")";

            Statement stn = connection.createStatement();
//            String query = "INSERT INTO  students(name, age, mark) VALUES(?,?,?)";
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, name);
//            statement.setInt(2, age);
//            statement.setInt(3, mark);
//            int row_number = statement.executeUpdate();
            int row_number = stn.executeUpdate(query);//tra về số row dữ liệu bị ảnh hưởng
            if (row_number > 0) {
                Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
                Main.mainstage.getScene().setRoot(list);
            } else {
                //tthoong báo rì đó --> validation
            }
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }
    }
}
