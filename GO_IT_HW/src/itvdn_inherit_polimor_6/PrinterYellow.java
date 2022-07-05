package itvdn_inherit_polimor_6;

public class PrinterYellow extends Printer{
    public  static final String value_yellow = "\u001B[33m";

    @Override
    public void print(String value) {
        super.print(value_yellow + value);
    }
}
