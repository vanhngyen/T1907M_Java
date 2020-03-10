package assignment8;

import connector.Connector;
import javafx.scene.control.TextField;
import jdk.nashorn.internal.ir.Assignment;
import lab_s6.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();


    public void submitStudent() throws Exception{
//        String name;
//        Integer age;
//        Integer mark;
//        try{
//            name = txtName.getText();
//            age = Integer.parseInt(txtAge.getText());
//            mark = Integer.parseInt(txtMark.getText());
//        }catch (Exception e){
////            age = 18;
////            mark=0;
//            // hoac la thong bao loi de dung chuong trinh
//            throw new Exception("Loi mat roi"); // Crash app
//        }
//
//        Student s = new Student(name,age,mark);
//        Main.students.add(s);
//
//        // Show ra danh sach
//        Main.students.stream().forEach(e->{
//            System.out.println(e.getName()+"-"+e.getAge()+"-"+e.getMark());
//        });
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
            Integer age = Integer.parseInt(txtAge.getText());
            Integer mark = Integer.parseInt(txtMark.getText());

            String sql_text = "INSERT INTO students(name,age,mark) VALUES(?,?,?)";

            PreparedStatement prStm = conn.prepareStatement(sql_text);
            prStm.setString(1,name);
            prStm.setInt(2,age);
            prStm.setInt(3,mark);
            if(!prStm.execute()){
                Main.stageStudent.getScene().setRoot(assignment8.Main.listPagestudent);
                Liststudent.reloadData();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
