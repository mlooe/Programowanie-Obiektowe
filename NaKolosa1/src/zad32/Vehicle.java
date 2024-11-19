package zad32;

import java.util.Calendar;
import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    int yearOfProduction;

    @Override
    public String toString() {
        return "Vehicle: " + brand + " " + model + ", " + " Year: " + yearOfProduction + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfProduction == vehicle.yearOfProduction && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }


    public Vehicle(String brand, String model, int yearOfProduction) {
        this.yearOfProduction = Math.min(yearOfProduction, Calendar.getInstance().get(Calendar.YEAR));

        if(brand == null || brand.isEmpty()){
            this.brand = "----";
        }
        else this.brand = brand;


        if(model == null || model.isEmpty()){
            this.model = "----";
        }
        else this.model = model;
    }



}
