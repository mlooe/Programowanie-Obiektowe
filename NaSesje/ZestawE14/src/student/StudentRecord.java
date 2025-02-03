package student;

public record StudentRecord(String name, String id, double gpa) {
    public StudentRecord{
        if(gpa < 0.0 && gpa > 4.0){
            throw new IllegalArgumentException("gpa must be between 0 and 4.0");
        }
    }

    public boolean isHonorStudent(){
        return gpa >= 3.5;
    }

    public void printDetails(){
        System.out.println("Imie studenta: " + name + ", ID: " + id + ", GPA: " + gpa);
    }
}
