package lesson_01.code.taskApp;

import lesson_01.code.taskApp.back.repository.InMemoryRepository;
import lesson_01.code.taskApp.back.repository.TaskRepository;
import lesson_01.code.taskApp.back.service.AddTaskService;
import lesson_01.code.taskApp.back.service.FindTaskService;
import lesson_01.code.taskApp.back.service.validation.ValidationService;
import lesson_01.code.taskApp.back.service.validation.validationRules.*;
import lesson_01.code.taskApp.front.ui.TaskAppUI;

import java.util.ArrayList;
import java.util.List;

public class TaskApp {
    public static void main(String[] args) {


        List<ValidationRule> validationRules = new ArrayList<>();
        validationRules.add(new TaskNameNullValidation());
        validationRules.add(new TaskDescriptionNullValidation());
        validationRules.add(new TaskNameMinLengthValidation());
        validationRules.add(new TaskNameMaxLengthValidation());

        InMemoryRepository repository = new TaskRepository();

        ValidationService validationService = new ValidationService(validationRules);

        AddTaskService addTaskService = new AddTaskService(repository, validationService);
        FindTaskService findTaskService = new FindTaskService(repository);

        TaskAppUI taskAppUI = new TaskAppUI(addTaskService, findTaskService);
        taskAppUI.run();

    }
}
