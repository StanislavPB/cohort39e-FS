package org.springdemoxmlconfig.v2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeansV2.xml");

        System.out.println("Создан контекст ...");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.workingMethod();

        context.close();

       // HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");

    }
}
