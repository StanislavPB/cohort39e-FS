package code.project.dto;

import java.time.LocalDateTime;

public class TaskCreateRequestDto {

    private String taskName;
    private String description;
    private LocalDateTime deadLine;

    public TaskCreateRequestDto(String taskName, String description, LocalDateTime deadLine) {
        this.taskName = taskName;
        this.description = description;
        this.deadLine = deadLine;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }
}
