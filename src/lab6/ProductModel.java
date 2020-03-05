package lab6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductModel {
    Connection connection = MysqlPro.getInstance().getConnection();

    public Product add(Product product) {
        try {
            String query = " INSERT INTO products(name, des, price, amount)VALUES(?, ?, ?, ?)";
            if (connection != null) {
                System.out.println("Connected !");
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, product.getName());
                ps.setString(2, product.getDes());
                ps.setInt(3, product.getPrice());
                ps.setInt(4, product.getAmount());
                ps.execute();
                return product;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public ArrayList<Product> getlist() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM products";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String des = rs.getString("des");
                int price = rs.getInt("price");
                int amount = rs.getInt("amount");
                Product pd = new Product();
                pd.setId(id);
                pd.setName(name);
                pd.setDes(des);
                pd.setPrice(price);
                pd.setAmount(amount);
                list.add(pd);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}
