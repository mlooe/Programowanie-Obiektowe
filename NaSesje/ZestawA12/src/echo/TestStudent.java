package echo;

public class TestStudent {
    public static void main(String[] args) {
         Student s1 = new Student("Michał", 20);
         Student s2 = new Student("Janek", 20);
         Student s3 = new Student("Miłosz", 20);

         echoIfEquivalent(s1, s2, s3);
    }

    public static <T> void echoIfEquivalent(T x, T y, T z){
        if(x.equals(y) && y.equals(z)){
            System.out.println("Wszystkie trzy są równoważne");
        }
    }
}
