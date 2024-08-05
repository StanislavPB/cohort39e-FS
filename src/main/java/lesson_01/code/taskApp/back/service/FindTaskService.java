package lesson_01.code.taskApp.back.service;

import lesson_01.code.taskApp.back.dto.ResponseDto;
import lesson_01.code.taskApp.back.entity.Task;
import lesson_01.code.taskApp.back.repository.InMemoryRepository;
import lesson_01.code.taskApp.back.service.validation.validationRules.CoreError;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindTaskService {

    private final InMemoryRepository repository;

    public FindTaskService(InMemoryRepository repository) {
        this.repository = repository;
    }

    public ResponseDto<List<Task>> findAll(){
        List<CoreError> errors = new ArrayList<>();
        List<Task> allTask = repository.findAll();

        if (allTask.isEmpty()) {
            errors.add(new CoreError("Task database is empty"));
        }

        return new ResponseDto<>(allTask,errors);
    }

    public ResponseDto<Task> findById(Integer id){
        Optional<Task> foundedTask = repository.findById(id);
        List<CoreError> errors = new ArrayList<>();

        if (foundedTask.isEmpty()){
            errors.add(new CoreError("Task with id = " + id + " not found"));
            return new ResponseDto<>(new Task(),errors);
        }

        return new ResponseDto<>(foundedTask.get(),errors);
    }

    public ResponseDto<List<Task>> findByName(String name) {
        List<CoreError> errors = new ArrayList<>();
        List<Task> allTasks = repository.findAll();
        List<Task> matchingTasks = allTasks.stream()
                .filter(task -> task.getTaskName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

        if (matchingTasks.isEmpty()) {
            errors.add(new CoreError("No tasks found with name = " + name));
        }

        return new ResponseDto<>(matchingTasks, errors);
    }


}
