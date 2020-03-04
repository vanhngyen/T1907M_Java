package Lab4;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //java time
        LocalDate lc = LocalDate.now();//ngay hien tai
        //LocalDate lc2 = LocalDate.of(2019,2,29);//lỗi vì k có ngày 29 tháng 2 năm 2019 //tạo ngày bằng năm tháng ngày chính sác
        LocalDate lc3 = LocalDate.of(2020, 2, 29);//tạo ngày bằng năm tháng ngày chính sác
        LocalDate lc5 = lc3.minusYears(1);
        System.out.println("lc5 :" + lc5);
        LocalDate lc4 = LocalDate.parse("2019-04-22");//ra ngày chính sác chuẩn iso yyyy-mm-dd


        LocalDateTime dt = LocalDateTime.now();//ngày h hiện tại
        System.out.println(dt);
        LocalDateTime dt2 = LocalDateTime.of(2020, 1, 30, 12, 30, 45); //ngày h chính sác
        //                                   năm , tháng , ngày , giờ , phút , giây

//        LocalDateTime dt3 = LocalDateTime.parse("2020-02-28 11:16:19:19.689");

        String time = "1986-04-08 12:30:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(time, formatter);

        //vi du kiêm tra 1 năm nào đó có phải năm nhuận hay k
        System.out.println("Nhập năm cần kiểm tra ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        LocalDate kt = LocalDate.of(x, 2, 28);
        LocalDate nextDay = kt.plusDays(1);
        if (nextDay.getDayOfMonth() == 29) {
            System.out.println("năm nhuận");
        }

        //demo convert epoch time
        String time1 = "2020-02-28 12:30:30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(time1);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(calendar.getTimeInMillis());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //MLS hien tai
        System.out.println(Calendar.getInstance().getTimeInMillis());
    }
}
