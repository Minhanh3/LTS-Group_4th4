package OOP.MVC_02_HocSinh.view;

import OOP.MVC_02_HocSinh.lib.InputHelper;
import OOP.MVC_02_HocSinh.model.HocSinh;
import OOP.MVC_02_HocSinh.model.MonHoc;
import OOP.MVC_02_HocSinh.service.DiemService;

public class DiemController {
    private static DiemService diemService = new DiemService();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("1. Thêm Học Sinh");
        System.out.println("2. Thêm Môn Học");
        System.out.println("3. Chấm Điểm");
        System.out.println("4. Xem Bảng Điểm Học Sinh");
        System.out.println("5. Xem Tổng Kết Điểm Học Sinh Theo Môn");
        System.out.println("6. Thoát");
        int request = InputHelper.inputNumber("Nhap yeu cau", "Sai nhap lai");
        controller(request);
    }

    public static void controller(int request) {
        switch (request) {
            case 1:
                diemService.themHs(new HocSinh());
                break;
            case 2:
                diemService.themMonHoc(new MonHoc());
                break;
            case 3:
                System.out.println(diemService.chamDiem(InputHelper.inputNumber("Nhap ma hoc sinh", "Sai"), InputHelper.inputNumber("Nhap ma mon hoc", "Sai")));
                break;
            case 4:
                System.out.println(diemService.bangDiem(InputHelper.inputNumber("Nhap ma hoc sinh", "Sai")));
                break;
            case 5:
                diemService.TongKetMon(InputHelper.inputNumber("Nhap ma mon hoc", "Sai"));
                break;
            case 6:
                System.exit(0);
        }
        menu();
    }
}
