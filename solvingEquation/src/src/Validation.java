/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author emlad
 */
public class Validation {
    static Scanner sc = new Scanner(System.in);
    public static int getInt() {
        Pattern p = Pattern.compile("^[0-9]+$");
        while (true) {
            String str = sc.nextLine();
            if(p.matcher(str).find()){
                return Integer.parseInt(str);
            }
            System.out.println("Input must be a number!!!");
        }
    }
    public static int getChoice() {
        Pattern p = Pattern.compile("^[1-3]$");
        while (true) {
            String str = sc.nextLine();
            if(p.matcher(str).find()){
                return Integer.parseInt(str);
            }
            System.out.println("invalid Choice!!!");
        }
    }
}
