package session1;

public class Car {
    protected int year = 2015;
    protected String typeCar = "AutoCar";
    protected String brand = "auto";

    public Car(int year, String typeCar, String brand) {
        this.year = year;
        this.typeCar = typeCar;
        this.brand = brand;
    }
    public Car(){

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getInfo(){
        System.out.println("Brand :"+brand);
    }
}
