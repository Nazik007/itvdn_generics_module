package itvdn_inherit_polimor_4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        super.editDocument();
    }

    @Override
    public void saveDocument() {
        System.out.println("The document has been saved in the new format.");;
    }
}
