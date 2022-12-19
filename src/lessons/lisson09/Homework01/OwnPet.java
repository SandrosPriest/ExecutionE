package lessons.lisson09.Homework01;

public class OwnPet {
    public static void main(String[] args) {
        Woman girl = new Woman("Inna", 46);
        girl.getName();
        Dog dog = new Dog("Sky", 3, "Any" );
        dog.setOwner(girl.getName());
        Fish fish = new Fish("Sard", 1, "Any");
        fish.setOwner(girl.getName());
        Cat cat = new Cat("Chips", 2, "Any");
        cat.setOwner(girl.getName());
        System.out.println(dog.getOwner());
        System.out.println(fish.getOwner());
        System.out.println(cat.getOwner());
    }
}
