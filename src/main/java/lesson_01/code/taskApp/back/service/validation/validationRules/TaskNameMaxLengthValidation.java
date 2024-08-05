package lesson_01.code.taskApp.back.service.validation.validationRules;

import lesson_01.code.taskApp.back.dto.RequestDto;
import lesson_01.code.taskApp.back.service.validation.ValidationException;

public class TaskNameMaxLengthValidation implements ValidationRule{
    @Override
    public void validate(RequestDto request) {
        if (request.getTaskName().length() > 30) {
            throw new ValidationException("Task name length must be less than 30 characters, but actual name length is " + request.getTaskName().length());
        }
    }
}
