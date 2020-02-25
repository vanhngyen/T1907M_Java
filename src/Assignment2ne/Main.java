package Assignment2ne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        News news = new News();
        news.setId(1);
        news.setTitle("Măc kệ thiên hạ ");
        news.setPublishDate("03/03/2017");
        news.setAuthor("Mari Tamagawa");
        news.setContent("Khi mùa đông lạnh lẽo vừa đi qua , mùa xuân ấm áp sẽ đến . Giây phút chấp nhận từ bỏ và gạt đi định kiến \ncủa người khác sống bằng chính kiến của bản thân sẽ là thời điểm bạn thấy tâm hồn mình thanh thản .");
        news.Calculate();
        news.getAverageRate();
        news.Display();
    }
}
