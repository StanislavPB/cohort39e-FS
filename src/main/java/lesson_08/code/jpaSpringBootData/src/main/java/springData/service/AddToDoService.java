package springData.service;

import org.springframework.stereotype.Service;
import springData.dto.AddToDoRequest;
import springData.entity.ToDoEntity;
import springData.repository.ToDoRepository;

@Service
public class AddToDoService {
    public final ToDoRepository repository;

    public AddToDoService(ToDoRepository repository) {
        this.repository = repository;
    }

    public ToDoEntity add(AddToDoRequest request){
        System.out.println("Received request: " + request);
        var entityForAdd = convert(request);
        var savedEntity = repository.save(entityForAdd);
        System.out.println("Sending response: " + savedEntity);
        return savedEntity;
    }

    private ToDoEntity convert(AddToDoRequest request){
        ToDoEntity entity = new ToDoEntity();
        entity.setName(request.getName());
        entity.setDescription(request.getDescription());
        return entity;
    }
}
