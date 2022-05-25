package GoIT4;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        int counter = count;

        String thousands = "X";
        String hundreds = "Y";
        String tens = "Z";
        String one = "*";

        int[] number = new int[] {1000, 100, 10,1};
        int[] numberCounter = new int[4];

        for (int i = 0; i < 4; i++) {
            if(counter >= number[i]){
                numberCounter[i] = counter / number [i];
                counter -= numberCounter[i] * number[i];
            }
        }

        String first = thousands.repeat(numberCounter[0]);
        String second = hundreds.repeat(numberCounter[1]);
        String third = tens.repeat(numberCounter[2]);
        String fourth = one.repeat(numberCounter[3]);
        return first + second + third + fourth;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
