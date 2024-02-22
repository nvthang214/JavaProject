/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import Validation.Validation;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author emlad
 */
public class Main {

    static Validation v = new Validation();

    public static void main(String[] args) {
        display();
    }

    public static void display() {
        Locale vietnamese = new Locale("vi");
        Locale english = new Locale("en");
        System.out.println("-------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.println("Please choice one option:");

        int choice = v.checkChoie(english);
        switch (choice) {
            case 1:
                Login(vietnamese);
                break;
            case 2:
                Login(english);
                break;
            case 3:
                System.exit(0);
        }

    }

    public static void Login(Locale lang) {
        v.getWordLanguage(lang, "enterAccountNumber");
        v.checkAccountNumber(lang);
        v.getWordLanguage(lang, "enterPassword");
        v.checkPassword(lang);
        String capcha = v.generateCaptcha();
        System.out.println("Capcha: " + capcha);
        v.getWordLanguage(lang, "enterCaptcha");
        v.checkCapcha(lang, capcha);
        v.getWordLanguage(lang, "loginSuccess");
    }
}
