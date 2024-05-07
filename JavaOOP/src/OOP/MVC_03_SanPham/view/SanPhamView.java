package OOP.MVC_03_SanPham.view;

import OOP.MVC_03_SanPham.lib.InputHelper;
import OOP.MVC_03_SanPham.model.LoaiSanPham;
import OOP.MVC_03_SanPham.model.NhaCungCap;
import OOP.MVC_03_SanPham.model.SanPham;
import OOP.MVC_03_SanPham.service.SanPhamController;

public class SanPhamView {
    private static SanPhamController sanPhamController = new SanPhamController();
//    private static NhaCungCap nhaCungCap = new NhaCungCap();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("1. Thêm Sản Phẩm");
        System.out.println("2. Hiện Sản Phẩm Của Loại");
        System.out.println("3. Hiển Sản Phẩm Của Nhà Cung Cấp");
        System.out.println("4. Thoát");
        int chon = InputHelper.inputNumber("Nhap lua chon", "Sai");
        controller(chon);
    }

    public static void controller(int a) {
        switch (a) {
            case 1:
                sanPhamController.themSP(new SanPham());
                break;
            case 2:
                sanPhamController.hienLoai(InputHelper.inputNumber("Nhap loai sp bằng số", "Sai "));
                break;
            case 3:
                sanPhamController.HienNCC(InputHelper.inputNumber("Nhap nha cung cap bằng số", "sai"));
                break;
            case 4:
                System.exit(0);
                break;
        }
        menu();
    }
}
