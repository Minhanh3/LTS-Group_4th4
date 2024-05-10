package OOP.KiemTra.lib;

import java.util.Scanner;

public class InputHelper {

    private static Scanner sc = new Scanner(System.in);

    public static int inputNumber(String mess, String err) {
        System.out.println(mess);
        int value = 0;
        try {
            value = Integer.parseInt(sc.nextLine());
            return value;
        } catch (Exception e) {
            System.out.println(err);
            return inputNumber(mess, err);
        }
    }

    public static String inputName(String mess, String err, int minLeng, int maxLeng) {
        System.out.println(mess);
        String name = sc.nextLine();
        try {
            if (name.length() < minLeng) {
                System.out.println("Ten kh duoc duoi" + minLeng);
                return inputName(mess, err, minLeng, maxLeng);
            }
            if (name.length() > maxLeng) {
                System.out.println("Ten kh duoc qua" + maxLeng);
                return inputName(mess, err, minLeng, maxLeng);
            }
            return name;
        } catch (Exception e) {
            System.out.println(err);
            return inputName(mess, err, minLeng, maxLeng);
        }
    }


}
