package itvdn_inherit_polimor_6;

public class PrinterGreen extends Printer {
    public  static final String value_green = "\u001B[32m";

    @Override
    public void print(String value) {
        super.print(value_green + value);
    }
}
