package goit.hw5;

class BfgTest {
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

    }
}

class BFG {
    private int ammo;
    private int damage;
    private String name;

    public int getAmmo() {
        return ammo;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
    BFG(int ammo, int damage, String name) {
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }

    BFG(int ammo, int damage) {
        this(ammo, damage, "BFG");
    }
    BFG(int ammo) {
        this(ammo, 50, "BFG");
    }
    BFG() {
        this(1000, 50,"BFG");
    }

    @Override
    public String toString() {
        return name + ", ammo: " + ammo + ", damage: " + damage;
    }
}
