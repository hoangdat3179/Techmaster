package vn.techmaster;

import java.util.Scanner;

public class Controller {
    Service service = new Service();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    subMenu();
                    break;
                case 2:
                    service.getLibarryByType();
                    break;
                case 3:
                    service.sortDownloadDocument();
                    break;
                case 4:
                    service.sortYearMagazine();
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

    public void subMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu1();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    service.printLibarryBook();
                    break;
                case 2:
                    service.printLibarryMagazine();
                    break;
                case 3:
                    service.printLibarryDocument();
                    break;
                case 4:
                    service.printLibarryBook();
                    service.printLibarryMagazine();
                    service.printLibarryDocument();
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này, tự động back ra menu chính");
                    mainMenu();
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem thư viện theo từng loại");
        System.out.println("2 - Lấy thông tin sách theo thể loại");
        System.out.println("3 - Lấy ra thông tin 5 Tài liệu điện tử được tải nhiều nhất");
        System.out.println("4 - Lấy ra Tạp chí, báo được xuất bản trong năm hiện tại");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
    public static void menu1() {
        System.out.println("1 - Xem thư viện SGK");
        System.out.println("2 - Xem thư viện Báo và Tạp Chí");
        System.out.println("3 - Xem thư viện Tài Liệu Điện Tử");
        System.out.println("4 - Xem toàn bộ thư viện");
        System.out.println("0 - Quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }


}
