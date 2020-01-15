package session1;

public class Main {
    public static void main(String[] args) {
        Human h = new Human(15);
        System.out.println("Tuổi :"+h.age);
        h.getInfo();

        Car c = new Car();
        System.out.println("Năm :"+c.year);
        c.setYear(1977);
        //System.out.println("Brand :"+ brand);
    }
}
