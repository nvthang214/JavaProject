/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Controller.Option;
import Utils.Validate;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author emlad
 */
public class Main {

    public static void main(String[] args) {

        Option o = new Option();
        Validate v = new Validate();
        System.out.println("------INPUT------");
        o.menu();
        int input = v.getChoice();

        System.out.println("------OUTPUT------");
        o.menu();
        int output = v.getChoice();
        System.out.println("_____" + v.getName(input) + "  TO  "
                + v.getName(output) + "_____");
//        ---------------------------------------------------------
        switch (input) {
            case 1:
                switch (output) {
                    case 1:
                        System.out.println("OUTPUT: " + v.getBinary());
                        break;
                    case 2:
                        System.out.println("OUTPUT: " + o.binaryToDecimal(v.getBinary()));
                        break;
                    case 3:
                        System.out.println("OUTPUT: " + o.binaryToHexa(v.getBinary()));
                        break;
                }
                break;
            case 2:
                switch (output) {
                    case 1:
                        System.out.println("OUTPUT: " + o.decimalToBinary(v.getDecimal()));
                        break;
                    case 2:
                        System.out.println("OUTPUT: " + v.getDecimal());
                        break;
                    case 3:
                        System.out.println("OUTPUT: " + o.decimalToHexa(v.getDecimal()));
                        break;
                }
                break;
            case 3:
                switch (output) {
                    case 1:
                        System.out.println("OUTPUT: " + o.hexaToBinary(v.getHexa()));
                        break;
                    case 2:
                        System.out.println("OUTPUT: " + o.hexaToDecimal(v.getHexa()));
                        break;
                    case 3:
                        System.out.println("OUTPUT: " + v.getHexa());
                        break;
                }
                break;
        }
    }
}
