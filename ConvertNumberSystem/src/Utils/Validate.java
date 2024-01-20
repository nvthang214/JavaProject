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
    public String getBinaryNumber(String binary){
        Pattern p = Pattern.compile("^[0-1]+$");
        while(true){
            if(p.matcher(binary).find()){
                return binary;
            }else{
                System.out.println("Input number must be in (0,1)");
            }
        }
    }
    public int getChoice(){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        Pattern p = Pattern.compile("^[1-4]$");
        while(true){
            if(p.matcher(number).find()){
                return Integer.parseInt(number);
            }else{
                System.out.println("Input number must be in (0,1)");
            }
        }
    }
    public int getDecimal(){
        
    }
}
