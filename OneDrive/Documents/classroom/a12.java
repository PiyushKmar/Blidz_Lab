
    class Car {
        String brand;
        int speed;
        public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.speed = 200;

        Car c2 = new Car();
        c2.brand = "Audi";
        c2.speed = 180;

        Car c3 = new Car();
        c3.brand = "Tesla";
        c3.speed = 220;

        System.out.println(c1.brand + " " + c1.speed);
        System.out.println(c2.brand + " " + c2.speed);
        System.out.println(c3.brand + " " + c3.speed);
    }
}}