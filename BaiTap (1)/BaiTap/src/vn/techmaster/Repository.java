package vn.techmaster;

import java.time.LocalDate;
import java.util.ArrayList;

public class Repository {
    public  ArrayList<Book> getBooks() {
        ArrayList<Book> listBook = new ArrayList<>();
        listBook.add(new Book(1, "A", "AA", 2021, new String[]{"Khoa Học", "Viễn Tưởng"}, 1000, "AAA", 5000));
        listBook.add(new Book(2, "B", "BB", 2019, new String[]{"Vật Lý","Khoa Học"}, 1000, "BBB", 5000));
        listBook.add(new Book(3, "C", "CC", 2018, new String[]{"Văn Học","Tiểu Thuyết"}, 1500, "CCC", 2000));
        listBook.add(new Book(4, "D", "DD", 2018, new String[]{"Toán","Đại Số"}, 600, "DDD", 4000));
        listBook.add(new Book(5, "E", "EE", 2018, new String[]{"Địa Lý","Lịch Sử"}, 780, "EEE", 3000));
        return listBook;
    }

    public  ArrayList<Magazine> getMagazine() {
        ArrayList<Magazine> listMagazine = new ArrayList<>();
        listMagazine.add(new Magazine(11, "A1", "AA1", LocalDate.of(2021, 10, 15), new String[]{"Báo Khoa Học"}, 1000, 5000));
        listMagazine.add(new Magazine(22, "B1", "BB1", LocalDate.of(2020, 1, 20), new String[]{"Báo Pháp Luật"}, 1000, 5000));
        listMagazine.add(new Magazine(33, "C1", "CC1", LocalDate.of(2021, 12, 12), new String[]{"Báo Đời Sống"}, 1500, 2000));
        listMagazine.add(new Magazine(44, "D1", "DD1", LocalDate.of(2019, 8, 8), new String[]{"Báo Kinh Tế","Báo Thị Trường"}, 600, 4000));
        listMagazine.add(new Magazine(55, "E1", "EE1", LocalDate.of(2021, 5, 19), new String[]{"Tạp Chí Tin Học"}, 780, 3000));
        return listMagazine;
    }

    public  ArrayList<Documents> getDocument() {
        ArrayList<Documents> listDocument = new ArrayList<>();
        listDocument.add(new Documents(111, "A2", "AA2", 2018, LocalDate.of(2019, 11, 11), new String[]{"Luật Pháp"}, 5.5, 1000));
        listDocument.add(new Documents(222, "B2", "BB2", 2018, LocalDate.of(2019, 11, 11), new String[]{"Toán Logic",}, 6.6, 5555));
        listDocument.add(new Documents(333, "C2", "CC2", 2018, LocalDate.of(2019, 11, 11), new String[]{"Mẹ và Bé"}, 3.3, 3500));
        listDocument.add(new Documents(444, "D2", "DD2", 2018, LocalDate.of(2019, 11, 11), new String[]{"Doanh Nhân"}, 4.5, 3200));
        listDocument.add(new Documents(555, "E2", "EE2", 2018, LocalDate.of(2019, 11, 11), new String[]{"Kỹ Năng Sống"}, 7.2, 2500));
        listDocument.add(new Documents(666, "F2", "FF2", 2018, LocalDate.of(2019, 11, 11), new String[]{"Kinh tế", "Chính Trị"}, 3.5, 1001));
        return listDocument;
    }
}
