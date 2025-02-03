package sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o2.getNationality().compareTo(o1.getNationality()) == 0){
            return o2.getName().compareTo(o1.getName());
        }
        return o2.getNationality().compareTo(o1.getNationality());
    }
}
