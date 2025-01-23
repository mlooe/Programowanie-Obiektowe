package zad2;

import java.util.Comparator;

public class Car{
    String brand;
    int mileage;
    int yearOfProduction;

    public Car(String brand, int mileage, int yearOfProduction) {
        if(mileage < 0 || yearOfProduction < 0){
            throw new IllegalArgumentException("Wartości liczbowe nie mogą być ujemne!");
        }
        else{
            this.brand = brand;
            this.mileage = mileage;
            this.yearOfProduction = yearOfProduction;
        }
    }

    @Override
    public String toString() {
        return "\n Brand: " + brand + ", Mileage: " + mileage + ", Year of Production: " + yearOfProduction;
    }
}

class MyComparator implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o2.mileage, o1.mileage);
    }

}


