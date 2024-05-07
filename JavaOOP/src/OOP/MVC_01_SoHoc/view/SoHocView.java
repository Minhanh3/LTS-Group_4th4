package OOP.MVC_01_SoHoc.view;

import OOP.MVC_01_SoHoc.lib.InputHelper;
import OOP.MVC_01_SoHoc.model.SoHoc;
import OOP.MVC_01_SoHoc.service.SoHocController;

import javax.swing.*;

public class SoHocView {
    private static SoHocController soHocController = new SoHocController();

    public static void main(String[] args) {
        menu();
        System.out.println();
    }

    public static void menu() {
        System.out.println("1. Tạo số ( Nhập số N rồi tạo N số ngẫu nhiên)");
        System.out.println("2. Hiển thị Tất Cả");
        System.out.println("3. Hiển thị Số Chẵn");
        System.out.println("4. Hiển thị Số Lẻ");
        System.out.println("5. Hiển thị số Nguyên Tố");
        System.out.println("6. Hiển thị số Đối Xứng");
        System.out.println("7. Thoát");
        int nhapSo = InputHelper.inputNumber("Nhap yeu cau", "Sai");
        controller(nhapSo);
    }

    public static void controller(int so) {
        switch (so) {
            case 1:
                soHocController.themSo(new SoHoc());
                break;
            case 2:
                soHocController.getAll();
                break;
            case 3:
                soHocController.soChan();
                break;
            case 4:
                soHocController.soLe();
                break;
            case 5:
                soHocController.soNguyenTo();
                break;
            case 6:
                soHocController.soDoiXung();
                break;
            case 7:
                System.exit(0);
        }
        menu();
    }
}
