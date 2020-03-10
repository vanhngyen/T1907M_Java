package assignment8;

import connector.Connector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDataAccessObject implements DataAccessObjectConcreate<Student> {
    private static StudentDataAccessObject instance;

    private StudentDataAccessObject() {

    }

    public static StudentDataAccessObject getInstance() {
        if (instance == null) {
            instance = new StudentDataAccessObject();
            return instance;
        }
        return null;
    }

    @Override
    public ArrayList<Student> list() {
        try {
            Connector connector = Connector.getInstance();
            ResultSet rs = connector.getQuery("SELECT * FROM students");
            ArrayList<Student> ls = new ArrayList<>();
            while (rs.next()) {
                ls.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark")));
            }
            return ls;
        } catch (Exception ex) {

        }
        return null;
    }

    public Student getOne(int id) {
        try {
            Connector connector = Connector.getInstance();
            ResultSet rs = connector.getQuery("SELECT * FROM students WHERE id =" + id);
            while (rs.next()) {
                return new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean create(Student student) {
        try {
            Connector connector = Connector.getInstance();
            String sql_text = "INSERT INTO students(name, age, mark )VALUES('" + student.getName() + "','" + student.getAge() + "','" + student.getMark() + "')";
            return connector.excuteUpdate(sql_text);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Student student) {
        try {
            Connector connector = Connector.getInstance();
            String sql_text = "UPDATE students SET name = " + student.getName() + "age =" + student.getAge() + "mark = " + student.getMark() + "WHERE id =" + student.getId();
            return connector.excuteUpdate(sql_text);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Student student) {
        try {
            Connector connector = Connector.getInstance();
            String sql_text = "DELETE FROM students WHERE id = " + student.getId();
            return connector.excuteUpdate(sql_text);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
