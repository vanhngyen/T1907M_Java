package session7;

public class session7 {
    public static void main(String[] args) {
        CounterF1 cf1 = new CounterF1();
        cf1.setPriority(8);
        MyThread mt = new MyThread();
        mt.start();
        CounterF2 cf2 = new CounterF2();
        Thread th = new Thread(cf2);
        mt.setPriority(Thread.MAX_PRIORITY);
        th.start();

        int x = 10;
        //lớp ẩn danh
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread tạo từ lớp ẩn danh:"+x);
            }
        };

        new Thread(r1).start();
        //lamda expression
        //nếu có 1 interface mà trong interface này chỉ có 1 hàm ==> functional interface

        Runnable r2 = ()->{
            System.out.println("Thread tạo từ lớp ẩn danh ahihi:"+x);
        };
        new Thread(r2).start();

        for (int i = 0; i<100;i++){
            System.out.println("main - " +i);
            try {
                Thread.sleep(150);
            }catch (Exception e){

            }

        }
        System.out.println("Thread :"+Thread.currentThread().getName());
        System.out.println("Main finish !");
    }
}
