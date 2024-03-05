/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.ArrayList;
import src.History;
import src.Manage;
import src.Worker;

/**
 *
 * @author emlad
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
        while (true) {
            int choice = Manage.menu();
            switch (choice) {
                case 1:
                    Manage.addWorker(lw);
                    break;
                case 2:
                    Manage.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    Manage.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    Manage.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}