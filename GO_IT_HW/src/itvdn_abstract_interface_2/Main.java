package itvdn_abstract_interface_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String docFormat;
        Scanner in = new Scanner(System.in);
        System.out.println("Please, type the document format you will work with: ");
        docFormat = in.next();

        switch (docFormat) {
            case "doc":
                AbstractHandler doc = new DOCHandler();
                doc.open();
                doc.create();
                doc.change();
                doc.save();
                break;

            case "txt":
                AbstractHandler txt = new TXTHandler();
                txt.open();
                txt.create();
                txt.change();
                txt.save();
                break;

            case "xml":
                AbstractHandler xml = new XMLHandler();
                xml.open();
                xml.create();
                xml.change();
                xml.save();
                break;

            default:
                System.out.println("Invalid data input!");

        }
    }
}
