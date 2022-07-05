package itvdn_inherit_polimor_2;

public class GoodPupil extends Pupil {
    @Override
    public void study () {
        System.out.println("Studies ok");
    }
    @Override
    public  void read () {
        System.out.println("Reads on the average level");
    }
    @Override
    public void write () {
        System.out.println("Writes with some mistakes");
    }
    @Override
    public void relax () {
        System.out.println("Takes some time to relax");
    }
}
