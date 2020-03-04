package DemoDataBase;
//step 1 : import package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoDataBase {
    public static void main(String[] args) {
        try {
            //step2: khai bao driver
           Class.forName("com.mysql.jdbc.Driver");
            //step3 : tao url db
            String url = "jdbc:mysql://localhost:3306/t1907m?serverTimezone=UTC";
            String username = "root";
            String password = "";
            //step 4: ket noi DB
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Kết nối mysql thành công");
            //Thu truy van lay students
            Statement stm = connection.createStatement();
            String sql_text = "SELECT * FROM students";
            ResultSet rs = stm.executeQuery(sql_text);
            while (rs.next()){
                String line = rs.getInt("id")+"-"+rs.getString("name");
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
