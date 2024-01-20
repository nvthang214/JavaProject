
package Controller;


public class Option {

    public void menu() {
        System.out.println("[1] Binary");
        System.out.println("[2] Decimal");
        System.out.println("[3] Hexadecimal");
    }

    public int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public String binaryToHexa(String binary) {
        return Integer.toHexString(Integer.parseInt(binary, 2)).toUpperCase();
    }

    public String decimalToHexa(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public int hexaToDecimal(String hexa) {
        return Integer.parseInt(hexa, 16);
    }

    public String hexaToBinary(String hexa) {
        return Integer.toBinaryString(Integer.parseInt(hexa, 16));
    }

}
