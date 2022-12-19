package lessons.lesson11.Homework;

public class Objects {
    private boolean male;
    private boolean female;

    public static void main(String[] args) {
        Human human1 = new Human("Viktor", true, 70, "James", "Tatiana");
        Human human2 = new Human("Elizabeth", false, 69, "Vitaly", "Hope");
        Human human3 = new Human("Vladimir", true, 78, "Alexey", "Vera");
        Human human4 = new Human("Katrine", false, 77, "John", "Tania");
        Human human5 = new Human("Sandros", true, 46, "Viktor", "Elizabeth");
        Human human6 = new Human("Inna", false, 46, "Vladimir", "Katrine");
        Human human7 = new Human("Nikita", true, 22, "Sandros", "Inna");
        Human human8 = new Human("Mira", false, 14, "Sandros", "Inna");
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
    }
}
