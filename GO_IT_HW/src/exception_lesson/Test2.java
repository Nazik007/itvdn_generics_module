package exception_lesson;

public class Test2 {


    public static void main(String[] args) {

        Exception ex = new Exception("My exeption");

        try{
            throw ex;
        }catch (Exception e){
            System.out.println("Working the exeption");
            System.out.println(e.getMessage());
        }
    }
}
