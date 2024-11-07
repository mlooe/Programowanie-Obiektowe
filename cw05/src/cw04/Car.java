package cw04;

public record Car(String brand, String model, int fuelConsumptionPer100km){

    public double fuelCost(double fuelPrice, double distance){
        double temp = 0;
        temp = (fuelConsumptionPer100km * distance) / 100;
        return temp * fuelPrice;
    }
}
