package Assignment2ne;

import java.util.ArrayList;


public class News implements INews {
    public int id;
    public String Title; //tên sách
    public String PublishDate; //ngày xuất bản
    public String Author; //tác giả
    public String Content; //nội dung
    public Float AverageRate; //tỉ lệ trung bình

    public News() {

    }

    public News(int id, String title, String publishDate, String author, String content, Float averageRate) {
        this.id = id;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Float getAverageRate() {
        return AverageRate;
    }

    ArrayList<News> news = new ArrayList<>();

    @Override
    public void Display() {
        for (News news : news) {
            System.out.println(news.getId());
            System.out.println(news.getTitle());
            System.out.println(news.getPublishDate());
            System.out.println(news.getAuthor());
            System.out.println(news.getContent());
            System.out.println(news.getAverageRate());

        }
    }

    int[] Ratelist = new int[3];

    public int[] getRatelist() {
        return Ratelist;
    }

    public void setRatelist(int a, int b, int c) {
        Ratelist[0] = a;
        Ratelist[1] = b;
        Ratelist[2] = c;
    }

    public float Calculate() {
        int sum = 0;
        for (int i = 0; i < Ratelist.length; i++) {
            sum += Ratelist[i];
        }
        return sum / (Ratelist.length);
    }
}