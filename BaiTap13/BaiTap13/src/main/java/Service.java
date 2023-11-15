import java.util.*;

public class Service {
    ArrayList<Book> listBook = Repository.getBook();
    Scanner sc = new Scanner(System.in);
    public void printAllBook (){
        show(listBook);
    }

    public void filterByType (){
        System.out.println("Nhập thể loại sách muốn tìm: ");
        String newType = "";
        newType = sc.nextLine();
        int count = 0;
        for (Book book: listBook){

        for (int i = 0; i< book.getCategory().length;i++){
            if(book.getCategory()[i].toLowerCase().contains(newType.toLowerCase())) {
                System.out.println(book);
                count++;
            }
        }
        }
        if(count == 0){
            System.out.println("Không có thể loại sách bạn tìm kiếm");
        }
    }
    public Map<String, Integer> countByType (){

        Map<String, Integer> mapType = new HashMap<>();
        for(Book book : listBook){
             for (int i = 0; i< book.getCategory().length;i++){
                 if(mapType.get(book.getCategory()[i]) == null){
                     mapType.put(book.getCategory()[i], 1);
                 }else{
                     mapType.put(book.getCategory()[i], mapType.get(book.getCategory()[i]) + 1);
                 }
             }
        }

        return mapType;
    }



    public void sortByYear (){
        Collections.sort(listBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishingYear() - o2.getPublishingYear();
            }
        });
        System.out.println("Danh sách sắp xếp theo năm sản xuất");
        show(listBook);
    }

    public void findBookByTitle (){
        System.out.println("Nhập tên sách muốn tìm: ");
        String newName = sc.nextLine();
        int count = 0;
        for (int i = 0; i< listBook.size();i++){
            if(listBook.get(i).getTitle().toLowerCase().contains(newName.toLowerCase())) {
                System.out.println(listBook.get(i));
                count++;
            }
        }
        if(count == 0){
            System.out.println("Không có tên sách bạn tìm kiếm");
        }
    }

    public static void show(ArrayList<Book> listBook){
        for (Book b: listBook){
            System.out.println(b);
        }
    }
}
