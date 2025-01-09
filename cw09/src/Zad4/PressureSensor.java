package Zad4;

public class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 20.5;
    }

    @Override
    public String getStatus() {
        return "Wyłączony";
    }

    @Override
    public void reset() {

    }
}
