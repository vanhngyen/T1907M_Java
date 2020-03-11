package session7;

public class MyThread extends Thread{
    public void run(){
        Thread.currentThread().setName("myJavaThread");
        System.out.println(Thread.currentThread().getName());
        int j =  2;
        for (int i = 0; i < 10 ; i++){
            System.out.println(j);
            j+=2;
            try {
                Thread.sleep(1500);

            }catch (Exception e){

            }
        }
    }
}
