public class Main {
    public static void main(String[] args) {

        User user1 = User.getInstance();
        System.out.println(user1.stampaUser());

        User user2 = User.getInstance();
        user2.setName("Mario");
        user2.setAge(19);
        System.out.println(user2.stampaUser());

    }
}