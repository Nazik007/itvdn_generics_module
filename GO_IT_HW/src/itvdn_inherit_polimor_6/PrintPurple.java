package itvdn_inherit_polimor_6;

public class PrintPurple extends Printer {
    public  static final String value_purple = "\u001B[35m";

    @Override
    public void print(String value) {
        super.print(value_purple + value);
    }
}
