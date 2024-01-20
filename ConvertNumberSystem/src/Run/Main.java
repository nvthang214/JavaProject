/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

/**
 *
 * @author emlad
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Chọn loại số bạn muốn chuyển đổi:");
//        System.out.println("1. Binary to Decimal");
//        System.out.println("2. Decimal to Hexadecimal");
//
//        int choice = scanner.nextInt();
//
//        switch (choice) {
//            case 1:
//                System.out.print("Nhập số nhị phân: ");
//                String binaryInput = scanner.next();
//                int decimalResult = binaryToDecimal(binaryInput);
//                System.out.println("Kết quả chuyển đổi: " + decimalResult);
//                break;
//
//            case 2:
//                System.out.print("Nhập số thập phân: ");
//                int decimalInput = scanner.nextInt();
//                String hexResult = decimalToHexadecimal(decimalInput);
//                System.out.println("Kết quả chuyển đổi: " + hexResult);
//                break;
//
//            default:
//                System.out.println("Lựa chọn không hợp lệ.");
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
    }

    private static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    private static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }
}
