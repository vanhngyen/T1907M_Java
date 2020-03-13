package examadf2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBooks{
    ArrayList<Contact> list = new ArrayList<>();


    public void addcontact(Contact contact){
        list.add(contact);
    }
    public void displaycontact(){
        System.out.println("thông tin :");
        for(Contact c : list){
            System.out.println(c.toString());
        };
    }

    public boolean findContact(String contactName){
        for(int i=0;i<list.size();i++){
            Contact contact = list.get(i);
            if(contact.getName().equals(contactName)){
                System.out.println("Name: "+contact.getName()+"\nCompany:"+contact.getCompany()+"\nEmail: "+contact.getName()+"\nPhone:"+contact.getPhone());
                return true;
            }
        }
        System.out.println("Không tìm thấy liên lạc !");
        return false;
    }


    public static void main(String[] args) {
        AddressBooks a = new AddressBooks();
        int pess;
        String name;
        String phone;
        String company;
        String email;
        do{

            Scanner sc = new Scanner(System.in);
            System.out.println("Bắt Đầu Chương Trình");
            System.out.println("1. Nhập Thông tin ");
            System.out.println("2. Tìm kiếm liên lạc");
            System.out.println("3. Hiển thị liên lạc ");
            System.out.println("4. kết thúc .");
            System.out.println("--------------------");
            System.out.println("nhập số :");
            System.out.println("");
            pess = sc.nextInt();
            switch (pess) {
                case 1:
                    System.out.println("Nhập tên của bạn :");
                    name = sc.next();
                    System.out.println("Nhập tên công ty :");
                    company = sc.next();
                    System.out.println("Nhập địa chỉ Email :");
                    email = sc.next();
                    System.out.println("Nhập số điện thoại :");
                    phone = sc.next();
                    a.addcontact(new Contact(name,company,email,phone));
                    break;
                case 2:
                    String nameFind;
                    System.out.println("Tìm kiếm tên liên lạc : ");
                    nameFind = sc.next();
                    a.findContact(nameFind);
                    break;
                case 3:
                    a.displaycontact();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có nè vui lòng chọn lại nhé , yêu thương <3");
                    System.out.println("----- ----- ----- -----\n\n");
            }
        }while(pess!=0);
    }
}
