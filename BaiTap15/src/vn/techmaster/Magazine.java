package vn.techmaster;

import java.time.LocalDate;
import java.util.Arrays;

public class Magazine extends Libarry {
    private String newspaperOffice;
    private LocalDate release_day;
    private int page;
    private int quanlity;

    public Magazine(int id, String name,String newspaperOffice, LocalDate release_day, String [] type, int page, int quanlity) {
        super(id, name, type);
        this.newspaperOffice = newspaperOffice;
        this.release_day = release_day;
        this.page = page;
        this.quanlity = quanlity;
    }

    public String getNewspaperOffice() {
        return newspaperOffice;
    }

    public void setNewspaperOffice(String newspaperOffice) {
        this.newspaperOffice = newspaperOffice;
    }

    public LocalDate getRelease_day() {
        return release_day;
    }

    public void setRelease_day(LocalDate release_day) {
        this.release_day = release_day;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Tòa soạn: " + newspaperOffice + " - " +
                "Ngày xuất bản: " + release_day + " - " + "Thể loại: " + Arrays.toString(super.getType()) + " - " +
                "Số trang: " + page + " - " +
                "Số lượng: " + quanlity;
    }
}
