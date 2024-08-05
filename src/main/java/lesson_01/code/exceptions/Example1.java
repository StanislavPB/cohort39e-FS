package lesson_01.code.exceptions;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");

        int x = scanner.nextInt();

        System.out.println("Please enter second number: ");

        int y = scanner.nextInt();


        try {
            double result = x / y;
            System.out.println("Result = " + result);
        } catch (ArithmeticException exception) {
            System.out.println("арифметическая ошибка");
            System.out.println(exception.getMessage());
        } catch (Exception e){
            System.out.println("Exception !!!");
        }

        System.out.println("приложение завершило свою работу");

    }
}
