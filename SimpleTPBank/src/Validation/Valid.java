/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.regex.Pattern;

/**
 *
 * @author emlad
 */
public class Valid {

    public boolean checkNumber(String str) {
        Pattern number = Pattern.compile("^[0-9]+$");
        if(number.matcher(str).find()){
            return true;
        }
        return false;
    }
    public boolean checkLength(String str){
        
        Pattern length = Pattern.compile("^{10}$");
        if(length.matcher(str).find()){
            return true;
        } 
        return false;
    }
    public boolean checkChoie(String str){
        Pattern p = Pattern.compile("^[1-3]$");
        if(p.matcher(str).find()){
            return true;
        }
        return false;
    }
}
