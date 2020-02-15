package BtOnTet.phoneMC.model;

import BtOnTet.phoneMC.entity.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook extends Phone {
    List<Phone> phL = new ArrayList<>();

    public void insertPhone (String name , String phone) {
        try{
            if (phL.size()==0){
                phL.add(new Phone(name,phone));
                System.out.println("Save success !");
            }else{
                for(Phone entry:phL){
                    if (!entry.getName().equals(name)){
                        Phone entry1 = new Phone(name,phone);
                        phL.add(entry1);
                        System.out.println("Save success !");
                    }else{
                        if (entry.getPhoneNumber().equals(phone)){
                            System.out.println("Tên và số điện thoại này đã tồn tại !!");
                        }else{
                            Phone newEntry = new Phone();
                            newEntry.setName(entry.getName());
                            newEntry.setPhone(entry.getPhoneNumber()+":"+phone);
                            //phL.remove(entry);
                            //phL.add(newEntry);
//                    int index = phL.indexOf(entry);
//                    phL.set(index,newEntry); =>
                            phL.set(phL.indexOf(entry),newEntry);
                            System.out.println("Save success");
                        }
                    }
                }
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void removePhone(String name){
        try{
            for (Phone entry :phL){
                if (entry.getName().equals(name)) {
                    phL.remove(entry);
                    System.out.println("Remove Success !");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void updatePhone(String name ,String newphone){
        try{
            for (Phone entry : phL){
                if (entry.getName().equals(name)){
                    Phone newEntry = new Phone();
                    newEntry.setName(entry.getName());
                    newEntry.setPhone(newphone);
                    phL.set(phL.indexOf(entry),newEntry);
                    System.out.println("Update success !");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void searchPhone(String name){
        try {
            for (Phone entry : phL){
                if(entry.getName().equals(name)){
                    System.out.println(entry.getName()+" - "+entry.getPhoneNumber());
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void sort() {
        //    phL.sort(new Comparator<Phone>() {
//        @Override
//        public int compare(Phone o1, Phone o2) {
//            return o1.getName().compareToIgnoreCase(o2.getName());
//        }
//    });
        try {
            phL.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
            for (Phone entry : phL) {
                System.out.println(entry.getName() + " - " + entry.getPhoneNumber());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
