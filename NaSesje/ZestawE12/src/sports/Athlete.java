package sports;

import java.util.Arrays;

public class Athlete {
    private String name;
    private String nationality;
    private double[] records;

    public Athlete(String name, String nationality, double[] records) {
        this.name = name;
        this.nationality = nationality;
        this.records = records;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double[] getRecords() {
        return records;
    }

    public void setRecords(double[] records) {
        this.records = records;
    }

    public double maxRecord(){
        double max = records[0];

        for(int i = 1; i < records.length; i++){
            if(records[i] > max){
                max = records[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "\nName: " + name + ", Nationality: " + nationality + ", Records: " + Arrays.toString(records);
    }
}
