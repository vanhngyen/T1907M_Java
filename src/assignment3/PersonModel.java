package assignment3;


import java.util.ArrayList;
import java.util.List;

public class PersonModel{

    List<Student> studentList = new ArrayList<>();

    public void add(){
        studentList.add(new Student(1,"vanh",18));
        studentList.add(new Student(2,"yến",18));
    }
    public void display(){
        System.out.println("hiển thị :");
        studentList.forEach(student->
        {
            System.out.println("----------------");
            System.out.println("- ID : " +student.id+"\n- Name : "+student.name+"\n- Age :"+student.age);
        });
    }


    public static void main(String[] args) {
        PersonModel a = new PersonModel();
        a.add();
        a.display();
    }
}
