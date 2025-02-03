package sports;

public record Athlete(String name, String sport, int yearOfAchievement) implements Comparable<Athlete> {

    @Override
    public int compareTo(Athlete o) {
        return Integer.compare(this.yearOfAchievement, o.yearOfAchievement);
    }
}
