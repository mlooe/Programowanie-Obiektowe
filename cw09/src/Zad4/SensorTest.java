package Zad4;

public class SensorTest {
    public static void main(String[] args) {
        PressureSensor pressureSensor = new PressureSensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        System.out.println(pressureSensor.getStatus());
        System.out.println(pressureSensor.readValue());
        pressureSensor.reset();

        System.out.println(temperatureSensor.getStatus());
        System.out.println(temperatureSensor.readValue());
        temperatureSensor.reset();
    }
}
