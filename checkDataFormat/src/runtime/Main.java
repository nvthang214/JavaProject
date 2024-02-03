/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import data.Controller;

/**
 *
 * @author emlad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller c = new Controller();
        String email = c.getEmail("Enter email       : ");
        String phone = c.getPhone("Enter Phone number: ");
        System.out.println("___________________________");
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

}
