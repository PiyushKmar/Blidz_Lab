class User {
    final int userId;

    User(int id) {
        this.userId = id;
    }

    public static void main(String[] args) {
        User u = new User(101);
        System.out.println("User ID: " + u.userId);
    }
}
