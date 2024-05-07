package OOP.MVC_02_HocSinh.lib;

import java.util.Scanner;

public class InputHelper {

    private static Scanner sc = new Scanner(System.in);

    public static int inputNumber(String mes, String err) {
        System.out.println(mes);
        int value = 0;
        try {
            value = Integer.parseInt(sc.nextLine());
            if (value <= 0 ) {
                System.out.println("Sai nhap lai");
                return inputNumber(mes, err);
            }
            return value;
        } catch (Exception e) {
            System.out.println(err);
            return inputNumber(mes, err);
        }
    }public static double inputDiem(String mes, String err) {
        System.out.println(mes);
        double value;
        try {
            value = Double.parseDouble(sc.nextLine());
            if (value <= 0.25 && value % 0.25 != 0) {
                System.out.println("Sai nhap lai");
                return inputDiem(mes, err);
            }
            return value;
        } catch (Exception e) {
            System.out.println(err);
            return inputDiem(mes, err);
        }
    }

    public static String StringName(String mes, String err, int minLeng, int maxLeng) {
        System.out.println(mes);
        String input = sc.nextLine();
        try {
            if (input.trim().length() <= minLeng) {
                System.out.println("Sai ! Nhap lai");
                return StringName(mes, err, minLeng, maxLeng);
            }
        } catch (Exception e) {
            if (input.trim().length() >= maxLeng) {
                System.out.println("Sai ! Nhap lai");
                return StringName(mes, err, minLeng, maxLeng);
            }
        }
        return input;
    }
}
