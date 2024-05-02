package OOP.OOP_06_LopHoc;

import java.util.Scanner;

public class LopHoc {
    private int maLop;
    private String tenLop;
    private int siSo;
    private String diaChi;
    private String gvcn;
    Scanner sc = new Scanner(System.in);

    public LopHoc() {
        System.out.println("Nhap ma lop hoc :");
        maLop = sc.nextInt();

        System.out.println("Nhap ten lop hoc :");
        sc.nextLine();
        tenLop = sc.nextLine();

        System.out.println("Nhap si so lop hoc :");
        siSo = sc.nextInt();

        System.out.println("Nhap diachi lop hoc :");
        sc.nextLine();
        diaChi = sc.nextLine();

        System.out.println("Nhap GVCN lop hoc :");
        gvcn = sc.nextLine();
    }

    public LopHoc(int maLop, String tenLop, int siSo, String diaChi, String gvcn) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.siSo = siSo;
        this.diaChi = diaChi;
        this.gvcn = gvcn;
    }

    public String inThongTin() {
        return
                "Ten Lop " + tenLop + '\'' +
                        " co ma la " + maLop +
                        " ở " + diaChi + '\n' +
                        "Lop co " + siSo +
                        "hoc sinh va co gvcn la " + gvcn + '\'';
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGvcn() {
        return gvcn;
    }

    public void setGvcn(String gvcn) {
        this.gvcn = gvcn;
    }
}
