## 1. Дан класс Simple


public class Simple {
private String str;

    public Simple() {
        this.str = "Java Reflection API";
    }

    public void method1() {
        System.out.println("Information from variable: " + str);
    }

    public void method2(int x) {
        System.out.println("целое число: " + x);
    }

    private void method3() {
        System.out.println("вызов приватного метода");
    }
}


Выполните следующие действия:
/*
1) создать новый объект
2) получить имя конструктора
3) получить список публичных методов класса
4) создать объект из метода2 и запустить его
5) создать объект из поля str и заменить его на "группа ___"
6) создать объекты из метода1 и метода3 и запустить их
   */
