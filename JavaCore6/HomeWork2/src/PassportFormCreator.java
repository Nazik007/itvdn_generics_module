import java.util.Scanner;

public class PassportFormCreator {
    public void createForms(){
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println(firstName + " " + secondName + " " + (age * 10));
        System.out.println(firstName.toUpperCase());
        System.out.println(secondName.toUpperCase());
        System.out.println(age * 10);

        scanner.close();
    }

    public static void main(String[] args) {

        new PassportFormCreator().createForms();

    }
}
