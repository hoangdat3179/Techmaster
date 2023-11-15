public class Quiz2 {

    public static void giaDiMotTuoi(SinhVien s) {
        s.age++;
    }

    public static void doiTen(SinhVien s) {
        s.name = "Vo Danh";
    }

    public static void reset(SinhVien s) {
        s = new SinhVien(0, "N/A");
    }

    public static void reset2(SinhVien s) {
        s.age = 0;
        s.name = "N/A";
        s = new SinhVien(0, "N/A");
    }

    public static void main(String[] args) {
        SinhVien cuong = new SinhVien(30, "Cuong");
        reset2(cuong);
        System.out.println(cuong);
    }

}
