package lessons.lisson09.Homework01;

public class Man {
    private String name;
    private int age;
    private String wife;
    public Man(String name, int age, String wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;
    }
    public void setWife(String wife) {
        this.wife = wife;
    }
    public String getWife() {
        return wife;
    }
}
