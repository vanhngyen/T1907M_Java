package assignment1;

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.nhap();
        a.Inphanso();
        a.rutgon();
        a.NghichDao();
        System.out.println("Tổng :"+a.add());
        System.out.println("Hiệu :"+a.sub());
        System.out.println("Tích :"+a.mul());
        System.out.println("Thương"+a.div());

    }

}
