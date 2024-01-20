/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author emlad
 */
public class Validate {

    public String getBinary() {
        Pattern p = Pattern.compile("^[0-1]+$");
        while (true) {
            System.out.print("INPUT: ");
            Scanner sc = new Scanner(System.in);
            String binary = sc.nextLine();
            if (p.matcher(binary).find()) {
                return binary;
            } else {
                System.out.println("Input number must be in (0,1)");
            }
        }
    }

    public int getDecimal() {
        Pattern p = Pattern.compile("^[0-9]+$");
        while (true) {
            System.out.print("INPUT: ");
            Scanner sc = new Scanner(System.in);
            String decimal = sc.nextLine();
            if (p.matcher(decimal).find()) {
                return Integer.parseInt(decimal);
            } else {
                System.out.println("Input must be a number!!!");
            }
        }
    }

    public String getHexa() {
        Pattern p = Pattern.compile("^\\b[0-9A-F]+\\b$");
        while (true) {
            System.out.print("INPUT: ");
            Scanner sc = new Scanner(System.in);
            String hexa = sc.nextLine();
            if (p.matcher(hexa).find()) {
                return hexa;
            } else {
                System.out.println("Input must be hexadecimal!!!");
            }
        }
    }

    public int getChoice() {

        Pattern p = Pattern.compile("^[1-3]$");
        while (true) {
            System.out.println("Input your choice:");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            if (p.matcher(number).find()) {
                return Integer.parseInt(number);
            } else {
                System.out.println("Input must be 1, 2 or 3");
            }
        }
    }
    public String getName(int a){
        if(a==1) return "Binary";
        else if(a==2) return "Decimal";
        else return "Hexadecimal";
    }

}
