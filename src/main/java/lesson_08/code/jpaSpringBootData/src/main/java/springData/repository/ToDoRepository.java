package springData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import springData.entity.ToDoEntity;

import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, Integer> {

    List<ToDoEntity> findByName(String name);
    List<ToDoEntity> findByDescription(String description);


    default List<ToDoEntity> findToDoWithLongName(int minLength){
        return findAll().stream()
                .filter(toDoEntity -> toDoEntity.getName() != null && toDoEntity.getName().length() > minLength)
                .toList();
    }

    @Query("SELECT t FROM ToDoEntity t WHERE LENGTH(t.name) > 10 AND t.id > :idParam")
    List<ToDoEntity> findToDoWithNameLengthLongerThanAndIdGreaterThan(@Param("idParam") Integer idParam);


}
