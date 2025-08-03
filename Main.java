public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        SurgeonFish surgeonFish = new SurgeonFish();
        FlyingShark flyingShark = new FlyingShark();
        Insect insect = new Insect();

        // Dynamic polymorphism (overriding)
        Fish fish1 = shark;
        Fish fish2 = surgeonFish;

        fish1.swim();  // Shark swim
        fish2.swim();  // SurgeonFish swim

        // Static polymorphism (overloading)
        flyingShark.eat(surgeonFish); // eat(Fish)
        flyingShark.eat(insect);      // eat(Flyable)

        // Flyable interface
        Flyable flyer = flyingShark;
        flyer.fly();
        flyer.glide();

        // Shark eats
        shark.eat(surgeonFish);       // Shark eats SurgeonFish
        shark.eat(new Shark());       // Shark eats another Shark
    }
}
