package OOP.OOP_20_CuaHangSach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenSach;
    private String tenTacGia;
    private int soTrang;
    Scanner sc = new Scanner(System.in);

    public Sach() {
        System.out.println("Nhap ten sach");
        tenSach = sc.nextLine();
        System.out.println("Nhap ten Tac Gia");
        tenTacGia = sc.nextLine();
        System.out.println("Nhap so Trang");
        soTrang = sc.nextInt();
    }

    public static List<Sach> timKiemSach(String ten, List<Sach> saches) {
        List<Sach> store = new ArrayList<>();
        for (Sach sach : saches) {
            if (sach.getTenSach().contains(ten)) {
                store.add(sach);
            }
        }
        return store;
    }

    public Sach(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenSach, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String inThongTinSach() {
        System.out.println(super.inThongTinTaiLieu());
        return "Ten Sach: " + tenSach + " Ten tac gia: " + tenTacGia + " So trang: " + soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }


    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
