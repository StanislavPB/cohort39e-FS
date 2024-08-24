package consultation_02.code.collections.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ruslan","Admin"));
        users.add(new User("Olga","User"));
        users.add(new User("Roman","Admin"));
        users.add(new User("David","User"));
        users.add(new User("Vera","Moderator"));


        Map<String, List<String>> roleToUser = users.stream()
                .collect(Collectors.groupingBy(
                        User::getRole,
                        Collectors.mapping(User::getName, Collectors.toList())
                ));

        System.out.println(roleToUser);

    }
}
