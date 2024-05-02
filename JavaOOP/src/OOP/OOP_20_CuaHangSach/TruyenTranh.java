package OOP.OOP_20_CuaHangSach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruyenTranh extends TaiLieu {
    // Truyện tranh có thêm các thông tin: Tên truyện, ngày phát hành.
    private String tenTruyen;
    private int ngayPhatHanh;
    Scanner sc = new Scanner(System.in);

    public TruyenTranh() {
        System.out.println("Nhap ten truyen");
        tenTruyen = sc.nextLine();
        System.out.println("Nhap ngay phat hanh");
        ngayPhatHanh = sc.nextInt();
    }

    public String inThongTinTruyenTranh() {
        System.out.println(super.inThongTinTaiLieu());
        return "TenTruyen: " + tenTruyen +
                " 'Ngay Phat Hanh': " + ngayPhatHanh;
    }
    public static List<TruyenTranh> timKiemTruyenTranh(String ten , List<TruyenTranh> lst){
        List<TruyenTranh> dstk = new ArrayList<>();
        for (TruyenTranh truyenTranh: lst
             ) {
            if (truyenTranh.getTenTruyen().contains(ten)) {
                dstk.add(truyenTranh);
            }
        }
        return dstk;
    }
    public TruyenTranh(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTruyen, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTruyen = tenTruyen;
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getTenTruyen() {
        return tenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        this.tenTruyen = tenTruyen;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
