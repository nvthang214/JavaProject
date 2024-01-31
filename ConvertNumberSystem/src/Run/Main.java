
package Run;

import Controller.Option;
import Utils.Validate;


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
        
    }
}
