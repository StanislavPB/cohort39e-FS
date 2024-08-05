package lesson_01.code.taskApp.back.dto;

public class RequestDto {

    private String taskName;
    private String taskDescription;

    public RequestDto(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
}
