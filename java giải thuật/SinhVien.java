public class SinhVien {
    public int age;
    public String name;
    public boolean daCoVo;

    public SinhVien(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }
}
