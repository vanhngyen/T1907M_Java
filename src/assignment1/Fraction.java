package assignment1;


import Assignment5Chua.Student;

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
        Tuso = sc.nextInt();
        System.out.println("Nhập mẫu số :");
        Mauso = sc.nextInt();
    }

    public void Inphanso(){
        System.out.println("Phân số :"+Tuso+"/"+Mauso);
    }
    public int TimUCLN(int Tuso , int Mauso){
        if (Tuso % Mauso != 0) {
            return TimUCLN(Mauso, Tuso % Mauso);

        } else {
            return Mauso;
        }
    }
    public void rutgon(){
        int i = TimUCLN(Tuso,Mauso);
        Tuso = Tuso/i;
        Mauso = Mauso/i;
        if(Mauso != 1) {
            System.out.println("Phân số rút gọn : " + Tuso + "/" + Mauso);
        }else {
            System.out.println("Phan so rut gon :" +Tuso);
        }
    }
    public void NghichDao(){
        System.out.println("Nghịch đảo :" +Mauso+"/"+Tuso);
    }
    public int add() {
        return Tuso + Mauso;
    }

    public int sub() {
        return Tuso - Mauso;
    }

    public int mul() {
        return Tuso * Mauso;
    }

    public double div() {
        return (double) (Tuso / Mauso);
    }
}
