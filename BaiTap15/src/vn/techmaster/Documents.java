package vn.techmaster;

import java.time.LocalDate;
import java.util.Arrays;

public class Documents extends Libarry {
    private String author;
    private int release_year;
    private LocalDate uploadDay;
    private double capacity;
    private int download;

    public Documents(int id, String name, String author, int release_year, LocalDate uploadDay, String[] type, double capacity, int download) {
        super(id, name, type);
        this.author = author;
        this.release_year = release_year;
        this.uploadDay = uploadDay;
        this.capacity = capacity;
        this.download = download;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public LocalDate getUploadDay() {
        return uploadDay;
    }

    public void setUploadDay(LocalDate uploadDay) {
        this.uploadDay = uploadDay;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Tên tác giả: " + author + " - " +
                "Năm xuất bản: " + release_year + " - " +
                "Ngày upload: " + uploadDay + " - " + "Thể loại: " + Arrays.toString(super.getType()) + " - " +
                "Dung lượng: " + capacity + " - " +
                "Lượt tải: " + download;
    }
}
