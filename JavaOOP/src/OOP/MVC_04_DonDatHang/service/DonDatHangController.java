package OOP.MVC_04_DonDatHang.service;

import OOP.MVC_04_DonDatHang.lib.InputHelper;
import OOP.MVC_04_DonDatHang.model.ChiTietDonDatHang;
import OOP.MVC_04_DonDatHang.model.DonDatHang;
import OOP.MVC_04_DonDatHang.model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class DonDatHangController {
    List<DonDatHang> donDatHangList = new ArrayList<>();
    List<SanPham> sanPhamList = new ArrayList<>();

    public String ThemSanPham(SanPham sanPham) {
        for (SanPham sanPham1 : sanPhamList) {
            if (sanPham1.getMaSP() == sanPham.getMaSP()) {
                System.out.println("Ma san pham toi tai");
            }
        }
        sanPhamList.add(sanPham);
        return "Them thanh cong";
    }

    public String ThemDonDatHang(DonDatHang datHang) {
        for (DonDatHang donDatHang : donDatHangList) {
            if (donDatHang.getMaDDH() == datHang.getMaDDH()) {
                System.out.println("Ma don dat hang toi tai");
            }
        }
        donDatHangList.add(datHang);
        return "Them thanh cong";
    }

    public String ThemChiTietDonDatHang(ChiTietDonDatHang chiTietDonDatHang) {
        if (sanPhamList.size() == 0) {
            String chon = InputHelper.inputString("Chua co san pham trong don dat hang", "Sai", 2, 20);
            luaChonthemSanPham(chon);
        }
        // Thêm một SanPham vào một " DonDatHang đã có " thông qua ChiTietDonDatHang (MaSP và MaDDH).
        // Nếu SanPham chưa tồn tại thì thông báo ra rồi hỏi muốn thêm sản phẩm mới không? Nếu có thì thực hiện thêm sản phẩm mới

        return "";
    }

    public void luaChonthemSanPham(String chon) {
        switch (chon) {
            case "co":
                ThemSanPham(new SanPham());
                break;
            case "khong":
                System.exit(0);
        }
    }
    public void HienThiDon(){

    }
}
