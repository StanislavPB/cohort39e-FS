package lesson_01.code.optional;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {

    private Map<Long, Person> personMap;

    public PersonRepository() {
        this.personMap = new HashMap<>();
    }

    public Person findById(Long id){
        return personMap.get(id);
    }

    public void addPerson(Long id, Person person){
        personMap.put(id,person);
    }

    public void printPersons(){
      for (Map.Entry<Long, Person> entry: personMap.entrySet()) {
          System.out.println(entry);
      }
    }
}
