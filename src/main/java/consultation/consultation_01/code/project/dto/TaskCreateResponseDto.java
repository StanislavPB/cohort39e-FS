package code.project.dto;

import code.project.entity.TaskStatus;

import java.time.LocalDateTime;

public class TaskCreateResponseDto {

    private Integer id;
    private String taskName;
    private String description;
    private LocalDateTime createDate;
    private LocalDateTime deadLine;
    private TaskStatus status;


    public TaskCreateResponseDto(Integer id, String taskName, String description, LocalDateTime createDate, LocalDateTime deadLine, TaskStatus status) {
        this.id = id;
        this.taskName = taskName;
        this.description = description;
        this.createDate = createDate;
        this.deadLine = deadLine;
        this.status = status;
    }
}
