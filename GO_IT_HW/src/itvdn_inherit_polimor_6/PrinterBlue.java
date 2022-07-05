package itvdn_inherit_polimor_6;

public class PrinterBlue extends Printer {
    public  static final String value_blue = "\u001B[34m";

    @Override
    public void print(String value) {
        super.print(value_blue + value);
    }
}
