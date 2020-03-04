package assignment5;

public class Student {
    private int id;
    private String name;
    private int age;
    private int mark;

    public Student(int id, String name, int age, int mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
