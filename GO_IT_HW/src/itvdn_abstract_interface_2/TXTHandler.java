package itvdn_abstract_interface_2;

public class TXTHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("Open TXT file.");
    }

    @Override
    public void create() {
        System.out.println("Create TXT file.");
    }

    @Override
    public void change() {
        System.out.println("Change TXT file.");
    }

    @Override
    public void save() {
        System.out.println("Save TXT file.");
    }
}
