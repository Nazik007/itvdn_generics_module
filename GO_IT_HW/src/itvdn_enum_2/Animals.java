package itvdn_enum_2;

public enum Animals {
    DOG (5) {
        public int getAge() {
            return this.age;
        }
    }, CAT (3) {
        public int getAge() {
            return this.age;
        }
    }, PIG (2) {
        public int getAge() {
            return this.age;
        }
    };
    int age;

    Animals(int age) {
        this.age = age;
    }

    public abstract int getAge();

    @Override
    public String toString() {
        return "Animal: " + super.toString() + ", age: " + age;
    }
}

class Main {
    public static void main(String[] args) {
        Animals dog = Animals.DOG;
        Animals cat = Animals.CAT;
        Animals pig = Animals.PIG;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(pig);
    }
}
