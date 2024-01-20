package validation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author emlad
 */
public class Validation {
    public int Valid(String msg){
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử của mảng từ người dùng
        String a;
        int n = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print(msg);
                a = sc.nextLine();
                for (int i = 0; i < a.length(); i++) {
                    char currentChar = a.charAt(i);
                    if(!Character.isDigit(currentChar)){
                        isValidInput = false;
                        break;
                    }else{
                        isValidInput = true;
                    }
                }
                n = Integer.parseInt(a);
                if(n<0) {
                    isValidInput = false;
                    System.out.println("Please enter a number!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!!!");
                
            }
        }
        return n;
    }
}
