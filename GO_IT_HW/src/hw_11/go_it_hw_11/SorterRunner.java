package hw_11.go_it_hw_11;

public class SorterRunner {
    static String[] numericString = {"1, 2, 0", "4, 5"};

    public static void main(String[] args) {
        NumberSorter numberSorter = new NumberSorter();
        System.out.println(numberSorter.getSortedList(numericString));
    }
}
