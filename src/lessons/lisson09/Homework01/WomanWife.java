package lessons.lisson09.Homework01;

public class WomanWife {
    private String name;
    private int age;
    private String husband;
    public WomanWife(String name, int age, String husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }
    public void setHusband(String husband) {
        this.husband = husband;
    }
    public String getHusband() {
        return husband;
    }
}
