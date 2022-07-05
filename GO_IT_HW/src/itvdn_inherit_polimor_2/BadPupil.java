package itvdn_inherit_polimor_2;

public class BadPupil extends Pupil {
    @Override
    public void study () {
        System.out.println("Studies the worst");
    }
    @Override
    public  void read () {
        System.out.println("Reads on below the needed level");
    }
    @Override
    public void write () {
        System.out.println("Writes with a lot of mistakes");
    }
    @Override
    public void relax () {
        System.out.println("Knows how to relax");
    }
}
