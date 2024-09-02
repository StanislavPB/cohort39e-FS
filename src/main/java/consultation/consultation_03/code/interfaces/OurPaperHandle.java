package consultation.consultation_03.code.interfaces;

import consultation.consultation_03.code.classes.Paper;

public class OurPaperHandle implements GarbageHandler<Paper,MyPaperHandleMethod> {
    @Override
    public void handle(Paper what, MyPaperHandleMethod how) {
        // логика переработки бумажного мусора
    }
}
