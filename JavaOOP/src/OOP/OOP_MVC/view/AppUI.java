package OOP.OOP_MVC.view;

import OOP.OOP_MVC.lib.InputHelper;
import OOP.OOP_MVC.model.HocSinh;
import OOP.OOP_MVC.service.AppService;

public class AppUI {
    private AppService appService = new AppService();

    public AppUI() {
        menu();
    }

    private void menu() {
        System.out.println("1. Them hoc sinh mơi");
        System.out.println("2. Sua hoc sinh theo id");
        System.out.println("3. Xoa theo id");
        System.out.println("4. In toan bo hoc sinh");
        System.out.println("5. Thoat chuong trinh");
        int request = InputHelper.inputHelper("Nhap lua chon", "Nhap sai nhap lai");
        controller(request);
    }

    private void controller(int request) {
        switch (request) {
            case 1:
                appService.addNew(new HocSinh());
                break;
            case 2:
                appService.remakeHocSinh(new HocSinh(), InputHelper.inputHelper("Nhap id cần sửa", "Id sai"));
                break;
            case 3:
                appService.deleteHocSinh(InputHelper.inputHelper("Nhap id", "Id sai"));
                break;
            case 4:
                appService.showEveryThing();
                break;
            case 5:
                System.exit(0);
        }
        menu();
    }
}
