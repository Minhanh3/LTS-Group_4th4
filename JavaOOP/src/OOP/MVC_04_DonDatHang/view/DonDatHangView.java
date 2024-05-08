package OOP.MVC_04_DonDatHang.view;

import OOP.MVC_04_DonDatHang.lib.InputHelper;
import OOP.MVC_04_DonDatHang.model.ChiTietDonDatHang;
import OOP.MVC_04_DonDatHang.model.DonDatHang;
import OOP.MVC_04_DonDatHang.model.SanPham;
import OOP.MVC_04_DonDatHang.service.DonDatHangController;

public class DonDatHangView {
    private static DonDatHangController donDatHangController = new DonDatHangController();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("1. Thêm đơn hàng");
        System.out.println("2. Thêm sản phẩm");
        System.out.println("3. Thêm chi tiết đơn hàng");
        System.out.println("4. Hiển thị thông tin đơn hàng");
        System.out.println("5. Thoát");
        int chon = InputHelper.inputNumber("Nhap lua chon ", "Sai ");
        luachon(chon);
    }

    public static void luachon(int a) {
        switch (a) {
            case 1:
                donDatHangController.ThemDonDatHang(new DonDatHang());
                break;
            case 2:
                donDatHangController.ThemSanPham(new SanPham());
                break;
            case 3:
                donDatHangController.ThemChiTietDonDatHang(new ChiTietDonDatHang());
                break;
            case 4:
                donDatHangController.HienThiDon(InputHelper.inputNumber("Nhap ma Dat Don hang", "Sai"));
                break;
            case 5:
                System.exit(0);
        }
        menu();
    }
}
