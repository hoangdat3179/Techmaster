package vn.techmaster.woodshop.entity;

public enum Status {
    DANGBAN("Còn Bán") ,
    NGUNGBAN("Ngưng Bán") ;
    public final String label;
    private Status(String label) {
        this.label = label;
    }
}
