package connector;

import java.sql.*;

public class Connector { //ket noi db và truy vấn - trong java có trình dọn rác
    private String url = "jdbc:mysql://localhost:3306/t1907m";
    private String username = "root";// thuong thi luon la root
    private String password = ""; // "" neu dung xampp "root" neu dung mamp

    private Statement stm;

    private static Connector con;//sẽ k liên qan đến đối tượng khi sinh ra

    private Connector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            stm = conn.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connector getInstance() {
        // hàm sẽ trả về đối tượng connector nếu biến conn ở trên là null thì sẽ tạo đối tượng
        if (con == null) {
            con = new Connector();
            // đối tượng sẽ chỉ được tạo 1 lần thì kể cả class khác có gọi lại hoặc trong class đó thì cũng sẽ chỉ là 1 đối tượng được tạo ra
        }
        return con;
    }

    // tạo ra hàm chung để excuteQuerry
    public ResultSet getQuery(String sql) throws Exception {
        return stm.executeQuery(sql);
    }

    public Boolean excuteUpdate(String sql) throws Exception {
        if (stm.executeUpdate(sql) > 0) {
            return true;
        }
        return false;
    }

}