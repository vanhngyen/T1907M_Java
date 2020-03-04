package assignment5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentSql {
    Connection connection = MySqlServer.getInstance().getConnection();

    public Student add(Student student) {
        try {
            String query = " INSERT INTO students(name,age,mark)VALUES(?,?,?)";
            if (connection != null) {
                System.out.println("Connected");
                PreparedStatement pr = connection.prepareStatement(query);
                pr.setString(1, student.getName());
                pr.setInt(2, student.getAge());
                pr.setInt(3, student.getMark());
                pr.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    public ArrayList<Student> getlist() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM students";
            PreparedStatement pr = connection.prepareStatement(query);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int mark = rs.getInt("mark");
                Student st = new Student();
                st.setId(id);
                st.setName(name);
                st.setAge(age);
                st.setMark(mark);
                list.add(st);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
