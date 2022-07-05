package ITVDN_OOP4;

class Computer {

    String compt;

    public static void main(String[] args) {


        Computer[] computers = new Computer[5];
        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < computers.length; i++) {

            computers[i].compt = "kompyuter " + i;
        }

        for (Computer comp : computers) {
            System.out.println(comp.compt);
        }
    }
}
