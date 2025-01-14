package zad18;

public class SensorTest {
    public static void main(String[] args) {
        TemperatureSensor tS = new TemperatureSensor();
        PressureSensor pS = new PressureSensor();

        System.out.println(tS.readValue());
        System.out.println(tS.getStatus());
        tS.reset();

        System.out.println("");
        System.out.println("");

        System.out.println(pS.readValue());
        System.out.println(pS.getStatus());
        pS.reset();
    }
}
