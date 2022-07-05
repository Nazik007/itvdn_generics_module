package ITVD_OOP_3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Title title = new Title();
        System.out.println("Введіть назву книги: ");
        title.setTitle(scan.nextLine());
        System.out.println("Введіть автора книги: ");
        Author author = new Author();
        author.setAuthor(scan.nextLine());
        System.out.println("Введіть зміст книги: ");
        Content content = new Content();
        content.setContent(scan.nextLine());

        System.out.println("Ваша книга: ");
        title.show();
        author.show();
        content.show();




    }
}
