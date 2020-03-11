package lab7;

public class Happy extends Thread{
    @Override
    public void run() {
        int count = 10;
        for (int i = count; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Chúc mừng năm mới !");
    }

    public static void main(String[] args) {
        Happy h = new Happy();
        h.start();
    }
}
