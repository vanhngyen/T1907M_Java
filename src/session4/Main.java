package session4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Generic generic = new Generic();
        //tu khai bao kieu du lieu
        generic.showMessage("good morning ");
        generic.showMessage(18);
        generic.showMessage(generic);

        Generic<String,Integer> g2 = new Generic<>();
        g2.setPhone(988888888);
        g2.setName("vanh ne");

        Generic<Integer,Double> g3 = new Generic<>();
        g3.setName(123456);
        g3.setPhone(12354.3);

        ArrayList<String> arrayList;
        HashSet<Double> doubles;
        PriorityQueue<String> stringPriorityQueue;
        HashMap<String,Integer> IStringIntegerHashMap;

        ArrayList ar = new ArrayList();
        //up casting -> eps kieu nguoc len
        //down casting -> eps kieur xuoi xuong
        //class B extend A
        //B obj -> casting sang kieu A --> up casting
        //A obj -> casting sang kieu B --> down casting

    }
}
