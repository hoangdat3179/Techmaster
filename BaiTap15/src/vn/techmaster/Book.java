package vn.techmaster;

import java.util.Arrays;

public class Book extends Libarry {
    private String author;
    private int release_year;
    private int page;
    private String company;
    private int quanlity;

    public Book(int id, String name, String author, int release_year, String[] type, int page, String company, int quanlity) {
        super(id, name, type);
        this.author = author;
        this.release_year = release_year;
        this.page = page;
        this.company = company;
        this.quanlity = quanlity;
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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    @Override
    public String toString() {
        return  super.toString()+ "Tác giả: " + author + " - " +
                "Năm xuất bản: " + release_year + " - " + "Thể loại: " + Arrays.toString(super.getType()) + " - " +
                "Số trang: " + page + " - " +
                "Nhà xuất bản: " + company + " - " +
                "Số lượng: " + quanlity;
    }
}
