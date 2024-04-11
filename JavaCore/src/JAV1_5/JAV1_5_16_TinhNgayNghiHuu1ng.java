package JAV1_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class JAV1_5_16_TinhNgayNghiHuu1ng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho ten: ");
        String hoten = sc.nextLine();
        //cach one;
//        System.out.println("Nhap vao ngay sinh: ");
//        String ngaysinh = sc.nextLine();
//        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate date = LocalDate.parse(ngaysinh , formatDate);
//        LocalDate nghihuu = date.plusYears(60);
        // cach two;
        System.out.println("Ngay sinh:");
        LocalDate ngaySinh = LocalDate.parse(sc.nextLine());
        System.out.println("Name : " + hoten+" Year nghi huu la: " + (ngaySinh.getYear()+60));
    }
}
