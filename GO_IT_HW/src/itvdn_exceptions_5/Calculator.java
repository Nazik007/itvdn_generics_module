package itvdn_exceptions_5;

public class Calculator {

    public int a;
    public int b;

    public int add (int a, int b) {
        return a + b;
    }

    public int sub (int a, int b) {
        return a - b;
    }

    public int mul (int a, int b) {
        return a * b;
    }

    public int div (int a, int b) {
        return a / b;
    }

    public void divError () {
        try {
            int b = 0;
            int c = a/b;
        } catch (Exception e){
            System.out.println("You can't divide by 0");
            e.getMessage();
        }
    }
}
