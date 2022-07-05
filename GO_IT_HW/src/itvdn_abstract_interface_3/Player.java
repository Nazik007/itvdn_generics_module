package itvdn_abstract_interface_3;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Music play.");
    }

    @Override
    public void record() {
        System.out.println("Recording, wait until it's over.");
    }

    @Override
    public void pause() {
        System.out.println("Pause.");
    }

    @Override
    public void stop() {
        System.out.println("Stop.");
    }
}
