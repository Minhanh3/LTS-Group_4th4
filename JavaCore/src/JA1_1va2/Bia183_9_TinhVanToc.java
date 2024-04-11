package JA1_1va2;

import java.util.Scanner;

public class Bia183_9_TinhVanToc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // quang duong
        System.out.println("Nhap quang duong: ");
        double qd = sc.nextDouble();
        // Time
        System.out.println("Nhap gio: ");
        int gio = sc.nextInt();
        System.out.println("Nhap phut: ");
        int phut = sc.nextInt();
        System.out.println("Nhap giay: ");
        int giay = sc.nextInt();
        // quãng đường km
        double qDuong = qd * 1000;
        // thời gian giờ phút giây
        int time = gio * 3600 + phut * 60 + giay;
        // tinh v km/h giờ chia 3600 giây
        double vanTockmh = qd / (time / 3600);
        // tinh v m/p
        double vanTocMp = (qd * 3600) / time;
        //tính v m/s
        double vanTocMs = qDuong / time;
        System.out.println("Van toc v Km/h" + vanTockmh);
        System.out.println("Van toc v M/p" + vanTocMp);
        System.out.println("Van toc v M/s" + vanTocMs);
    }
}
