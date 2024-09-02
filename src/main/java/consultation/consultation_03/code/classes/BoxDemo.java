package consultation.consultation_03.code.classes;

public class BoxDemo {
    public static void main(String[] args) {

//        BoxForPaper boxForPaper = new BoxForPaper();
//        BoxForPlastic boxForPlastic = new BoxForPlastic();
//

        Box<Paper> paperBox = new Box<>();
        Box<Plastic> plasticBox = new Box<>();
        Box<Glass> glassBox = new Box<>();


        BoxTwoCell<Paper,Plastic> paperPlasticBoxTwoCell = new BoxTwoCell<>();



    }
}
