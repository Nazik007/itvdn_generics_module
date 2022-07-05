package homework4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Давай перекладем декілька слів на англ мову.\nБудь - ласка введи слово: ");
        String line = scan.next();

        switch (line){
            case "awesome":
                System.out.println("класний");
                break;

            case "big":
                System.out.println("великий");
                break;

            case "angel":
                System.out.println("янгол");
                break;

            case "infinity":
                System.out.println("вічність");
                break;

            case "door":
                System.out.println("двері");
                break;

            case "land":
                System.out.println("земля");
                break;

            case "winter":
                System.out.println("зима");
                break;

            case "interesting":
                System.out.println("цікавий");
                break;

            case "hate":
                System.out.println("ненависть");
                break;

            case "head":
                System.out.println("голова");
                break;

            default:
                System.out.println("Я ще мала програма і не можу знати багато слів, йди в Google translator : )");
        }

    }
}
