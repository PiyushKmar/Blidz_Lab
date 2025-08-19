class Test {
    int value;

    void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.setValue(100);
        System.out.println("Value: " + t.value);
    }
}
