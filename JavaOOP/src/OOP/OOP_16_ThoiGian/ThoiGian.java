package OOP.OOP_16_ThoiGian;

import java.util.Scanner;

public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;
    private boolean laNamNhuan;
    private int thu;
    Scanner sc = new Scanner(System.in);

    public ThoiGian() {
        System.out.println("Nhap ngay: ");
        ngay = sc.nextInt();
        nhapNgay(ngay);
        System.out.println("Nhap thang: ");
        thang = sc.nextInt();
        nhapThang(thang);
        System.out.println("Nhap nam: ");
        nam = sc.nextInt();
        nhapNam(nam);
    }

    public String layKhoangThoiGian(ThoiGian thoiGian) {
        int ngay = Math.abs(this.ngay - thoiGian.ngay);
        int thang = Math.abs(this.thang - thoiGian.thang);
        int nam = Math.abs(this.nam - thoiGian.nam);

        return  ngay + " Ngay " + thang + " Thang "  +nam + " Nam ";
    }

    public ThoiGian(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public String inThongTin() {
        return "Thu " + thu + " Ngay " + ngay + " Thang " + thang + " Nam " + nam + " Day " + (isLaNamNhuan() ? "Co" : "Khong") + " Phai Nam nhuan";
    }

    private void nhapNgay(int a) {
        while (a != 0) {
            if (a <= 31) {
                break;
            }
            System.out.println("Nhap lai! sai ");
            ngay = sc.nextInt();
        }
    }

    private void nhapThang(int a) {
        while (a != 0) {
            if (a <= 12) {
                break;
            }
            System.out.println("Nhap lai! sai ");
            thang = sc.nextInt();
        }
    }

    private void nhapNam(int a) {
        while (true) {
            if (a >= 1000 && a <= 2024) {
                break;
            }
            System.out.println("Nhap lai! sai ");
            nam = sc.nextInt();
        }
    }


    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public boolean isLaNamNhuan() {
        if (nam % 4 == 0 && nam % 100 == 0 && nam % 400 == 0) {
            laNamNhuan = true;
        } else {
            laNamNhuan = false;
        }
        return laNamNhuan;
    }

    public void setLaNamNhuan(boolean laNamNhuan) {
        this.laNamNhuan = laNamNhuan;
    }

    public int getThu() {
        return thu;
    }

    public void setThu(int thu) {
        this.thu = thu;
    }
}
