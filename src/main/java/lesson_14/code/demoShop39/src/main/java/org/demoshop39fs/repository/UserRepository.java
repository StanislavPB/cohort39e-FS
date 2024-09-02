package lesson_14.code.demoShop39.src.main.java.org.demoshop39fs.repository;

import org.demoshop39fs.entity.ConfirmationCode;
import org.demoshop39fs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    Optional<User> findFirstByConfirmationCode(ConfirmationCode code);

    List<User> findByFirstName(String firstName);

    List<User> findByLastNameAndFirstName(String lastName, String firstName);
}
