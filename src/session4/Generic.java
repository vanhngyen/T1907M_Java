package session4;

public class Generic <K,V>{
    public K name;
    public V phone;
    public K getName(){
        return name;
    }

    public V getPhone(){
        return phone;
    }

    public void setName(K name){
        this.name = name;
    }

    public void setPhone(V phone){
        this.phone = phone;
    }
    //an gia tri khi viet code
    public <E> void showMessage(E msg){
        System.out.println(msg);
    }

}
