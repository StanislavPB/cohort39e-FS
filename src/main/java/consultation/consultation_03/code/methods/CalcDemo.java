package consultation.consultation_03.code.methods;

public class CalcDemo {
    public static void main(String[] args) {

        Calc calc = new Calc();

        Integer x = 10;
        Integer y = 5;

        calc.multiplication(x,y);

        double xDouble = 15.5;
        double yDouble = 25.5;

        calc.multiplication(xDouble,yDouble);
    }
}
