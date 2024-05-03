package OOP.OOP_MVC.lib;

import java.util.Scanner;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);

    public static int inputHelper(String mes, String error) {
        System.out.println(mes);
        int value = 0;
        try {
            value = Integer.parseInt(sc.nextLine());
            return value;
        } catch (Exception e) {
            System.out.println(error);
            return inputHelper(mes, error);
        }
    }

    public static String StringHelper(String mes, String error, int minLength, int maxLength) {
        System.out.println(mes);
        String output = sc.nextLine();
        if (output.trim().length() <= minLength) {
            System.out.println(error);
            return StringHelper(mes, error, minLength, maxLength);
        }
        if (output.trim().length() >= maxLength) {
            System.out.println(error);
            return StringHelper(mes, error, minLength, maxLength);
        }
        return output;
    }
}
