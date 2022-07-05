package itvdn_inherit_polimor_4;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        System.out.println("The document has been edited.");;
    }

    @Override
    public void saveDocument() {
        System.out.println("The document has been saved in the old format, as saving in the new formats is avaliable in the Expert version.");;
    }
}
