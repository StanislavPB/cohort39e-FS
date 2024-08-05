package lesson_01.code.taskApp.back.service.validation.validationRules;

import lesson_01.code.taskApp.back.dto.RequestDto;

public interface ValidationRule {

    void validate(RequestDto request);
}
