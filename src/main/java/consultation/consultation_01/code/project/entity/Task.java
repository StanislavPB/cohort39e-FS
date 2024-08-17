package code.project.entity;

import java.time.LocalDateTime;

public class Task {

    private Integer id;
    private String taskName;
    private String description;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdate;

    private LocalDateTime deadLine;

    private TaskStatus status;

    public Task(Integer id, String taskName, String description, LocalDateTime createDate, LocalDateTime lastUpdate, LocalDateTime deadLine, TaskStatus status) {
        this.id = id;
        this.taskName = taskName;
        this.description = description;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.deadLine = deadLine;
        this.status = status;
    }

    public Task() {
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

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setDeadLine(LocalDateTime deadLine) {
        this.deadLine = deadLine;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", lastUpdate=" + lastUpdate +
                ", deadLine=" + deadLine +
                ", status=" + status +
                '}';
    }
}
