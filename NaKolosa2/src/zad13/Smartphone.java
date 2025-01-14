package zad13;
import java.util.Date;

public class Smartphone implements Cloneable{
    String brand;
    String model;
    Date productionDate;

    public Smartphone(String brand, String model, Date productionDate) {
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public Smartphone clone() {
        try {
            Smartphone clone = (Smartphone) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Smartphone: " + getBrand() + ", " + getModel() + ", Production date: " + getProductionDate();
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "A60", new Date(2020, 9, 2));

        Smartphone smartphoneClone = smartphone.clone();

        smartphone.setProductionDate(new Date(2020, 9, 2));

        System.out.println("-----Oryginał----- "+smartphone);
        System.out.println("-----Klon----- " + smartphoneClone);
    }


}
