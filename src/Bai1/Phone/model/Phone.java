package Bai1.Phone.model;

public abstract class Phone {
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String newPhone);
    abstract void searchPhone(String name);
    abstract void sort();
}
