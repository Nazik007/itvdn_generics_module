package itvdn_inherit_polimor_4;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        System.out.println("In order work with the files, the program version should be determined. Please type in the key: ");
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();

        switch (key){

            case 400:

                ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                proDocumentWorker.openDocument();
                proDocumentWorker.editDocument();
                proDocumentWorker.saveDocument();
                break;

            case 500:

                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                expertDocumentWorker.openDocument();
                expertDocumentWorker.editDocument();
                expertDocumentWorker.saveDocument();
                break;

            default:
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
                break;

        }
    }
}
