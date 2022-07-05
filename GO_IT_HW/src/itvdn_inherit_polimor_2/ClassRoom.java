package itvdn_inherit_polimor_2;

public class ClassRoom {
    public static void main(String[] args) {

        Pupil p1 = new ExcelentPupil();
        Pupil p2 = new GoodPupil();
        Pupil p3 = new BadPupil();

        System.out.println("Exellent Pupil: ");
        p1.study();
        p1.read();
        p1.write();
        p1.relax();
        System.out.println("------------");
        System.out.println("Good Pupil: ");
        p2.study();
        p2.read();
        p2.write();
        p2.relax();
        System.out.println("------------");
        System.out.println("Bad Pupil: ");
        p3.study();
        p3.read();
        p3.write();
        p3.relax();
    }
}
