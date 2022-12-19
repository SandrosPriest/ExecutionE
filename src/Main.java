import lessons.lisson09.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(25, "Alex","pas");
        System.out.println(user.getName());
        user.setName("Inna");
        System.out.println(user.getName());

        User user1 = new User(25, "Alex1");
        System.out.println(user1.getName());

        User user2 = new User();
        System.out.println(user2.getName());
        System.out.println(user2.getAge());
    }
}
