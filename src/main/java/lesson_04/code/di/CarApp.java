package lesson_04.code.di;

import java.util.*;

public class CarApp {
    public static void main(String[] args) {

       EngineGeneral ourEngine = new EngineElectric();
       Body ourBody = new Body();
       Transmission ourTransmission = new Transmission();

       // =================

        Car myCar = new Car(ourBody,ourEngine,ourTransmission);

        myCar.getEngine().start();

        // ===============

        Map<String, Object> context = new HashMap<>();
        context.put("body", ourBody);
        context.put("engineGeneral", ourEngine);
        context.put("transmission", ourTransmission);





    }
}
