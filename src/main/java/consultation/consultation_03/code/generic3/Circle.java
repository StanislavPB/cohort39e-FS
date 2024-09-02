package consultation.consultation_03.code.generic3;

public class Circle <N extends Number> implements Figure{

    private N radius;

    public Circle(N radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius.doubleValue() * radius.doubleValue();
    }
}
