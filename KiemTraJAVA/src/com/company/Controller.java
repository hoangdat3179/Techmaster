package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service = new Service();
    Scanner sc = new Scanner(System.in);
    ArrayList<User> listUser = Repository.getData();
    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    service.goLogin();
                    break;
                case 2:
                    service.goSignin();
                    break;
                case 3:
                    System.out.println("In ra tất cả: ");
                    System.out.println(listUser);
                case 0:
                    isCheck = true;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void menu() {
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Đăng Nhập");
        System.out.println("2 - Đăng Ký");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }


}

