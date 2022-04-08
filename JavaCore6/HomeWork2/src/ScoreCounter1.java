public class ScoreCounter1 {
    public int addScore(int currentScore, int amount) {
        currentScore += amount;
        return currentScore;
    }

    //Expected output
    public int twiceScore(int currentScore){
        return currentScore *=2;

    }

    public static void main(String[] args) {
        ScoreCounter counter = new ScoreCounter();
        System.out.println("addScore(10, 5) = " + counter.addScore(10, 5)); //Should be 15
        System.out.println("twiceScore(7) = " + counter.twiceScore(7)); //Should be 14
    }
}
