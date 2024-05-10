package OOP.KiemTra.view;

import OOP.KiemTra.lib.InputHelper;
import OOP.KiemTra.model.DanhBa;
import OOP.KiemTra.service.DanhBaService;

public class DanhBaController {
    private static DanhBaService danhBaService = new DanhBaService();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("1. xem danh ba");
        System.out.println("2. them lien he");
        System.out.println("3. thay doi trang thai chan");
        System.out.println("4. doi ten lien he");
        System.out.println("5. xoa lien he");
        System.out.println("6. tim kiem theo id");
        System.out.println("7. thoat");
        int chon = InputHelper.inputNumber("Chon tuy chon 1/2/3/4/5/6/7", "Sai");
        luaChon(chon);
    }

    public static void luaChon(int a) {
        switch (a) {
            case 1:
                danhBaService.xemDanhba();
                break;
            case 2:
                danhBaService.themLienHe(new DanhBa());
                break;
            case 3:
                danhBaService.trangThaiChan(InputHelper.inputNumber("Nhap id muon chan", "Sai"));
                break;
            case 4:
                danhBaService.editTen(new DanhBa(), InputHelper.inputNumber("Nhap id", "Sai"));
                break;
            case 5:
                danhBaService.xoaLienHe(InputHelper.inputNumber("Nhap id can xoa", "Sai"));
                break;
            case 6:
                danhBaService.timKiemId(InputHelper.inputNumber("Nhap id can tim", "Sai"));
                break;
            case 7:
                System.exit(0);
        }
        menu();
    }
}
