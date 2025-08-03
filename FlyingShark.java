public class FlyingShark extends Shark implements Flyable {
    @Override
    public void fly() {
        System.out.println("FlyingShark is gliding through the air! (I know it's impossible but who cares!)");
    }

    @Override
    public void glide() {
        System.out.println("FlyingShark is gliding like a bird!");
    }

    // Overloaded eat() — static polymorphism
    public void eat(Flyable creature) {
        System.out.println(this + " caught a flying creature!");
    }

    @Override
    public String toString() {
        return "FlyingShark";
    }
}
