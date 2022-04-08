class ProfessorHelper {

    //Test output

    public boolean areNumbersCool(int number1, int number2){
        return number1 == number2;

    }
    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3)); //Should be true
    }
}
