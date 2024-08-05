package lesson_01.code.optional.example2;

import java.util.Optional;

public class UserApp {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        User foundedUser = repository.findById(1);

        if (foundedUser == null) {
            //....
        }

        Optional<User> userOpt = repository.findByIdOptional(2);

        if (userOpt.isPresent()) {
            User user = userOpt.get();
        }

        if (userOpt.isEmpty()) {
            //...
        }


    }
}
