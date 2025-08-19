class Demo {
    int value = 50;

    void show() {
        int value = 20;
        System.out.println("Local: " + value);
        System.out.println("Instance: " + this.value);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
