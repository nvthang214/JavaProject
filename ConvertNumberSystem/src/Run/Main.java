package Run;

import Controller.Option;
import Utils.Validate;

public class Main {

    public static void main(String[] args) {

        Option o = new Option();
        Validate v = new Validate();
        
        int input = v.getBase("Input");
        String value = v.getValue(input);
        
//        ---------------------------------------------------------

    }
}
