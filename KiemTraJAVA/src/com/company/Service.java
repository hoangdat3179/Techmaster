package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    ArrayList<User> listUser = Repository.getData();
    Scanner sc = new Scanner(System.in);
    public void goLogin() {
        int count = 0;
        System.out.println("ĐĂNG NHẬP");
        System.out.println("Nhập username: ");
        String username = CheckInput.checkUsername();
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equalsIgnoreCase(username)) {
                count++;
                System.out.println("Nhập mật khẩu: ");
                String password = sc.nextLine();
                if (listUser.get(i).getPassword().equals(password)) {
                    System.out.println("Đăng nhập thành công!");
                    System.out.println("Chào mừng " + listUser.get(i).getUsername() + ", bạn có thể thực hiện các công việc sau: ");
                    boolean isCheck1 = false;
                    while (!isCheck1) {
                        menuLogin();
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Nhập username mới: ");
                                String newUsername = sc.nextLine();
                                listUser.get(i).setUsername(newUsername);
                                break;
                            case 2:
                                System.out.println("Nhập email mới: ");
                                String newEmail = CheckInput.checkEmail();
                                listUser.get(i).setEmail(newEmail);
                                break;
                            case 3:
                                System.out.println("Nhập pass mới: ");
                                String newPassword = CheckInput.checkPassword();
                                listUser.get(i).setPassword(newPassword);
                                break;
                            case 4:
                                goLogin();
                                break;
                            case 0:
                                isCheck1 = true;
                                System.exit(1);
                                break;
                            default:
                                System.out.println("Không có lựa chọn này, tự động back ra menu chính");
                                break;
                        }
                    }
                } else {
                    System.out.println("Mật khẩu không chính xác!");
                    boolean isCheck2 = false;
                    while (!isCheck2) {
                        wrongPass();
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                goLogin();
                                break;
                            case 2:
                                forgotPass();
                                break;
                            case 0:
                                isCheck2 = true;
                                System.exit(1);
                                break;
                            default:
                                System.out.println("Không có lựa chọn này, tự động back ra menu chính");
                                break;
                        }
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Tài khoản chưa đúng!" + "\n" + "*Chọn 1 để đăng nhập lại." + "\n" + "*Chưa có tài khoản chọn 2 để đăng ký." + "\n" + "*Chọn số bất kỳ đê thoát");
            boolean isCheck3 = false;
            while (!isCheck3) {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        goLogin();
                        break;
                    case 2:
                        goSignin();
                        break;
                    default:
                        isCheck3 = true;
                        System.exit(1);
                        break;
                }
            }
        }
    }

    public void goSignin() {
        System.out.println("ĐĂNG KÝ TÀI KHOẢN MỚI");
        String username = checkUser();
        System.out.println("Nhập email: ");
        String email = CheckInput.checkEmail();
        System.out.println("Nhập mật khẩu: ");
        String password = CheckInput.checkPassword();
        User newUser = new User(username,password,email );
        listUser.add(newUser);
        System.out.println("Tạo tài khoản thành công");
    }


    public String checkUser() {
        System.out.println("Nhập username: ");
        boolean isContinue = false;
        String newUsername = "";
        while (!isContinue) {
            try {
                newUsername = CheckInput.checkUsername();
                for (User user : listUser) {
                    if (user.getUsername().equals(newUsername)) throw new MyException("Username đã tồn tại");
                }
                isContinue = true;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại:");
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại:");
            }
        }

        return newUsername;
    }


    public void forgotPass() {
        int count = 0;
        System.out.println("Nhập email để kiểm tra: ");
        String email = sc.nextLine();
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getEmail().equals(email)) {
                System.out.println("Nhập mật khẩu mới: ");
                String newPassword = CheckInput.checkPassword();
                listUser.get(i).setPassword(newPassword);
                goLogin();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tồn tại email này, vui lòng đăng ký lại");
            goSignin();
        }
    }

    public static void menuLogin() {
        System.out.println("Bạn có thể thực hiện");
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void wrongPass() {
        System.out.println("Bạn có thể thực hiện");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
