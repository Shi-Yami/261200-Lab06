public class Insect implements Flyable {
    @Override
    public void fly() {
        System.out.println("Insect is flying");
    }

    @Override
    public void glide() {
        System.out.println("Insect is gliding");
    }

    @Override
    public String toString() {
        return "Insect";
    }
}
