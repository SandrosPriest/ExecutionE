package lessons.lisson09.Homework01;

public class Dog {
    private String name;
    private int age;
    private String owner;
    public Dog(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getOwner() {
        return owner;
    }
}
