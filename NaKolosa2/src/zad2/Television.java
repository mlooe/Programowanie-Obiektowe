package zad2;

public class Television extends ElectronicDevice {
    public Television(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Telewizor: " + model + " " + productionYear + " został włączony!");
    }

    @Override
    public void turnOff() {
        System.out.println("Telewizor: " + model + " " + productionYear + " został wyłączony!");
    }
}
