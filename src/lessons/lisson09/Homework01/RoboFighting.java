package lessons.lisson09.Homework01;

public class RoboFighting {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Robik", 16, 34);
        robot1.setPower(55);
        robot1.getPower();
        Robot robot2 = new Robot("Bobik", 18, 54);
        robot2.setPower(56);
        robot2.getPower();
        System.out.println(robot1.fight(robot2.getPower()));

    }
}
