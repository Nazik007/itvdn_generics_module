package GoIT4;

public class SpaceRocketLauncher {

    private int bigRocketCount;
    private int smallRocketCount;



    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (!(bigRocketCount > 0) && !(bigRocketCount > 100))
            this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if(!(smallRocketCount > 0) && !(smallRocketCount > 100))
        this.smallRocketCount = smallRocketCount;
    }

    public void launchBigRocket(){
        if(getBigRocketCount() > 0 ){
            setBigRocketCount(getBigRocketCount() - 1);
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallRocket() {
        if (getSmallRocketCount() > 0) {
            setSmallRocketCount(getSmallRocketCount() - 1);
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower(){
        int totalPower = 0;
        totalPower = (getBigRocketCount() * 100) + (getSmallRocketCount() * 50);
        return totalPower;
    }


    public static void main(String[] args) {
        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

//        laucnher.launchSmallRocket();
//        System.out.println("Small rocket count is " + laucnher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());
    }

}
