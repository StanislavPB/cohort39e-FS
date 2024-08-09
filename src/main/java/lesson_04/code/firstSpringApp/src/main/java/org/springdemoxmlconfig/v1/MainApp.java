package org.springdemoxmlconfig.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("BeansV1.xml");

        // ======= далее я могу не создавать самостоятельно экземпляры классов, а использовать те который spring уже создал =====

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        System.out.println(objA.getMessage());


        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        System.out.println(objB.getMessage());

        System.out.println("После замены значения в поле message:");

        objB.setMessage("Новый текст");

        System.out.println(objA.getMessage());
        System.out.println(objB.getMessage());
    }
}
