package Bai1.Phone.controller;

import Bai1.Phone.model.PhoneBook;

import java.util.Scanner;

public class BPController {
    PhoneBook phoneBook = new PhoneBook();
    Scanner sc = new Scanner(System.in);
    String name;
    String phone ;
    String newphone;

    public void addPhone(){
        System.out.println("Thêm liên hệ mới :");
        while (true){
            System.out.println("Nhập họ và tên của bạn :");
            name = sc.nextLine();
            if(name != null && name.length()>=5){
                break;
            }
            System.out.println("Độ dài tối thiểu 5 kí tự !");
        }
        while (true){
            System.out.println("Nhập số điện thoại của bạn :");
            phone = sc.nextLine();
            if(phone != null && phone.length() <=11){
                break;
            }
            System.out.println("Thuê bao không đúng (tối đa 11 số)");
        }
        phoneBook.insertPhone(name,phone);
    }

    public void remove(){
        System.out.println("Xóa liên hệ :");
        while (true){
            System.out.println("Nhập họ và tên của bạn :");
            name = sc.nextLine();
            if (name != null && name.length()>=5){
                break;
            }
            System.out.println("Tên chưa đúng ( tối thiểu 5 kí tự )");
        }
        phoneBook.removePhone(name);
    }

    public void Update(){
        System.out.println("Cập nhật liên hệ :");
        while (true){
            System.out.println("Nhập họ và tên của bạn :");
            name = sc.nextLine();
            if(name != null && name.length() > 5){
                break;
            }
            System.out.println("Tên không đúng ( tối thiểu 5 kí tự )");
        }
        while (true){
            System.out.println("Nhập số điện thoại của bạn :");
            newphone = sc.nextLine();
            if(newphone != null && newphone.length() <11){
                break;
            }
            System.out.println("Số thuê bao tối đa 11 số !");
        }

        phoneBook.updatePhone(name,newphone);
    }

    public void search(){
        System.out.println("Nhập tên bạn muốn tìm :");
        name = sc.nextLine();
        phoneBook.searchPhone(name);
    }
    public void sort(){
        System.out.println("Sắp xếp liên hệ :");
        phoneBook.sort();
    }
    public void showPhone(){
        System.out.println("Hiển thị liên hệ :");
        phoneBook.show();
    }

}
