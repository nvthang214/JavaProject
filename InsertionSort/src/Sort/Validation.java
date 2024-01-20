/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author emlad
 */
public class Validation {

    public int Valid(String msg) {
        Scanner sc = new Scanner(System.in);
        

        Pattern p = Pattern.compile("^[0-9]+$");
        while (true) {
            System.out.println(msg);
            String number = sc.nextLine();
            if (p.matcher(number).find()) {
                return Integer.parseInt(number);
            } else {
                System.out.println("Please input number!!!");
            }
        }
    }
}
