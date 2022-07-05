package itvdn_abstract_interface_2;

public class DOCHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("Open DOC file.");
    }

    @Override
    public void create() {
        System.out.println("Create DOC file.");
    }

    @Override
    public void change() {
        System.out.println("Change DOC file.");
    }

    @Override
    public void save() {
        System.out.println("Save DOC file.");
    }

}
