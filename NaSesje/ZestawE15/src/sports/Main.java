package sports;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<>();

        athletes.add(new Athlete("Athlete 4", "Sport 4", 2024));
        athletes.add(new Athlete("Athlete 3", "Sport 3", 2020));
        athletes.add(new Athlete("Yuji Nishida", "Volleyball", 2018));
        athletes.add(new Athlete("Usain Bolt", "Running", 2009));



        System.out.println("Przed sortowaniem: ");
        for(Athlete athlete : athletes){
            System.out.println(athlete);
        }

        Collections.sort(athletes);

        System.out.println("\nPo posortowaniu: ");
        for(Athlete athlete : athletes){
            System.out.println(athlete);
        }
    }
}
