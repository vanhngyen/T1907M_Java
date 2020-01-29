package TamGiac;

import java.util.Scanner;

public class TamGiacDeu extends TamGiac{
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
        } while (!checkTamGiacDeu(a, b, c));
        System.out.println("Đây là tam giác đều @@");
    }
    public static boolean checkTamGiacDeu(int a, int b, int c){
        if(a==b && a==c && b==c)return true;
        return false;

    }
}
