package lesson_01.code.taskApp.back.repository;

import lesson_01.code.taskApp.back.entity.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository implements InMemoryRepository{

    private List<Task> database = new ArrayList<>();
    private Integer taskIdCounter = 0;

    @Override
    public Task add(Task task) {
         // вариант 1
//        task.setTaskId(++taskIdCounter);
//        database.add(task);
//        return task;

        // вариант 2
        Task taskForSave = new Task(++taskIdCounter, task.getTaskName(), task.getTaskDescription());
        database.add(taskForSave);
        return taskForSave;

    }

    @Override
    public Optional<Task> findById(Integer id) {
        return  database.stream()
                .filter(task -> task.getTaskId().equals(id))
                .findFirst();
    }

    @Override
    public List<Task> findAll() {
        return database;
    }

    @Override
    public List<Task> findByName(String name) {
//        List<Task> foundedTasksByName = new ArrayList<>();
//        for (Task currentTask : database){
//            if (currentTask.getTaskName().equals(name)) {
//                foundedTasksByName.add(currentTask);
//            }
//        }
//        return foundedTasksByName;

        return database.stream()
                .filter(task -> task.getTaskName().equals(name))
                .toList();

    }

    @Override
    public Optional<Task> updateTask(Integer id, String newDescription) {
        return Optional.empty();
    }
}
