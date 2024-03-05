/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author emlad
 */
public class Validation {

    private final static Scanner in = new Scanner(System.in);

    public static String input(String regex, String errMsg) {
        Pattern p = Pattern.compile(regex);
        while (true) {
            String str = in.nextLine();
            if (p.matcher(str).find()) {
                return str;
            }
            System.out.println(errMsg);
        }
    }

    public static String input(String regex, String errMsg, int start, int end) {
        Pattern p = Pattern.compile(regex);
        while (true) {
            String str = in.nextLine();
            if (p.matcher(str).find() && Integer.parseInt(str) >= start && Integer.parseInt(str) <= end) {
                return str;
            }
            System.out.println(errMsg);
        }
    }

    public static boolean checkIdExist(ArrayList<Worker> lw, String id) {
        return lw.stream().anyMatch((worker) -> (id.equalsIgnoreCase(worker.getId())));
    }

    public static int inSalary() {
        while (true) {
            int salary = Integer.parseInt(input("^[0-9]+$", "Salary must be a number!!!"));
            if (salary > 0) {
                return salary;
            }
            System.out.println("Salary must greater than 0");
        }
    }

    public static Worker getWorkerByCode(ArrayList<Worker> lw, String id) {
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return worker;
            }
        }
        return null;
    }

    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

}
