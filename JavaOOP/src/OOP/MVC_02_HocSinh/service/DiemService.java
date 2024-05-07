package OOP.MVC_02_HocSinh.service;

import OOP.MVC_02_HocSinh.lib.InputHelper;
import OOP.MVC_02_HocSinh.model.Diem;
import OOP.MVC_02_HocSinh.model.HocSinh;
import OOP.MVC_02_HocSinh.model.MonHoc;

import java.util.ArrayList;
import java.util.List;

public class DiemService {
    List<HocSinh> hocSinhList = new ArrayList<>();
    List<MonHoc> monHocList = new ArrayList<>();
    List<Diem> diemList = new ArrayList<>();

    public boolean themHs(HocSinh hsnew) {
        for (HocSinh hocSinh : hocSinhList) {
            // check trung ma
            if (hocSinh.getMaHS() == hsnew.getMaHS()) {
                System.out.println("Ma trung");
                return false;
            }
        }
        hocSinhList.add(hsnew);
        System.out.println("Them thanh cong");
        return true;
    }

    public boolean themMonHoc(MonHoc mhnew) {
        for (MonHoc monHoc : monHocList
        ) {
            if (monHoc.getMaMh() == mhnew.getMaMh()) {
                System.out.println("Them that bai");
                return false;
            }
        }
        monHocList.add(mhnew);
        System.out.println("Them thanh cong");
        return true;
    }

    public String chamDiem(int mahs, int maMh) {
        if (diemList.size() == 0) {
            boolean checkHS = false;
            for (HocSinh hs : hocSinhList) {
                if (hs.getMaHS() == mahs) {
                    checkHS = true;
                    break;
                }
            }
            if (!checkHS) return "Ma hoc sinh " + mahs + " khong ton tai!!";
            boolean checkMH = false;
            for (MonHoc mh : monHocList) {
                if (mh.getMaMh() == maMh) {
                    checkMH = true;
                    break;
                }
            }
            if (!checkMH) return "Ma mon hoc " + maMh + " khong ton tai!!";
            Diem newDiem = new Diem(mahs, maMh);
            diemList.add(newDiem);
            return "Them diem thanh cong";
        } else {
            //check hs va mon hoc toi tai
            boolean checkHS = false;
            for (HocSinh hs : hocSinhList) {
                if (hs.getMaHS() == mahs) {
                    checkHS = true;
                    break;
                }
            }
            if (!checkHS) return "Ma hoc sinh " + mahs + " khong ton tai!!";
            boolean checkMH = false;
            for (MonHoc mh : monHocList) {
                if (mh.getMaMh() == maMh) {
                    checkMH = true;
                    break;
                }
            }
            if (!checkMH) return "Ma mon hoc " + maMh + " khong ton tai!!";
            // end

            boolean checkDiem = false;
            for (Diem d : diemList) {
                if (d.getMaHS() == mahs && d.getMaMh() == maMh) {
                    checkDiem = true;
                    break;
                }
            }
            if (checkDiem) { // Cap nhat diem
                for (Diem d : diemList) {
                    if (d.getMaHS() == mahs && d.getMaMh() == maMh) {
                        d.setDiem(InputHelper.inputDiem("Nhap diem", "Sai"));
                        break;
                    }
                }
                return "Cap nhat diem thanh cong";
            } else { // Them diem moi
                Diem newDiem = new Diem(mahs, maMh);
                diemList.add(newDiem);
                return "Them diem thanh cong";
            }
        }
    }

    public String bangDiem(int mahs) {
        boolean checkHs = false;
        for (HocSinh hocSinh : hocSinhList) {
            if (hocSinh.getMaHS() == mahs)
                checkHs = true;
            break;
        }
        if (!checkHs) {
            return "Ma hoc sinh khong ton tai 2";
        } else {
            System.out.println("Thong tin bang diem: ");
            for (MonHoc monHoc : monHocList) {
                monHoc.inThongTin();
            }
            if (diemList.size() == 0) {
                return "Bang diem trong";
            }
            for (Diem diem : diemList) {
                diem.inThongTin();
            }
            return "Ket thuc Thong tin bang diem";
        }
    }


    public String TongKetMon(int maMh) {
        boolean checkMh = false;
        if (monHocList.size() == 0) {
            for (MonHoc monHoc : monHocList) {
                if (monHoc.getMaMh() == maMh) {
                    checkMh = true;
                    break;
                }
            }
        }
        if (!checkMh) {
            return "Ma" + maMh + "Khong toi tai";
        }
        else {
            for (HocSinh hocSinh: hocSinhList) {
                hocSinh.inThongTin();
            }
            for (Diem diem: diemList
                 ) {
                diem.inThongTin();
            }
        }
        return "Mon hoc trong";
    }
}
