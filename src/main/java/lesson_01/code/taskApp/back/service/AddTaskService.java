package lesson_01.code.taskApp.back.service;

import lesson_01.code.taskApp.back.dto.RequestDto;
import lesson_01.code.taskApp.back.dto.ResponseDto;
import lesson_01.code.taskApp.back.entity.Task;
import lesson_01.code.taskApp.back.repository.InMemoryRepository;
import lesson_01.code.taskApp.back.service.validation.ValidationService;
import lesson_01.code.taskApp.back.service.validation.validationRules.CoreError;

import java.util.List;

public class AddTaskService {

    private final InMemoryRepository repository;
    private final ValidationService validationService;

    public AddTaskService(InMemoryRepository repository, ValidationService validationService) {
        this.repository = repository;
        this.validationService = validationService;
    }

    public ResponseDto<Task> addNewTask(RequestDto request){
        System.out.println("Receive request: " + request);
        // валидация данных
        List<CoreError> errors = validationService.validation(request);
        Task savedTask = null;

        if (errors.isEmpty()) {
            Task taskForSave = new Task(0, request.getTaskName(), request.getTaskDescription());
            savedTask = repository.add(taskForSave);
        }

        return new ResponseDto<>(savedTask, errors);
    }
}
