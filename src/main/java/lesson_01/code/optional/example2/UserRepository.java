package lesson_01.code.optional.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public User findById(Integer id) {
        for (int i = 0; i < users.size(); i++) {
            if (Objects.equals(users.get(i).getId(), id)) {
                return users.get(i);
            }
        }
        return null;
    }

    public Optional<User> findByIdOptional(Integer id) {
        for (int i = 0; i < users.size(); i++) {
            if (Objects.equals(users.get(i).getId(), id)) {
                return Optional.of(users.get(i));
            }
        }
        return Optional.empty();
    }
}
