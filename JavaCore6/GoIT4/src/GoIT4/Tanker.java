public class Tanker {

    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    protected String getFuelType(){
        return "A500";
    }

    public void refuel(int amount) {
        if (amount > 0) {
            System.out.println("Add " + amount + " of " + getFuelType() + ", " + "tanker serial number is " + serialNumber);
        }
    }
        public static void main(String[] args) {
            Tanker tanker = new Tanker();
            tanker.setSerialNumber("SN504030");
            tanker.refuel(300);


        }


    }


    class XFuelTanker extends Tanker{
        protected String getFuelType(){
            return "XFuel";
        }
    }

    class MX200Tanker extends XFuelTanker{
        protected String getFuelType(){
            return "MX200";
        }
    }