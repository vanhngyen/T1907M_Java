package lab7;

public class Time extends Thread{

    @Override
    public void run() {
        int minute = 10;
        int second = 59;
        for (int i = minute ;i>0;i--){
            for (int j = second ; j>0;j--) {
                System.out.println(i+":"+j);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        }
    }



    public static void main(String[] args) {
        Time t = new Time();
        t.start();
    }
}
