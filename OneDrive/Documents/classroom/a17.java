class Demo {
    void show() {
        int localVar = 10;
        System.out.println("Inside method: " + localVar);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        System.out.println(localVar);       }
}
