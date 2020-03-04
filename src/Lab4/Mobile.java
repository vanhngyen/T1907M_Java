package Lab4;

import java.time.LocalDate;

public class Mobile <S,T,N>{
    private S hangsanxuat;
    private T serimay;
    private N namsanxuat;

    public Mobile() {
    }

    public Mobile(S hangsanxuat, T serimay, N namsanxuat) {
        this.hangsanxuat = hangsanxuat;
        this.serimay = serimay;
        this.namsanxuat = namsanxuat;
    }

    public S getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(S hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public T getSerimay() {
        return serimay;
    }

    public void setSerimay(T serimay) {
        this.serimay = serimay;
    }

    public N getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(N namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    //Warranty
    public boolean checkGuarantee(){
        LocalDate madeYear = LocalDate.of((Integer)hangsanxuat, 1,1);//tao ra 1 object cua localdate lay ngay trong
        LocalDate now = LocalDate.now();
        if ((Integer) hangsanxuat < now.getYear()-5){
            return false;
        }
        return true;
    }
}
