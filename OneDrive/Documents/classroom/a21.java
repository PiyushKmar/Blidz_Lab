class Test {
    final int x = 100;

    public static void main(String[] args) {
        Test t = new Test();
        // t.x = 200; // ❌ ERROR: cannot assign a value to final variable
        System.out.println("x = " + t.x);
    }
}
