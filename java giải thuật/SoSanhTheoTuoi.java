import java.util.Comparator;

public class SoSanhTheoTuoi implements Comparator<SinhVien> {

    @Override
    public int compare(SinhVien s1, SinhVien s2) {
        if (s1.name.equals(s2.name)) { // s1.name = s2.name
            if (s1.age == s2.age) {
                return Boolean.compare(s1.daCoVo, s2.daCoVo);
            }
            return -Integer.compare(s1.age, s2.age);
        }
        return s1.name.compareTo(s2.name);
    }

}
