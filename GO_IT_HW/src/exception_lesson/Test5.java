package exception_lesson;


class UserException extends Exception {
    public void method () {
        System.out.println("My exception");
    }
}


public class Test5 {
    public static void main(String[] args) {
        try {
            throw new UserException();
        }catch (UserException e){
            System.out.println("Working through the exception");
            e.method();
        }
    }
}
