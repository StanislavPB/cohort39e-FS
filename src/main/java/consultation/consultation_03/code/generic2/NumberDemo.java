package consultation.consultation_03.code.generic2;

public class NumberDemo {
    public static void main(String[] args) {

        OnlyNumber<Integer> integerOnlyNumber = new OnlyNumber<>(10);

        OnlyNumber<Double> doubleOnlyNumber = new OnlyNumber<>(10.5);


        //OnlyNumber<String> stringOnlyNumber = new OnlyNumber<>("число");

    }
}
