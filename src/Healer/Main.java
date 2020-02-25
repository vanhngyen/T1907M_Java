package Healer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] int_arr = {1,3,5,7,9,11};
        Fraction[] fractions = new Fraction[10];
        Fraction fr1 = new Fraction();
        ArrayList arr = new ArrayList();
        arr.add(fr1);
        arr.add(1);
        arr.add("hello");
        System.out.println("kich thuoc tap hop :"+arr.size());

        ArrayList<Fraction> frArr = new ArrayList<>();
        frArr.add(fr1);
        frArr.remove(fr1);


    }
}
