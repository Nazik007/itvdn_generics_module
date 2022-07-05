package exception_lesson;

class UserException1 extends Exception {
    public void method () {
        System.out.println("My exception");
    }
}


public class Test6 {
    public static void main(String[] args) {
        try {
            throw new UserException1();
        }catch (UserException1 userException1){
            System.out.println("Working on exception 1");
            userException1.method();

//            try {
//                throw UserException1;
//            }catch (UserException1 exception1){
//                System.out.println("Working on exception 2");
//                userException1.method();
//            }
//            finally {
//                System.out.println(" Finally block");
//            }
            System.out.println("End of the code");
        }
    }
}
