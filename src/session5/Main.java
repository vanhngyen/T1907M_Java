package session5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int x = 0;
            int y = 10;
            int z = x / y;//z=0
            System.out.println(z);
            //cho nay chua bi loi
            if (x <= 0) throw new Exception("loi mat roi k lam nua"); //chu dong cho crash app
            System.out.println("in nguoc laij xem sao");
            z = y / x;//loi o day
            System.out.println(z);
        } catch (Exception ex) {
            System.out.println("loi mat roiiii");
        } finally {
            System.out.println("luc nao cung chay qa");
        }

        //vaan bien dich ddc vi k sai cu phap
        //khong phai loi ow bien dich maf loi o runtime
        //nhap 2 so tu ban phim -> in ra thuong CUA 2 so do
        try {
            File f = new File("/Users/asus/Desktop/data.txt");
            String st = "";
            if (f.canRead()) {
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                st = dis.readLine();
                System.out.println(st);
                dis.close();
                fis.close();
            }

            if (f.canWrite()) {
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeChars("xin chao day la dong dau tien \n");
                dos.close();
                fos.close();
            }
        } catch (Exception e) {

        }
    }
}
