package OOP.OOP_03_MonAn;

import java.util.Scanner;

public class MonAn {
    private String TenMonAn;
    private int GiaBan;
    private String GioiThieu;
    private String NguyenLieuChinh;
    Scanner sc = new Scanner(System.in);

    public MonAn() {
        System.out.println("Nhap ten mon");
        String tenMon = sc.nextLine();
        setTenMonAn(tenMon);

        System.out.println("Nhap gioiThieu");
        String gioiThieu = sc.nextLine();
        setGioiThieu(gioiThieu);

        System.out.println("Nhap NguyenLieuChinh");
        String NguyenLieuChinh = sc.nextLine();
        setNguyenLieuChinh(NguyenLieuChinh);
    }

    public String getTenMonAn() {
        return TenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        TenMonAn = tenMonAn;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int giaBan) {
        GiaBan = giaBan;
    }

    public String getGioiThieu() {
        return GioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        GioiThieu = gioiThieu;
    }

    public String getNguyenLieuChinh() {
        return NguyenLieuChinh;
    }

    public void setNguyenLieuChinh(String nguyenLieuChinh) {
        NguyenLieuChinh = nguyenLieuChinh;
    }

    public String inThongTin() {
        return "Mon { " +
                " TenMonAn='" + TenMonAn + '\'' +
                ", GioiThieu='" + GioiThieu + '\'' +
                ", Duoc lam tu cac nguyen lieu chinh = '" + NguyenLieuChinh + '\'' +
                '}';
    }
}
