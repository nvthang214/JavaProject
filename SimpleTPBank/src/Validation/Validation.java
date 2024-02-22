/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author emlad
 */
public class Validation {

    // account 
    public void checkAccountNumber(Locale lang) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(str.length());
            Pattern number = Pattern.compile("^[0-9]{10}$");
            if (number.matcher(str).find()) {
                break;
            }
            getWordLanguage(lang, "invalidAccountNumber");
        }
    }

    // password 
    public void checkPassword(Locale lang) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            Pattern length = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9]).{8,31}$");
            if (length.matcher(str).find()) {
                
                    break;
                
                
            } 
                getWordLanguage(lang, "invalidPasswordLength");
            
        }
    }

    // check alphanumeric
    public boolean checkAlphanumeric(Locale lang, String str) {
        Pattern length = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d).+$");
        if (length.matcher(str).find()) {
            return true;
        }
        getWordLanguage(lang, "invalidAlphanumeric");
        return false;
    }

    public int checkChoie(Locale lang) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            Pattern p = Pattern.compile("^[1-3]$");
            if (p.matcher(str).find()) {
                return Integer.parseInt(str);
            }
            getWordLanguage(lang, "invalidChoice");
        }
    }

    public void checkCapcha(Locale lang, String capcha) {
        Scanner sc = new Scanner(System.in);
        while (!sc.nextLine().equals(capcha)) {
            getWordLanguage(lang, "invalidCapcha");
        }
    }

    public void getWordLanguage(Locale curLocate, String key) {
        ResourceBundle words
                = ResourceBundle.getBundle("Language/" + curLocate, curLocate);
        String value = words.getString(key);
        System.out.println(value);
    }

    public String generateCaptcha() {
        String CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(CHAR.length());
            captcha.append(CHAR.charAt(index));
        }
        return captcha.toString();
    }
}
