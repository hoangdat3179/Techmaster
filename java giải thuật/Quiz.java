import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Quiz
 */
public class Quiz {

    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien(8, "Cuong"));
        list.add(new SinhVien(10, "Cuong"));
        list.add(new SinhVien(11, "Cuong"));
        list.add(new SinhVien(8, "Zack"));

        // 1 Sap xe theo tuoi: Tang dan
        list.sort(new SoSanhTheoTuoi());

        for (SinhVien s : list) {
            System.out.println(s);
        }
    }

}