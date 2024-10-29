package spacecoding.enumtype;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight[] lights = TrafficLight.values();
        for (TrafficLight light : lights) {
            System.out.println("Light : " + light.name()
                    + " Action : " + light.getAction());
        }
    }
}
