package session1_demo;

import session1.Car;

public class Toyota extends Car {
    protected int price;

    public Toyota(int year, String typeCar, String brand,int price) {
        super(year, typeCar, brand);
//        this.year = year;
//        this.typeCar = typeCar;
//        this.brand = brand;
        this.price = price;
    }

    public void showInfo(){
        super.getInfo();//suoer là đối tượng của lớp cha bên trong lớp con
        this.setYear(1997);
        System.out.println("year :"+ year);
        //System.out.println("Year :"+typeCar);
    }
}
