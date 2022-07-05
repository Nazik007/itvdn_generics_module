package exception_lesson;

public class Test1 {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try{
            a = a / (2 - n);
            System.out.println("a = " + a);
        }catch (Exception e){
            System.out.println("Working the exeption");
            System.out.println(e.getMessage());
        }
    }
}
