package lessons.lisson09.Homework01;

public class Fish {
    private String name;
    private int age;
    private String owner;
    public Fish(String name, int age, String owner) {
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
