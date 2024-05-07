package OOP.MVC_01_SoHoc.lib;

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

}
