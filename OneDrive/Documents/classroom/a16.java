class Car {
    String model;
    int year;
    static int numberOfCars = 0;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2021);
        Car c2 = new Car("Audi", 2022);
        System.out.println("Total Cars Created: " + Car.numberOfCars);
    }
}
