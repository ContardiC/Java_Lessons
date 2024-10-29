package spacecoding.lambdaexpression;

public class MainTest {
    public static void main(String[] args) {
        // Anonymous Class

        Animals animal = new Animals() {

            @Override
            public void show(String animal, int speed) {
                System.out.println(" A " + animal + " can reach speeds of " + speed +
                        " km/h.");
            }
        };
        animal.show("Cheetah", 130);

        // Lambda Expression
        Animals animal2 = (a, s) -> {
            System.out.println(" A " + a + " can reach speeds of " + s + " km/h.");
        };

        animal2.show("Cat", 50);
    }
}
