package consultation_02.code.collections.mapKeyCollision;

import java.util.HashMap;
import java.util.Map;

public class ChangeKeyMapExample {
    public static void main(String[] args) {

        Map<PersonCat, Cat> personCatMap = new HashMap<>();


        personCatMap.put(new PersonCat("Petya"),new Cat("Barsik"));

        System.out.println(personCatMap);

        PersonCat person = new PersonCat("Vasja");
        Cat cat = new Cat("Murzik");

        System.out.println("Person 'Vasja' hashCode() = " + person.hashCode());

        personCatMap.put(person, cat);

        System.out.println(personCatMap);

        System.out.println("========= Изменим имя у person =========");

        person.setName("Ruslan");


        System.out.println(personCatMap);


        System.out.println("====== попробуем получить данные о Cat на основе ключа ====");

        Cat catFromCollection = personCatMap.get(person);

        System.out.println(person);
        System.out.println(catFromCollection);

        System.out.println("Person Ruslan (old 'Vasja') hashCode() = " + person.hashCode());

        System.out.println("======= попытаемся получить доступ к коту создав 'новый экземпляр' ключа ");

        PersonCat newVasja = new PersonCat("Vasja");

        System.out.println("New Vasja hashcode() = " + newVasja.hashCode());

        catFromCollection = personCatMap.get(newVasja);

        System.out.println(catFromCollection);

        System.out.println("======== ВЕРНУТЬ ОБРАТНО ИМЯ  ========");

        person.setName("Vasja");
        catFromCollection = personCatMap.get(newVasja);

        System.out.println(catFromCollection);


    }
}
