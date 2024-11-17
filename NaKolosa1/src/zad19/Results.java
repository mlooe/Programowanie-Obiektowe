package zad19;

import java.util.Arrays;
import java.util.Objects;

public class Results {
    private String firstName;
    private String lastName;
    private final double[] results;

    public Results(String firstName, String lastName, double[] results) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = results;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void addResult(int index, double result){
        results[index] = result;
    }

    public double averageResults(){
        double temp = 0;

        for(int i=0; i<results.length; i++){
            temp += results[i];
        }
        return temp/results.length;
    }

    @Override
    public String toString() {
        return "Results for " + firstName + " " + lastName + ": " + "Average Score = " + averageResults() + ", Results: " + Arrays.toString(results);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Results results1 = (Results) o;
        return Objects.equals(firstName, results1.firstName) && Objects.equals(lastName, results1.lastName) && Objects.deepEquals(results, results1.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, Arrays.hashCode(results));
    }
}
