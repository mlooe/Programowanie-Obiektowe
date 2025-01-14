package zad18;

public class TemperatureSensor implements Sensor {
    @Override
    public double readValue() {
        return 25.0;
    }

    @Override
    public String getStatus() {
        return "Status: active, working";
    }

    @Override
    public void reset() {
        System.out.println("Resetting temperature sensor...");
    }
}
