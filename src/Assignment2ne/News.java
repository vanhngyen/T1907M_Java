package Assignment2ne;

import java.util.ArrayList;
import java.util.Scanner;


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
            System.out.println("- ID : "+getId());
            System.out.println("- Title : "+getTitle());
            System.out.println("- Publish Date : "+getPublishDate());
            System.out.println("- Author : "+getAuthor());
            System.out.println("- Content : "+getContent());
            System.out.println("- Average Rate : "+getAverageRate());

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a :");
        Ratelist[0] = scanner.nextInt();
        System.out.println("nhập b :");
        Ratelist[1] = scanner.nextInt();
        System.out.println("nhập c :");
        Ratelist[2] = scanner.nextInt();
        int sum = 0;
        float averagerate=0;
        for (int i = 0; i < Ratelist.length; i++) {
            sum += Ratelist[i];
            averagerate = sum/Ratelist.length;
        }
        return AverageRate = averagerate;
    }
}