class Test {
    static int count = 0;
}

class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.count = 5; 
        System.out.println("From t2: " + t2.count); 
    }
}
