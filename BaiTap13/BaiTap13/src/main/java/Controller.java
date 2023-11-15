import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    Service service = new Service();
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> listBook = Repository.getBook();

    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = inputChoice();
                switch (choice) {
                    case 1:
                        service.printAllBook();
                        break;
                    case 2:
                        service.filterByType();
                        break;
                    case 3:
                        service.countByType();
                        count();
                        break;
                    case 4:
                        service.sortByYear();
                        break;
                    case 5:
                        service.findBookByTitle();
                        break;
                    case 0:
                        isCheck = true;
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                }
        }
    }
    public void count(){
        Map<String, Integer> countType = service.countByType();
        for (Map.Entry<String, Integer> entry : countType.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }


    public static int inputChoice(){
        Scanner sc = new Scanner(System.in);
        boolean isCheck1 = false;
        int choice = 0;
        while (!isCheck1) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice <= 0) throw new MyException("Số nhập vào phải lớn hơn 0");
                isCheck1 = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            } catch (NumberFormatException e) {
                System.out.println("Chỉ nhập được số lớn 0, vui lòng nhập lại");
            }
        }
        return choice;
    }

    public static void menu() {
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem toàn bộ list sách");
        System.out.println("2 - Tìm sách theo thể loại");
        System.out.println("3 - Đếm sách theo thể loại");
        System.out.println("4 - Sắp xếp sách theo năm xuất bản");
        System.out.println("5 - Tìm sách theo tên");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}