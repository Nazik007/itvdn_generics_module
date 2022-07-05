package itvdn_inherit_polimor_2;

public class ExcelentPupil extends Pupil {
    @Override
    public void study () {
        System.out.println("Studies the best");}
    @Override
    public  void read () {
        System.out.println("Reads the fastest");
    }
    @Override
    public void write () {
        System.out.println("Writes with no mistakes");
    }
    @Override
    public void relax () {
        System.out.println("Don't know how to relax");
    }
}
