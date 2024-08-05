package lesson_01.code.taskApp.back.repository;

import lesson_01.code.taskApp.back.entity.Task;

import java.util.List;
import java.util.Optional;

public interface InMemoryRepository {

    Task add(Task task);

    Optional<Task> findById(Integer id);

    List<Task> findAll();

    List<Task> findByName(String name);

    Optional<Task> updateTask(Integer id, String newDescription);


}
