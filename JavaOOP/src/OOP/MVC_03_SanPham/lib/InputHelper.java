package OOP.MVC_03_SanPham.lib;

import java.util.Scanner;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);

    public static int inputNumber(String mess, String err) {
        System.out.println(mess);
        int value = 0;
        try {
            value = Integer.parseInt(sc.nextLine());
            if (value <= 0) {
                System.out.println(err);
                return inputNumber(mess, err);
            }
            return value;
        } catch (Exception e) {
            System.out.println(err);
            return inputNumber(mess, err);
        }
    }

    public static String inputString(String mes, String err, int minLeng, int maxLeng) {
        System.out.println(mes);
        try {
            String name = sc.nextLine();
            if (name.length() <= minLeng) {
                System.out.println(err);
                return inputString(mes, err, minLeng, maxLeng);
            }
            if (name.length() >= maxLeng) {
                System.out.println(err);
                return inputString(mes, err, minLeng, maxLeng);
            }
            return name;
        } catch (Exception e) {
            System.out.println(err);
            return inputString(mes, err, minLeng, maxLeng);
        }
    }
}
