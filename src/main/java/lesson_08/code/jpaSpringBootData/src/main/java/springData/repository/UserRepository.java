package springData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springData.entity.User;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByUsername(String username);
}
