/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author emlad
 */
public class Controller {

    Scanner sc = new Scanner(System.in);

    public String getEmail(String msg) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]+)$");
        while (true) {
            System.out.print(msg);
            String email = sc.nextLine();
            if (p.matcher(email).find()) {
                return email;
            }
            System.err.println("Invalid email");
        }

    }

    public String getPhone(String msg) {
        Pattern number = Pattern.compile("^[0-9]+$");
        Pattern leng = Pattern.compile("^[0-9]{10}$");
        while (true) {
            System.out.print(msg);
            String phone = sc.nextLine();
            if (number.matcher(phone).find()) {
                if (leng.matcher(phone).find()) {
                    return phone;
                } else {
                    System.err.println("Phone must be 10 digit");
                }
            } else {
                System.err.println("Phone must be number");
            }

        }
    }
    
}
