package lesson_01.code.taskApp.back.service.validation.validationRules;

import lesson_01.code.taskApp.back.dto.RequestDto;
import lesson_01.code.taskApp.back.service.validation.ValidationException;

public class TaskNameNullValidation implements ValidationRule{
    @Override
    public void validate(RequestDto request) {
        if (request.getTaskName() == null) {
            throw new ValidationException("Task name must be not null");
        }
    }
}
