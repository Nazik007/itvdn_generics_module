package GoIT4;

public class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public String getFuelType(){
        return "A500";
    }


}

class XFuelEngine extends Engine{
    public String getFuelType() {
        return "XFuel";
    }

}
