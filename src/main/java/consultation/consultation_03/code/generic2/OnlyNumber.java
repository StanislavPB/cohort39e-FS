package consultation.consultation_03.code.generic2;

public class OnlyNumber <N extends Number> {

    private N number;

    public OnlyNumber(N number) {
        this.number = number;
    }

    public N getNumber() {
        return number;
    }

    public void setNumber(N number) {
        this.number = number;
    }

    public void printData(){
        System.out.println("Ваше число: " + number);
    }

    public void printSquare() {
        System.out.println(number.doubleValue() * number.doubleValue());
    }

}
