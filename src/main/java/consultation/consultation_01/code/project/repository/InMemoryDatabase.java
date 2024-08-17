package code.project.repository;

import code.project.entity.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryDatabase implements TaskRepository{

    private List<Task> database;

    public InMemoryDatabase() {
        this.database = new ArrayList<>();
    }

    @Override
    public Task add(Task task) {
        return null;
    }

    @Override
    public List<Task> findAll() {
        return List.of();
    }

    @Override
    public Optional<Task> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Task> findByTaskName(String name) {
        return Optional.empty();
    }
}
