package session7;

public class CounterF2 implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        //ra chờ xe khác xin đi nhờ
        for (int i = 0;i<100;i++){
            System.out.println("F2 - "+i);
            try {
                Thread.sleep(100);
            }catch (Exception e){

            }

        }
        System.out.println("Thread :"+Thread.currentThread().getName());
        //muốn đổi tên
        Thread.currentThread().setName("Counter F2");
        System.out.println("After change name :"+Thread.currentThread().getName());
        System.out.println("F2 finish !");
    }
}
