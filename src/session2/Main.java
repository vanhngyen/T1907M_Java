package session2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập Cạnh thứ nhất:");
            a=sc.nextInt();
            System.out.println("Nhập Cạnh thứ hai:");
            b=sc.nextInt();
            System.out.println("Nhập Cạnh thứ ba:");
            c=sc.nextInt();
        }while (!checkTamGiac(a,b,c));
        TamGiac2 tg = new TamGiac2(a,b,c);
        System.out.println("Chu Vi :"+tg.getChuvi());
        System.out.println("Diện Tích :"+tg.getDientich());
    }
    public static boolean checkTamGiac(int a, int b, int c){
        if(a+b >c && a+c >b && b+c >a)return true;
        return false;

    }
}
