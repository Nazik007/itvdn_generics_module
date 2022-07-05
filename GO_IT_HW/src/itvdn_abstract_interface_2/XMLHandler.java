package itvdn_abstract_interface_2;

public class XMLHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("Open XML file.");
    }

    @Override
    public void create() {
        System.out.println("Create XML file.");
    }

    @Override
    public void change() {
        System.out.println("Change XML file.");
    }

    @Override
    public void save() {
        System.out.println("Save XML file.");
    }
}
