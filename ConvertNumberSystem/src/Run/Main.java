package Run;

import Controller.Option;
import Utils.Validate;

public class Main {

    public static void main(String[] args) {

        Option o = new Option();
        Validate v = new Validate();

        int input = v.getBase("Input");
        String value = v.getValue(input);
        int output = v.getBase("Output");
        
        System.out.println("________After convert________");
        System.out.println("Input Value: " + value);
        if (output == 10) {
            System.out.println("Output value: " + o.anyToDecimal(value, input));
        } else {
            int decimal = o.anyToDecimal(value, input);
            System.out.println("Output value: " + o.decimalToAny(decimal, output));
        }

//        ---------------------------------------------------------
    }
}
