package space;

import java.util.ArrayList;
import java.util.Objects;


public class Spacecraft {
    private String name;
    private String manufacturer;
    private ArrayList<Double> ratings;

    public Spacecraft(String name, String manufacturer, ArrayList<Double> ratings) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ArrayList<Double> getRatings() {
        return new ArrayList<>(ratings);
    }

    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = new ArrayList<>(ratings);
    }

    public void addRating(double rating){
        this.ratings.add(rating);
    }

    public void removeRating(double rating){
        this.ratings.remove(rating);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name + ", " + manufacturer + ", " + ratings + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return Objects.equals(name, that.name) && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, ratings);
    }
}
