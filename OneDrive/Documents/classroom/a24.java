class Variables {
    int instanceVar = 10;
    static int staticVar = 20;

    void display() {
        int localVar = 30;
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
        System.out.println("Local: " + localVar);
    }

    public static void main(String[] args) {
        new Variables().display();
    }
}
