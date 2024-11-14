package zad5;

public class Car {
    String brand;
    String model;
    int productionYear;

    public Car(String brand, String model, int productionYear){
        if(productionYear > 2024){
            this.productionYear = 2024;
        }
        else{
            this.productionYear = productionYear;
        }

        if(brand == null || brand.isEmpty()){
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
}
