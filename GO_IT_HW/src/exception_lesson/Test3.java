package exception_lesson;

public class Test3 {
    public static void main(String[] args) {
        try{
            throw new Exception("My exception");
        } catch (Exception e) {
            System.out.println("Working the exception");
            System.out.println(e.getMessage());
        }
    }
}
