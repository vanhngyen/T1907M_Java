package BtOnTet.phoneMC.entity;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    private String name;
    private String phoneNumber;

    public Phone() {
    }

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract class phone{

        abstract void insertPhone(String name, String phone);
        abstract void removePhone(String name);
        abstract void updatePhone(String name , String phone);
        abstract void searchPhone(String name);
        abstract void sort();
    }


}
