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
        System.out.println("hiển thị sinh viên :");
        studentList.forEach(student->
        {
            System.out.println("----------------");
            System.out.println("- ID : " +student.id+"\n- Name : "+student.name+"\n- Age :"+student.age);
        });
    }


    List<Employee> employeeList = new ArrayList<>();

    public void addE(){
        employeeList.add(new Employee(1,"Vanh Nguyen",100000000));
        employeeList.add(new Employee(1,"Hoang Yen",100000000));
    }
    public void displayE(){
        System.out.println("hiển thị nhân viên :");
        employeeList.forEach(employee->
        {
            System.out.println("----------------");
            System.out.println("- ID : " +employee.id+"\n- Name : "+employee.name+"\n- Salary :"+employee.salary);
        });
    }
    public static void main(String[] args) {
        PersonModel a = new PersonModel();
        a.add();
        a.display();
        a.addE();
        a.displayE();
    }
}
