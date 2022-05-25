package GoIT4;

public class SpaceportMessages {
    public static String generateLandingMessage(String shipName, String spaceport, String time){
        return "Spaceship " + shipName + "landing at " + spaceport + ", " + "time is " + time;
    }

    public static void main(String[] args) {
        SpaceportMessages spaceportMessages = new SpaceportMessages();
        System.out.println(SpaceportMessages.generateLandingMessage("Sunflower","EarthKeeper","20:40"));
    }
}
