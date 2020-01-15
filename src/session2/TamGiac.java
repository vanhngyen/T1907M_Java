package session2;

import java.util.Scanner;

public class TamGiac {
    protected int canh1;
    protected int canh2;
    protected int canh3;

    public TamGiac(int canh1, int canh2, int canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public TamGiac() {
    }


    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Cạnh thứ nhất:");
        sc.nextInt();
        System.out.println("Nhập Cạnh thứ hai:");
        sc.nextInt();
        System.out.println("Nhập Cạnh thứ ba:");
        sc.nextInt();
    }

    public void dieukien(){
        if(canh1+canh2>canh3 && canh2+canh3>canh1 && canh1 +canh3 >canh2){
            System.out.println("Đây là tam giac");
        }else{
            System.out.println("không phải tam giác");
        }
    }
    public int getChuVi3(){
        int P = 0;
            P = canh1 + canh2 + canh3;
        return P;
    }

    public double getDientich(){
        double S = 0;
        int P = 0;
        int NP = 0;
        P = canh1+canh2+canh3;
        NP = P/2;
        S = Math.sqrt(P*(P - canh1)*(P - canh2)*(P - canh3));
        return S;
    }

    public static void main(String[] args) {
        TamGiac a = new TamGiac();
        a.nhap();
        a.dieukien();


    }
}
