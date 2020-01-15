package session1;

public class Human {
    public int age = 10;

    public Human(){
        System.out.println("vừa tạo 1 object human");
    }
    public Human(String msg){
        System.out.println(msg);
    }
    public Human (int x){
        age = x;
        System.out.println("vừa xét age");
    }
    public Human(int x, String y){

    }
    public Human(String x,int y){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo(){
        System.out.println("Age :"+age);
    }
}
