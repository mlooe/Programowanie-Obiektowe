package zad5;

import java.util.Objects;

public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction){
        this.yearOfProduction = Math.min(yearOfProduction, 2024);

        if(brand == null || brand.equals("")){
            this.brand = "---";
        }
        else this.brand = brand;

        if(model == null || model.equals("")){
            this.model = "---";
        }
        else this.model = model;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + " " + ", Model: " + model + ", Year of production: " + yearOfProduction + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfProduction == vehicle.yearOfProduction && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }
}

