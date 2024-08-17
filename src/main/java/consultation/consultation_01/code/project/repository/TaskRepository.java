package code.project.repository;

import code.project.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Task add(Task task);

    List<Task> findAll();

    Optional<Task> findById(Integer id);

    Optional<Task> findByTaskName(String name);


}
