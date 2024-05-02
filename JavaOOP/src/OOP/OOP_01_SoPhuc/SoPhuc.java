package OOP.OOP_01_SoPhuc;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;


    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public String inThongTin() {
        return "Phan thuc : " + phanThuc + " Phan ao :" + phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
}
