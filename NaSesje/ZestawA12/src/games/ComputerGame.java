package games;

import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = Arrays.copyOf(ratings, ratings.length);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return Arrays.copyOf(ratings, ratings.length);
    }

    public void setRatings(double[] ratings) {
        this.ratings = Arrays.copyOf(ratings, ratings.length);
    }

    public void addRating(double element){
        double[] arr = Arrays.copyOf(ratings, ratings.length+1);
        arr[ratings.length] = element;
        this.ratings = arr;
    }

    public void removeRating(int index){
        if(index < 0 || index > ratings.length){
            throw new IndexOutOfBoundsException("Index out of range");
        }

        double[] arr = Arrays.copyOf(ratings, ratings.length-1);
        int j = 0;

        for(int i = 0; i < ratings.length; i++){
            if(i != index){
                arr[j] = ratings[i];
                j++;
            }
        }
        this.ratings = arr;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + title + ", " + producer + ", " + Arrays.toString(ratings);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComputerGame that = (ComputerGame) o;
        return Objects.equals(title, that.title) && Objects.equals(producer, that.producer) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, producer, Arrays.hashCode(ratings));
    }
}
