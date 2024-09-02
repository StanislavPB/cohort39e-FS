package consultation.consultation_03.code.generic3;

public class FigureDemo {
    public static void main(String[] args) {

        // Rectangle Integer

        Rectangle<Integer> rInt = new Rectangle<>(10,30);
        System.out.println("Площадь прямоугольника (Integer) = " + rInt.area());

        // Rectangle Double

        Rectangle<Double> rDouble = new Rectangle<>(10.5,30.2);
        System.out.println("Площадь прямоугольника (DDouble) = " + rDouble.area());


        // Circle Integer

        Circle<Integer> circleInt = new Circle<>(10);
        System.out.println("Площадь круга (Integer) = " + circleInt.area());


    }
}
