package OOP.MVC_01_SoHoc.service;

import OOP.MVC_01_SoHoc.model.SoHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SoHocController {
    List<SoHoc> soHocList = new ArrayList<>();

    public void taoNgauNhien() {
        Random radom = new Random();
        int ngauNhien = radom.nextInt();
        SoHoc soHoc = new SoHoc(ngauNhien);
        soHocList.add(soHoc);
//        System.out.println(soHoc.inThongTin());
    }

    public void themSo(SoHoc soHoc) {
        soHocList.add(soHoc);
        taoNgauNhien();
        System.out.println("Them so thanh cong");
    }

    public void getAll() {
        if (soHocList.size() == 0) {
            System.out.println("Danh sach trong");
        }
        for (SoHoc soHoc : soHocList) {
            System.out.println("Thong tin cac so la: " + soHoc.inThongTin());
        }
    }

    public void soChan() {
        if (soHocList.size() == 0) {
            System.out.println("Danh sach trong");
        }
        for (SoHoc soHoc : soHocList) {
            if (soHoc.getGiaTri() % 2 == 0) {
                System.out.println("Thong tin cac so chan la:" + soHoc.inThongTin());
            } else {
                System.out.println("Khong phai so chan");
            }
        }
    }

    public void soLe() {
        if (soHocList.size() == 0) {
            System.out.println("Danh sach trong");
        }
        for (SoHoc soHoc : soHocList) {
            if (soHoc.getGiaTri() % 2 != 0) {
                System.out.println("Cac so le la:" + soHoc.inThongTin());
            } else
                System.out.println(soHoc.getGiaTri() + "Khong phai so le");
        }
    }

    public void soNguyenTo() {
        if (soHocList.size() == 0) {
            System.out.println("Danh sach trong");
            return;
        }
        for (SoHoc soHoc : soHocList) {
            boolean check = true;
            if (soHoc.getGiaTri() == 0 || soHoc.getGiaTri() == 1) {
                check = false;
            }
            for (int i = 2; i < soHoc.getGiaTri() - 1; i++) {
                if (soHoc.getGiaTri() % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("So nguyen to la" + soHoc.inThongTin());
            } else {
                System.out.println("Khong co so nguyen to");
            }
        }
    }

    public void soDoiXung() {
        if (soHocList.size() == 0) {
            System.out.println("Danh sach trong");
        }
        for (SoHoc soHoc : soHocList) {
            int so = soHoc.getGiaTri();
            int originalSo = so; // Lưu số gốc để so sánh sau khi đảo ngược
            int reversed = 0;
            while (so != 0) {
                int digit = so % 10;
                reversed = reversed * 10 + digit;
                so /= 10;
            }
            if (originalSo == reversed) {
                System.out.println("So doi xung la: " + soHoc.inThongTin());
            } else {
                System.out.println("Khong co so doi xung");
            }
        }
    }

}
