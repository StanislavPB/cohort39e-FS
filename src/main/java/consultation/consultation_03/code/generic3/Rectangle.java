package consultation.consultation_03.code.generic3;

public class Rectangle <N extends Number> implements Figure{

    private N sideA;
    private N sideB;

    public Rectangle(N sideA, N sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA.doubleValue() * sideB.doubleValue();
    }
}
