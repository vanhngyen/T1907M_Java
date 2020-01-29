package assignment1;


import java.util.Scanner;

public class Fraction {
    int Tuso;
    int Mauso;

    public Fraction() {

    }

    public Fraction(int tuso, int mauso) {
        Tuso = tuso;
        Mauso = mauso;
    }

    public int getTuso() {
        return Tuso;
    }

    public void setTuso(int tuso) {
        Tuso = tuso;
    }

    public int getMauso() {
        return Mauso;
    }

    public void setMauso(int mauso) {
        Mauso = mauso;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số : ");
        sc.nextInt();
        System.out.println("Nhập mẫu số :");
        sc.nextInt();
    }

}
