package lesson_01.code.optional;

public class PersonApp {
    public static void main(String[] args) {

        PersonRepository repository = new PersonRepository();

        repository.addPerson(1L, new Person("Ruslan"));
        repository.addPerson(2L, new Person("Sergey"));
        repository.addPerson(3L, new Person(null));
        repository.addPerson(4L, new Person("Vera"));
        repository.addPerson(5L, new Person("Elvira"));

        repository.printPersons();

        System.out.println("========================");

        Person foundedPerson = repository.findById(3L);

        if (foundedPerson != null) {
            System.out.println(foundedPerson.getName().length());
        } else {
            System.out.println("такого объекта не найдено");
        }
    }
}
