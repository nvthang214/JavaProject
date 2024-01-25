package Controller;

public class Option {

    public void menu() {
        System.out.println("[1] Binary");
        System.out.println("[2] Decimal");
        System.out.println("[3] Hexadecimal");
    }

    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public String decimalToHexa(int decimal) {
        StringBuilder hexa = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexDigit = (char) (remainder < 10 ? remainder + '0' : remainder + 'A' - 10);
            hexa.insert(0, hexDigit);
            decimal /= 16;
        }
        return hexa.toString();
    }

    public String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }

    public int hexaToDecimal(String hexa) {
        int decimal = 0;
        for (int i = hexa.length() - 1; i >= 0; i--) {
            char hexDigit = hexa.charAt(i);
            int digitValue = Character.isDigit(hexDigit) ? hexDigit - '0' : hexDigit - 'A' + 10;
            decimal += digitValue * Math.pow(16, hexa.length() - 1 - i);
        }
        return decimal;
    }

    public String binaryToHexa(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToHexa(decimal);
    }

    public String hexaToBinary(String hexa) {
        int decimal = hexaToDecimal(hexa);
        return decimalToBinary(decimal);
    }
}
