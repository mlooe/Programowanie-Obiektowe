package Zad4;

public class TemperatureSensor implements Sensor{
    @Override
    public double readValue() {
        return 5.2;
    }

    @Override
    public String getStatus() {
        return "Aktywny";
    }

    @Override
    public void reset() {

    }
}
