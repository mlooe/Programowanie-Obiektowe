package zad6;

import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction){
        if(yearOfProduction > 2024){
            this.yearOfProduction = 2024;
        }
        else{
            this.yearOfProduction = yearOfProduction;
        }

        if(brand == null || brand.equals("")){
            this.brand = "";
        }
        else{
            this.brand = brand;
        }

        if(model == null || model.equals("")){
            this.model = "";
        }
        else{
            this.model = model;
        }
    }

    @Override
    public String toString() {
        return "Vehicle: " + "Brand -" + brand + ", Model -" + model + ", Year -" + yearOfProduction + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return yearOfProduction == vehicle.yearOfProduction && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }
}
