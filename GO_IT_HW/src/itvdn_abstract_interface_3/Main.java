package itvdn_abstract_interface_3;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Playing process: ");
        player.play();
        player.pause();
        player.stop();
        System.out.println("--------------------");
        System.out.println("Recording process: ");
        player.record();
        player.pause();
        player.stop();


    }
}
