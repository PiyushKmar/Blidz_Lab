class Car {
    String brand;
    int speed;
    static int wheels = 4;
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.speed = 200;

        Car c2 = new Car();
        c2.brand = "Audi";
        c2.speed = 180;
        c1.wheels = 6;


        System.out.println(c1.brand + " Wheels: " + c1.wheels);
        System.out.println(c2.brand + " Wheels: " + c2.wheels);
    }
}

