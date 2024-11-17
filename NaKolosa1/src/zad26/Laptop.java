package zad26;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop extends Computer{
    double weight;

    public Laptop(String manufacturer, String model, ArrayList<Double> partsPrices, double weight) {
        super(manufacturer, model, partsPrices);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", Laptop weight: " + weight + "kg.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(weight, laptop.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }
}
