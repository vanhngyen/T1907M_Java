package Bai1.Phone.model;

import Bai1.Phone.entity.BPInfo;

import java.util.*;

public class PhoneBook extends Phone {
    List<BPInfo> phoneList = new ArrayList<>(); //tạo arraylist


    @Override
    public void insertPhone(String name, String phone) {
        BPInfo bpInfo = null;

        if(phoneList.size() == 0 || phoneList.isEmpty()){
            System.out.println("Bạn vừa thêm thông tin thuê bao .");
            bpInfo = new BPInfo(name,phone);
            phoneList.add(bpInfo);
        }else{
            for (int i=0;i<phoneList.size();i++){
                bpInfo = phoneList.get(i);
                if(bpInfo.getName().equals(name)){
                    int index = phoneList.indexOf(bpInfo);
                    if(bpInfo.getPhoneNumber().equals(phone)){
                        System.out.println("Tên và số điện thoại của bạn đã tồn tại !");
                    }else{
                        BPInfo newInfo = new BPInfo();
                        newInfo.setName(phoneList.get(i).getName());
                        newInfo.setPhoneNumber(phoneList.get(i).getPhoneNumber()+":"+phone);
                        phoneList.set(index,newInfo);
                        break;
                    }
                }else{
                    System.out.println("Bạn vừa thêm thông tin thuê bao .");
                    bpInfo = new BPInfo(name,phone);
                    phoneList.add(bpInfo);
                }
            }
        }

    }

    @Override
    public void removePhone(String name) {
        for (int i = 0; i < phoneList.size(); i++) {
            BPInfo bp1 = phoneList.get(i);
            if (bp1.getName().equals(name)) {
                phoneList.remove(i);
                System.out.println("Contact : " + bp1.getName() + "\nXóa thành công !");
            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (int i = 0; i < phoneList.size(); i++) {
            BPInfo bp2 = phoneList.get(i);
            if (bp2.getName().equals(name)) {
                bp2.setPhoneNumber(newPhone);
                System.out.println("Contact :" + bp2.getPhoneNumber() + "\nUpdate thành công !");
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (int i = 0; i < phoneList.size(); i++) {
            BPInfo bp3 = phoneList.get(i);
            if (bp3.getName().equals(name)) {
                System.out.println("Kết quả của bạn : \n" + name);
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<BPInfo>() {
            @Override
            public int compare(BPInfo o1, BPInfo o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void show() {
        for (int i = 0; i < phoneList.size(); i++) {
            BPInfo bp4 = phoneList.get(i);
            System.out.println(" - Tên thuê bao :" + bp4.getName() + " | Số thuê bao :" + bp4.getPhoneNumber());
            System.out.println("");
        }
    }

}
