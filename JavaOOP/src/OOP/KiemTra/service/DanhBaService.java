package OOP.KiemTra.service;

import OOP.KiemTra.InterFace.DanhBaInterFace;
import OOP.KiemTra.lib.InputHelper;
import OOP.KiemTra.model.DanhBa;

import java.util.ArrayList;
import java.util.List;

public class DanhBaService implements DanhBaInterFace {
    List<DanhBa> danhBaList = new ArrayList<>();

    public void xemDanhba() {
        if (danhBaList.size() == 0) {
            System.out.println("Danh sach rong");
            return;
        }
        System.out.println("Danh sach danh ba");
        for (DanhBa danhBa : danhBaList) {
            System.out.println(danhBa.inThongtin());
        }
    }

    @Override
    public boolean editTen(DanhBa newDanhba, int id) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getId() == id) {
                danhBaList.set(i, newDanhba);
                return true;
            }
        }
        return false;
    }

    public String themLienHe(DanhBa danhBa) {
        for (DanhBa danhBa1 : danhBaList) {
            if (danhBa1.getId() == danhBa.getId()) {
                return "Id khong đươc trùng";
            }
        }
        danhBaList.add(danhBa);
        return "Them thanh cong";
    }

    public String trangThaiChan(int id) {
        for (DanhBa danhBa : danhBaList) {
            if (danhBa.getId() == 0) {
                return "Id khong toi tai";
            }
            for (int i = 0; i < danhBaList.size(); i++) {
                if (danhBaList.get(i).getId() == id) {
                    System.out.println();
                    int ttc = InputHelper.inputNumber("Nhap trang thai chan", "Sai");
                    chan(ttc);
                }
            }
        }
        return "Chan thanh cong";
    }

    public void chan(int a) {
        for (DanhBa danhBa : danhBaList) {
            switch (a) {
                case 1:
                    danhBa.setTrangThaiChan(true);
                    break;
                case 2:
                    danhBa.setTrangThaiChan(false);
                    break;
            }
        }

    }

    public String xoaLienHe(int id) {
        boolean check = false;
        try {
            for (DanhBa danhBa : danhBaList) {
                if (danhBa.getId() == id) {
                    danhBaList.remove(danhBa);
                    check = true;
                    return "Xoa thanh cong";
                }
            }
            if (!check) {
                System.out.println("Id kh ton tai");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Xoa that bai";
    }

    public void timKiemId(int id) {
        int count = 0;
        for (DanhBa danhBa : danhBaList) {
//            for (int i = 0; i < danhBaList.size(); i++) {
//                if (danhBaList.get(i).getId() == id) {
//                    System.out.println(danhBa.inThongtin());
//                    count++;
//                }
//            }
            if (danhBaList.contains(id)) {
                System.out.println(danhBa.inThongtin());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Id khong ton tai");
        }
    }
}
