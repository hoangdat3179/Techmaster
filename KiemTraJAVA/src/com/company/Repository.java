package com.company;

import java.util.ArrayList;

public class Repository {
    public static ArrayList<User> getData() {
        ArrayList<User> listUser = new ArrayList<>();
        listUser.add(new User("cuongvm", "Cuong123@", "vmcuong2192@gmail.com"));
        listUser.add(new User("vmcuong", "Cuong123@", "vmcuong2193@gmail.com"));
        listUser.add(new User("cuong2192", "Cuong123@", "vmcuong2194@gmail.com"));
        listUser.add(new User("vmcuong2192", "Cuong123@", "vmcuong2195@gmail.com"));
        listUser.add(new User("cuong.vm", "Cuong123@", "vmcuong2196@gmail.com"));
        return listUser;
    }
}
