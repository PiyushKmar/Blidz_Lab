class Test {
    static int value;

    static {
        value = 42;
        System.out.println("Static block executed!");
    }

    public static void main(String[] args) {
        System.out.println("Value: " + value);
    }
}
