package OOP.MVC_03_SanPham.service;

import OOP.MVC_02_HocSinh.lib.InputHelper;
import OOP.MVC_03_SanPham.model.LoaiSanPham;
import OOP.MVC_03_SanPham.model.NhaCungCap;
import OOP.MVC_03_SanPham.model.SanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SanPhamController {
    List<SanPham> sanPhamList = new ArrayList<>();
    List<NhaCungCap> nhaCungCapList = new ArrayList<>();
    List<LoaiSanPham> loaiSanPhamList = new ArrayList<>();

    public String themNCC(NhaCungCap nhaCungCap) {
        if (nhaCungCap != null) {
            nhaCungCapList.add(nhaCungCap);
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }

    public String themLoaiSP(LoaiSanPham loaiSanPham) {
        if (loaiSanPham != null) {
            loaiSanPhamList.add(loaiSanPham);
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }

    public String themSP(SanPham sanPham) {
        for (LoaiSanPham loaiSanPham : loaiSanPhamList) {
            if (loaiSanPham.getLoaiSP() == 0) {
                String chon = InputHelper.StringName("Co muon them loai san pham khong 1.co 2.khong", "Sai nhap lai", 1, 11);
                CoOrKhongloaiSanPham(chon);
            }
        }
        for (NhaCungCap cungCap : nhaCungCapList) {
            if (cungCap.getNhaCC() == 0) {
                String chon = InputHelper.StringName("Co muon them nha cung cap khong 1.co 2.khong", "Sai nhap lai", 1, 11);
                CoOrKhongNhaCungCap(chon);
            }
        }
        sanPhamList.add(sanPham);
        return "Them thanh cong";
    }

    public void CoOrKhongloaiSanPham(String a) {
        switch (a) {
            case "co":
                themLoaiSP(new LoaiSanPham());
                break;
            case "khong":
                System.exit(0);
                break;
        }
    }

    public void CoOrKhongNhaCungCap(String a) {
        switch (a) {
            case "co":
                themNCC(new NhaCungCap());
                break;
            case "khong":
                System.exit(0);
                break;
        }
    }

    public void hienLoai(int loaiSp) {
        if (sanPhamList.size() == 0) {
            System.out.println("San pham trong");
        }
        //  sắp xếp tăng dần theo NhaCC
        for (int i = 0; i < sanPhamList.size() - 1; i++) {
            for (int j = i + 1; j < sanPhamList.size(); j++) {
                if (sanPhamList.get(i).getNhaCC().getNhaCC() > sanPhamList.get(j).getNhaCC().getNhaCC()) {
                    SanPham temp;
                    temp = sanPhamList.get(i);
                    Collections.replaceAll(sanPhamList, sanPhamList.get(i), sanPhamList.get(j));
                    Collections.replaceAll(sanPhamList, sanPhamList.get(j), temp);
                }
            }
        }
        int count = 0;
        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getLoaiSP().getLoaiSP() == loaiSp) {
                System.out.println(sanPham.inThongTin());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Loai san pham khong ton tai");
        }
    }

    public void HienNCC(int nhaCc) {
        if (sanPhamList.size() == 0) {
            System.out.println("San pham trong");
        }
        // sắp xếp theo LoaiSP
        for (int i = 0; i < sanPhamList.size() - 1; i++) {
            for (int j = i + 1; j < sanPhamList.size(); j++) {
                if (sanPhamList.get(i).getLoaiSP().getLoaiSP() > sanPhamList.get(j).getLoaiSP().getLoaiSP()) {
                    SanPham temp;
                    temp = sanPhamList.get(i);
                    Collections.replaceAll(sanPhamList, sanPhamList.get(i), sanPhamList.get(j));
                    Collections.replaceAll(sanPhamList, sanPhamList.get(j), temp);
                }
            }
        }
        int count = 0;
        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getNhaCC().getNhaCC() == nhaCc) {
                System.out.println(sanPham.inThongTin());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nha cung cap khong ton tai");
        }
    }
}
