package zad18;

public class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 9999999.9;
    }

    @Override
    public String getStatus() {
        return "Status: CRITICAL..#$5%^#";
    }

    @Override
    public void reset() {
        System.out.println("Resetting pressure sensor...");
    }
}
