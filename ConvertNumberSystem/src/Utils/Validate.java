package Utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {

    public String getValue(int base) {
        Pattern binary = Pattern.compile("^[0-1]+$");
        Pattern decimal = Pattern.compile("^[0-9]+$");
        Pattern hexa = Pattern.compile("^\\b[0-9A-F]+\\b$");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String value = sc.nextLine();
            switch (base) {
                case 2:
                    if (binary.matcher(value).find()) {
                        return value;
                    }
                case 16:
                    if (hexa.matcher(value).find()) {
                        return value;
                    }
                default:
                    if (decimal.matcher(value).find()) {
                        return value;
                    }
            }
            System.out.println("Value is not valid");
        }
    }

    public int getBase(String msg) {
        Pattern p = Pattern.compile("^[0-9]+$");
        while (true) {
            System.out.println(msg + " base (Example: 8 for octal,16 for hexa ,2 for binary,....): ");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            if (p.matcher(number).find()) {
                return Integer.parseInt(number);
            } else {
                System.out.println(msg + " must be a number");
            }
        }
    }

}
