package exception_lesson;

public class MyClass {
    public void myMethod () throws Exception {
        Exception exception = new Exception("My exception");
        throw exception;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            instance.myMethod();
        }catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack trace: ");
            e.printStackTrace();
        }
    }
}