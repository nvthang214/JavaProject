/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author emlad
 */
public class Manage {

    public static int menu() {
        System.out.println("==========================================");
        System.out.println("1. Add worker.");
        System.out.println("2. Increase salary for worker.");
        System.out.println("3. Decrease for worker");
        System.out.println("4. Show adjusted salary worker information");
        System.out.println("5. Exist");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(Validation.input("^[1-5]$", "Invalid choice!"));
        return choice;
    }

    public static void addWorker(ArrayList<Worker> lw) {
        System.out.print("Enter ID(ex: SE1234): ");
        String id = Validation.input("^[A-Z]{2}[0-9]{4}$", "Invalid ID!");
        if (!Validation.checkIdExist(lw, id)) {
            System.out.print("Enter name: ");
            String name = Validation.input("^.+$", "Invalid name!");

            System.out.print("Enter age: ");
            int age = Integer.parseInt(Validation.input("^[0-9]+$", "Age must be in [18,50]!", 18, 50));
            System.out.print("Enter salary: ");
            int salary = Validation.inSalary();
            System.out.print("Enter work location: ");
            String workLocation = Validation.input("^.+$", "Invalid location!");
            lw.add(new Worker(id, name, age, salary, workLocation));
            System.out.println("Add success.....!");
        } else {
            System.err.println("ID has been exist.");
        }
    }

    public static void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        if (lw.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.print("Enter ID(ex: SE1234): ");
        String id = Validation.input("^[A-Z]{2}[0-9]{4}$", "Invalid ID!");
        Worker worker = Validation.getWorkerByCode(lw, id);
        if (worker == null) {
            System.err.println("Worker doesn't exist.");
        } else {
            int salaryCurrent = worker.getSalary();
            int salaryUpdate;
            //check user want to update salary
            if (status == 1) {
                System.out.print("Enter salary: ");
                //loop until user input salary update > salary current
                while (true) {
                    salaryUpdate = Validation.inSalary();
                    //check user input salary update > salary current
                    if (salaryUpdate <= salaryCurrent) {
                        System.err.println("Must be greater than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }
                lh.add(new History("UP", Validation.getCurrentDate(), worker.getId(),
                        worker.getName(), worker.getAge(), salaryUpdate,
                        worker.getWorkLocation()));
            } else {
                System.out.print("Enter salary: ");
                //loop until user input salary update < salary current
                while (true) {
                    salaryUpdate = Validation.inSalary();
                    //check user input salary update < salary current
                    if (salaryUpdate >= salaryCurrent) {
                        System.err.println("Must be smaller than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }
                lh.add(new History("DOWN", Validation.getCurrentDate(), worker.getId(),
                        worker.getName(), worker.getAge(), salaryUpdate,
                        worker.getWorkLocation()));
            }
            worker.setSalary(salaryUpdate);
            System.out.println("Update success.....!");
        }
    }

    public static void printListHistory(ArrayList<History> lh) {
        if (lh.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.println("===========================================================");
        System.out.printf("%-8s%-15s%-5s%-10s%-10s%-20s\n", "ID", "Name", "Age",
                "Salary", "Status", "Date");
        Collections.sort(lh);
        lh.forEach((history) -> {
            printHistory(history);
        });
    }

    public static void printHistory(History history) {
        System.out.printf("%-8s%-15s%-5d%-10d%-10s%-20s\n", history.getId(),
                history.getName(), history.getAge(), history.getSalary(),
                history.getStatus(), history.getDate());
    }

}
