package consultation_02.code.collections.compareObjects.comparator;

public class Pair {

    private String ourString;
    private Integer ourInteger;

    public Pair(String ourString, Integer ourInteger) {
        this.ourString = ourString;
        this.ourInteger = ourInteger;
    }

    public String getOurString() {
        return ourString;
    }

    public Integer getOurInteger() {
        return ourInteger;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "ourString='" + ourString + '\'' +
                ", ourInteger=" + ourInteger +
                '}';
    }
}
