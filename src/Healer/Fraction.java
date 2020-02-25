package Healer;

import java.util.Scanner;

public class Fraction {
    public int tu_so;
    public int mau_so;

    public Fraction() {
    }

    public Fraction(int tu_so, int mau_so) {
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }

    public int getTu_so() {
        return tu_so;
    }

    public void setTu_so(int tu_so) {
        this.tu_so = tu_so;
    }

    public int getMau_so() {
        return mau_so;
    }

    public void setMau_so(int mau_so) {
        this.mau_so = mau_so;
    }

    public void inputFraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tử số :");
        setTu_so(scanner.nextInt());
        System.out.println("Nhập mẫu số :");
        int ms = scanner.nextInt();
        setMau_so(ms!=0?ms:1);
//        if(ms!=0){
//            setMau_so(ms);
//
//        }else {
//            setMau_so(1);
//        }

    }

    public void printFraction(){
        System.out.println(getTu_so()+"/"+getMau_so());
    }
    public int ucln(){
        int ts = Math.abs(getTu_so());
        int ms = Math.abs(getMau_so());
        int uslc = 1;
        for (int i = 1; i <= Math.min(ts,ms); i++){
            if(ts%i ==0 && ms%i ==0){
                uslc = i;
            }
        }
        return uslc;
    }
    public void compactFraction(){
        int ucln = ucln();
        setTu_so(getTu_so()/ucln);
        setMau_so(getMau_so()/ucln);
    }

//    public addFraction(){
//
//    }
    public void inverseFraction(){
        if (getTu_so() !=0){
            int tmp = getTu_so();
            setTu_so(getMau_so());
            setMau_so(tmp);
        }else {
            System.out.println("Không thể đảo ngược phân số ");
        }
    }

    public Fraction addFraction(Fraction fr){
        Fraction rs = new Fraction();
        rs.setMau_so(this.getMau_so()*fr.getMau_so());
        rs.setTu_so(this.getTu_so()*fr.getMau_so()+this.getMau_so()*fr.getTu_so());
        return rs;
    }

    public Fraction subFraction(Fraction fr){
        Fraction rs = new Fraction();
        rs.setMau_so(this.getMau_so()*fr.getMau_so());
        rs.setTu_so(this.getTu_so()*fr.getMau_so()-this.getMau_so()*fr.getTu_so());
        return rs;

    }

    public Fraction mulFraction(Fraction fr){
        return fr;
    }
}

