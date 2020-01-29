package session2;

import java.util.Scanner;

public class TamGiacCan extends TamGiac2{
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập Cạnh thứ nhất:");
            a = sc.nextInt();
            System.out.println("Nhập Cạnh thứ hai:");
            b = sc.nextInt();
            System.out.println("Nhập Cạnh thứ ba:");
            c = sc.nextInt();
        } while (!checkTamGiaccan(a, b, c));
        System.out.println("Đây là tam giác cân @@");
    }
        public static boolean checkTamGiaccan(int a, int b, int c){
            if(a==c || a==b || b==c)return true;
            return false;

        }
}
