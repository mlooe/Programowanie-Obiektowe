package zad31;

import java.util.Calendar;

public class Car {
    String brand;
    String model;
    int productionYear;

    public Car(String brand, String model, int productionYear) {
        this.productionYear = Math.min(productionYear, Calendar.getInstance().get(Calendar.YEAR));


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
