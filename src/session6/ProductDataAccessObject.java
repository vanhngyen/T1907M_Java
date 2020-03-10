package session6;

import connector.Connector;
import lab_s6.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDataAccessObject implements DataAccessObjectConcreate<Product> {
    private static ProductDataAccessObject instance;

    private ProductDataAccessObject() {

    }

    public static ProductDataAccessObject getInstance() {
        if (instance == null) {
            instance = new ProductDataAccessObject();
            return instance;
        }
        return null;
    }

    @Override
    public ArrayList<Product> list() {
        try {
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM products");
            ArrayList<Product> ls = new ArrayList<>();
            while (rs.next()) {
                ls.add(new Product(rs.getInt("id"), rs.getString("name"),
                        rs.getString("description"), rs.getDouble("price")
                        , rs.getInt("quantity")));
            }
            return ls;
        } catch (Exception e) {
        }
        return null;
    }

    public Product getOne(int id) {
        try {
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM products WHERE id = " + id);
            while (rs.next()) {
                return new Product(rs.getInt("id"), rs.getString("name"),
                        rs.getString("description"), rs.getDouble("price"),
                        rs.getInt("quantity"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public boolean create(Product product) {
        try {
            Connector conn = Connector.getInstance();
            String sql_text = "INSERT INTO products(name, description , price , quantity)VALUES('" + product.getName() + "','" + product.getDescription() + "','" + product.getPrice() + "','" + product.getQuantity() + "')";
            return conn.excuteUpdate(sql_text);
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean update(Product product) {
        try {
            Connector conn = Connector.getInstance();
            String sql_text = "UPDATE products SET name = " + product.getName() + "description = " + product.getDescription() + "quantity = " + product.getQuantity() + "quantity = " + product.getQuantity() + "WHERE id =" + product.getId();
            return conn.excuteUpdate(sql_text);
        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public boolean delete(Product product) {
        try{
            Connector conn = Connector.getInstance();
            String sql_text = "DELETE FROM products WHERE id="+product.getId();
            return conn.excuteUpdate(sql_text);
        }catch (Exception e){
        }
        return false;
    }
}
