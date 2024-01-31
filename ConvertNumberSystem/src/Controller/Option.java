package Controller;

public class Option {

    public String decimalToAny(int decimal, int base) {
        StringBuilder any = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % base;
            char anyDigit = (char) (remainder < 10 ? remainder + '0' : remainder + 'A' - 10);
            any.insert(0, anyDigit);
            decimal /= base;
        }
        return any.toString();
    }

    public int anyToDecimal(String any, int base) {
        int decimal = 0;
        for (int i = any.length() - 1; i >= 0; i--) {
            char anyDigit = any.charAt(i);
            int digitValue = Character.isDigit(anyDigit) ? anyDigit - '0' : anyDigit - 'A' + 10;
            decimal += digitValue * Math.pow(base, any.length() - 1 - i);
        }
        return decimal;
    }

}
