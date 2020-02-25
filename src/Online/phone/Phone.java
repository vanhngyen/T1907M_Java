package Online.phone;

public abstract class Phone {
    public abstract void insertPhone(String name, String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newPhone);
    public abstract PhoneNumber searchPhone(String name);
    public abstract void sort();
}
