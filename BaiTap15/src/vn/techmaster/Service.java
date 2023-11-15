package vn.techmaster;

import java.time.LocalDate;
import java.util.*;


public class Service {
    Repository repository = new Repository();
    ArrayList<Book> listBook = repository.getBooks();
    ArrayList<Magazine> listMagazine = repository.getMagazine();
    ArrayList<Documents> listDocument = repository.getDocument();
    Scanner sc = new Scanner(System.in);
    public void printLibraryBook() {
        System.out.println("Toàn bộ Sách Giáo Khoa: ");
        listBook.forEach(i -> System.out.println(i));
    }

    public void printLibraryMagazine(){
        System.out.println("Toàn bộ Báo và Tạp Chí: ");
        listMagazine.forEach(i -> System.out.println(i));
    }

    public void printLibraryDocument(){
        System.out.println("Toàn bộ Tài Liệu Điện Tử: ");
        listDocument.forEach(i -> System.out.println(i));
    }

    public void getLibarryByType() {
        System.out.println("Nhập thể loại sách: ");
        String findType = sc.nextLine();
        ArrayList<Object> listALL = new ArrayList();
        listALL.add("Sách giáo khoa: " + "\n" + listBook);
        listALL.add("Báo, tạp chí: " + "\n" +listMagazine);
        listALL.add("Tài liệu điện tử: " + "\n" + listDocument);
        int count = 0;
        for (Object object: listALL){
                if(object.toString().toLowerCase().contains(findType.toLowerCase())){
                    System.out.println(object);
                    count++;
                }
        }

        if (count == 0){
            System.out.println("Không có thể loại này");
        }
    }

    public void sortDownloadDocument(){
      Collections.sort(listDocument, new Comparator<Documents>() {
          @Override
          public int compare(Documents o1, Documents o2) {
              return o2.getDownload()-o1.getDownload();
          }
      });
        System.out.println("Danh sách 5 tài liệu điện tử có lượt download cao nhất: ");
      for (int i = 0; i < 5; i++){
          System.out.println(listDocument.get(i));
      }

    }

    public void sortYearMagazine(){
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();

        listMagazine.stream().filter(magazine -> magazine.getRelease_day().getYear() == year).forEach(System.out::println);
        long count = listMagazine.stream().filter(magazine -> magazine.getRelease_day().getYear() == year).count();
        if(count == 0){
            System.out.println("Không có Báo/Tạp chí ra mắt trong năm nay");
        }
    }

}
