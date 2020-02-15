package BtOnTet.phoneMC.controller;

import BtOnTet.phoneMC.model.PhoneBook;

import java.util.Scanner;

public class PhonebookController {
    PhoneBook phBook = new PhoneBook();
    Scanner sc = new Scanner(System.in);
    String name;
    String phone;

    public void addPhone(){
        System.out.println("Thêm liên hệ mới :");
        while (true){
            System.out.println("Nhập họ và tên của bạn :");
            name = sc.nextLine();
            if(name != null && name.length()>=5){
                break;
            }
            System.out.println("Vui lòng nhập cả họ và tên (độ dài tối thiểu 5 kí tự ):");

        }

        while (true){
            System.out.println("Nhập số điện thoại của bạn :");
            phone = sc.nextLine();
            if(phone != null && phone.length() >=8){
                break;
            }
            System.out.println("Vui lòng nhập đúng đủ số điện thoại của bạn(tối thiểu 8 số):");
        }
        phBook.insertPhone(name,phone);
    }

    public void remove(){
        System.out.println("Xóa liên hệ :");
        while (true){
            System.out.println("Nhập họ và tên của bạn :");
            name = sc.nextLine();
            if(name != null && name.length() >=5){
                break;
            }
            System.out.println("Vui lòng nhập đủ họ và tên của bạn :");
        }
        phBook.removePhone(name);
    }


    public void update(){
        System.out.println("Cập nhật liên hệ :");
        while (true){
            System.out.println("Nhập họ và tên của bạn :");
            name = sc.nextLine();
            if (name != null && name.length() >5){
                break;
            }
            System.out.println("Vui lòng nhập đủ họ và tên của bạn :");
        }

        while (true){
            System.out.println("Nhập số điện thoại của bạn :");
            phone = sc.nextLine();
            if(phone != null && phone.length() >8){
                break;
            }
            System.out.println("Vui lòng nhập đúng đủ số điện thoại của bạn( tối thiểu 8 số ) :");
        }
        phBook.updatePhone(name,phone);
    }

    public void search(){
        System.out.println("Nhập tên của bạn :");
        name = sc.nextLine();
        phBook.searchPhone(name);
    }

    public void sortPhone(){
        System.out.println("Sắp xếp liên hệ :");
        phBook.sort();
    }
}
