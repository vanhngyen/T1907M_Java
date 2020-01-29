package TamGiac;

import java.util.Scanner;

public class TamGiacVuong extends TamGiac {
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
        }while (!checkTamGiacVuong(a,b,c));
        System.out.println("Đây là tam giác vuông @@");
        TamGiac tg = new TamGiac(a,b,c);
        System.out.println("Chu Vi :"+tg.getChuvi());
        System.out.println("Diện Tích :"+tg.getDientich());

    }
    public static boolean checkTamGiacVuong(int a, int b, int c){
        if((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a))return true;
        return false;
    }
}
