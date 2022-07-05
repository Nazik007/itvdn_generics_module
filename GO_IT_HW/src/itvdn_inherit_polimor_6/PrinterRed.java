package itvdn_inherit_polimor_6;

public class PrinterRed extends Printer {
    public  static final String value_red = "\u001B[31m";

    @Override
    public void print(String value) {
        super.print(value_red + value);
    }
}
