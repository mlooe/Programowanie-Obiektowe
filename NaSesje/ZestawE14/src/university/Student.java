package university;

public record Student(String name, double averageGrade, int yearOfStudy) implements Comparable<Student> {

    @Override
    public int compareTo(Student o) {
        if(this.averageGrade == o.averageGrade()){
            return Integer.compare(this.yearOfStudy, o.yearOfStudy());
        }

        return Double.compare(o.averageGrade(), this.averageGrade());
    }
}
