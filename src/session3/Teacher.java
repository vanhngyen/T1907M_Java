package session3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Teacher {

    public static void main(String[] args) {
        ArrayList<String>  stringArrayList = new ArrayList<>();
        stringArrayList.add("aa");
        stringArrayList.add("nn");
        stringArrayList.add("cc");
        stringArrayList.add("aa");
        System.out.println("In ra Arraylist");
        for (String s: stringArrayList){
            System.out.println(s);
        }
        //System.out.println("Kích thước tập hợp :"+stringArrayList.size());
        stringArrayList.remove(0);
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("aa");
        stringHashSet.add("nn");
        stringHashSet.add("cc");
        System.out.println("In ra Hashset");
        for (String s : stringHashSet){
            System.out.println(s);
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("nguyen van anh");
        priorityQueue.add("mai thuy linh");
        priorityQueue.add("pham thi huyen");
        priorityQueue.add("nguyen thị nhân");
        System.out.println("Ỉn ra priorityqueue");
//        for (String s :priorityQueue){
//            System.out.println(s);
//        }
        System.out.println("lay ra su dung");
            //cach lay ra su dung priority queue
        for (;!priorityQueue.isEmpty();){
            System.out.println(priorityQueue.poll());
            System.out.println("kich thuoc :"+priorityQueue.size());
        }
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("phong_cua_linh","phong 10m2");
        hashMap.put("phong_cua_vanh","phong 12m2");
        hashMap.put("phong_cua_huyen","8m2");
        hashMap.put("phong_cua_nhan","5m2");
        //key - value
        System.out.println("phong cua ban linh :"+hashMap.get("phong_cua_linh"));
        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(0,"xin choa thu 4");
        hashMap1.put(1,"xin chao so 7");
        System.out.println(hashMap1.get(1));
    }

    @Override //viết 2 hàm của cha con giống nhau
    public String toString() {
        return "Hello world";
    }
}
