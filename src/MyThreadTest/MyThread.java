package MyThreadTest;

public class MyThread extends Thread{
    public void run() {
        int number = 2;
        while (number <= 20) {
            System.out.println(number);
            number += 2;
        }
    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Thread :"+Thread.currentThread().getName());
        for (int i = 0;i<100;i++){
            System.out.println("my thread - "+i);
            try {
                Thread.sleep(1500);
            }catch (Exception e){

            }
        }
        //doi ten
        Thread.currentThread().setName("MyJavaThread");
        System.out.println("After change name :"+Thread.currentThread().getName());
    }
}
