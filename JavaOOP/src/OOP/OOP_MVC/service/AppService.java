package OOP.OOP_MVC.service;

import OOP.OOP_MVC.model.HocSinh;

import java.util.ArrayList;
import java.util.List;

public class AppService implements AppHocSinhInteface {
    private List<HocSinh> db = new ArrayList<>();

    public AppService() {
    }

    @Override
    public boolean addNew(HocSinh input) {
        for (HocSinh hocSinh : db) {
            if (hocSinh.getId() == input.getId()) {
                return false;
            }
        }
        db.add(input);
        System.out.println("Them thanh cong");
        return true;
    }

    @Override
    public boolean remakeHocSinh(HocSinh hsNew, int id) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getId() == id) {
                db.set(i, hsNew);
                System.out.println("Sua thanh cong");
                return true;
            }
        }
        System.out.println("Sua that bai");
        return false;
    }

    @Override
    public boolean deleteHocSinh(int id) {
        for (HocSinh hocSinh : db) {
            if (hocSinh.getId() == id) {
                db.remove(hocSinh);
                System.out.println("Xoa thanh cong");
                return true;
            }
        }
        System.out.println("Xoa that bai");
        return false;
    }

    @Override
    public boolean showEveryThing() {
        if (db.size() == 0) {
            System.out.println("Danh sach trong");
            return false;
        }
        for (HocSinh hocSinh : db) {
            hocSinh.showInfo();
        }
        return true;
    }
}
