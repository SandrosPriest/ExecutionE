package lessons.lisson09.Homework01;

public class Marriage {
    public static void main(String[] args) {
        WomanWife womanWife = new WomanWife("Inna", 46, "Any");
        womanWife.setHusband("Sandros");
        Man man = new Man("Sandros", 46, "Any");
        man.setWife("Inna");
        System.out.println(womanWife.getHusband() + " and " + man.getWife() + " are declared as husband and wife!");
    }
}
