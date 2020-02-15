package Bai1.Phone.view;

import Bai1.Phone.controller.BPController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        BPController controller = new BPController();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Hệ thống quản lý điện thoại !");
            System.out.println("1. Insert Phone ");
            System.out.println("2. Remove Phone ");
            System.out.println("3. Update Phone ");
            System.out.println("4. Search Phone ");
            System.out.println("5. Sort Phone");
            System.out.println("6. Exit ");
            System.out.println("Chọn dịch vụ :");
            switch (sc.nextInt()){
                case 1:
                    controller.addPhone();
                    controller.showPhone();
                    break;
                case 2:
                    controller.remove();
                    controller.showPhone();
                    break;
                case 3:
                    controller.Update();
                    controller.showPhone();
                    break;
                case 4:
                    controller.search();

                    break;
                case 5:
                    controller.sort();
                    controller.showPhone();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có dịch vụ này .");
                    break;
            }
        }
    }
}
