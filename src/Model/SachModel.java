package Model;

public class SachModel {
    private String ma;
    private String ten;

    public SachModel(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SachModel{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }

}
