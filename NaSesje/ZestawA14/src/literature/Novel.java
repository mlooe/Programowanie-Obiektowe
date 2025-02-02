package literature;

import java.util.Arrays;
import java.util.Objects;

public class Novel {
    private String title;
    private String author;
    private double[] ratings;

    public Novel(String title, String author, double[] ratings) {
        this.title = title;
        this.author = author;
        this.ratings = Arrays.copyOf(ratings, ratings.length);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double[] getRatings() {
        return Arrays.copyOf(ratings, ratings.length);
    }

    public void setRatings(double[] ratings) {
        this.ratings = Arrays.copyOf(ratings, ratings.length);
    }

    public void addRating(double rating) {
        double[] arr = Arrays.copyOf(ratings, ratings.length + 1);
        arr[arr.length - 1] = rating;
        this.ratings = arr;
    }

    public void removeRating(int index) {
        double[] arr = new double[ratings.length - 1];
        int j = 0;

        for(int i = 0; i < ratings.length; i++) {
            if(i != index) {
                arr[j++] = ratings[i];
            }
        }
        this.ratings = arr;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + title + ", " + author + ", " + Arrays.toString(ratings) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Novel novel = (Novel) o;
        return Objects.equals(title, novel.title) && Objects.equals(author, novel.author) && Objects.deepEquals(ratings, novel.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, Arrays.hashCode(ratings));
    }
}
