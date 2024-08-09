package org.springdemoxmlconfig.v2;

public class HelloWorld {

    public void initMethod() {
        System.out.println("Я инит-метод " + this.getClass().getSimpleName());
    }

    public void destroyMethod() {
        System.out.println("Я destroy-метод " + this.getClass().getSimpleName());
    }

    public void workingMethod() {
        System.out.println("Working ... ");
    }

}
