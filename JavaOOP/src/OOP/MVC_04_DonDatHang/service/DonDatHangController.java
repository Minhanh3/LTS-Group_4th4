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
    List<ChiTietDonDatHang> chiTietDonDatHangList = new ArrayList<>();


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
        boolean spToitai = false;
        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getMaSP() == chiTietDonDatHang.getMaSP()) {
                spToitai = true;
                System.out.println(spToitai);
                break;
            }
        }
        if (!spToitai) {
            System.out.println(spToitai);
            String chon = InputHelper.inputString("Chua co san pham trong don dat hang", "Sai", 2, 20);
            luaChonthemSanPham(chon);
        }
        boolean datHangToitai = false;
        for (DonDatHang donDatHang : donDatHangList) {
            if (donDatHang.getMaDDH() == chiTietDonDatHang.getMaDDH()) {
                datHangToitai = true;
                System.out.println(datHangToitai);
                break;
            }
        }
        if (!datHangToitai) {
            return "Ma don dat hang khong ton tai";
        }
        chiTietDonDatHangList.add(chiTietDonDatHang);
        // Thêm một SanPham vào một " DonDatHang đã có " thông qua ChiTietDonDatHang (MaSP và MaDDH).
        // Nếu SanPham chưa tồn tại thì thông báo ra rồi hỏi muốn thêm sản phẩm mới không? Nếu có thì thực hiện thêm sản phẩm mới
        return "Them ChiTietDonDatHang thanh cong";
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

    public void HienThiDon(int MaDDH) {
        boolean donHang = false;
        for (ChiTietDonDatHang chiTietDonDatHang : chiTietDonDatHangList) {
            if (chiTietDonDatHang.getMaDDH() == MaDDH) {
                donHang = true;
                System.out.println("Don hang co ma" + MaDDH);
                for (SanPham sanPham : sanPhamList) {
                    if (chiTietDonDatHang.getMaSP() == sanPham.getMaSP()) {
                        System.out.println("San pham : " + sanPham.getTenSP());
                        System.out.println("So luong : " + chiTietDonDatHang.getSoLuong());
                        break;
                    }
                }
            }
        }
        if (!donHang) {
            System.out.println("Khong co don hang voi ma" + MaDDH);
        }
    }
}
