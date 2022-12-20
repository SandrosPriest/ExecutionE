package lessons.lesson11;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alex", 46);
        User user1 = new User("Inna", 35);
        System.out.println(user.toString());
        System.out.println(user1.toString());
        System.out.println(user.equals(user));
        System.out.println();
    }
}
