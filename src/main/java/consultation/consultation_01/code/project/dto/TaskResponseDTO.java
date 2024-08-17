package code.project.dto;


import code.project.entity.TaskStatus;
import java.time.LocalDateTime;

public class TaskResponseDTO {
    private Integer id;
    private String taskName;
    private String description;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdate;
    private LocalDateTime deadline;
    private TaskStatus status;

    public TaskResponseDTO(Integer id, String taskName, String description, LocalDateTime createDate, LocalDateTime lastUpdate, LocalDateTime deadline, TaskStatus status) {
        this.id = id;
        this.taskName = taskName;
        this.description = description;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.deadline = deadline;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public TaskStatus getStatus() {
        return status;
    }
}
