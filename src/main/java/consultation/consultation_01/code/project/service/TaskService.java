package code.project.service;

import code.project.dto.TaskCreateRequestDto;
import code.project.dto.TaskCreateResponseDto;
import code.project.dto.TaskResponseDTO;
import code.project.entity.Task;
import code.project.entity.TaskStatus;
import code.project.repository.TaskRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private TaskRepository repository;

    public List<TaskResponseDTO> findAll(){

        List<Task> allTasks = repository.findAll();

        List<TaskResponseDTO> responseDTOList = new ArrayList<>();

        for (Task task : allTasks){
            TaskResponseDTO responseDTO = new TaskResponseDTO(
                    task.getId(),
                    task.getTaskName(),
                    task.getDescription(),
                    task.getCreateDate(),
                    task.getLastUpdate(),
                    task.getDeadLine(),
                    task.getStatus()
            );
            responseDTOList.add(responseDTO);
        }

        return responseDTOList;
    }


    public TaskResponseDTO findById(Integer id){
        Task task = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task with id = " + id + " not found"));
        return new TaskResponseDTO(
                task.getId(),
                task.getTaskName(),
                task.getDescription(),
                task.getCreateDate(),
                task.getLastUpdate(),
                task.getDeadLine(),
                task.getStatus()
        );
    }

    public TaskCreateResponseDto createTask(TaskCreateRequestDto request){
        Task newTask = new Task();
        newTask.setTaskName(request.getTaskName());
        newTask.setDescription(request.getDescription());
        newTask.setDeadLine(request.getDeadLine());
        newTask.setCreateDate(LocalDateTime.now());
        newTask.setLastUpdate(LocalDateTime.now());
        newTask.setStatus(TaskStatus.OPEN);

        Task savedTask = repository.add(newTask);

        return new TaskCreateResponseDto(
                savedTask.getId(),
                savedTask.getTaskName(),
                savedTask.getDescription(),
                savedTask.getCreateDate(),
                savedTask.getDeadLine(),
                savedTask.getStatus()
        );
    }

}
