package springData.service;

import org.springframework.stereotype.Service;
import springData.entity.ToDoEntity;
import springData.repository.ToDoRepository;
import springData.repository.ToDoRepositoryInMemory;

import java.util.List;
import java.util.Optional;

@Service
public class FindTodoService {

    private final ToDoRepository repository;

    public FindTodoService(ToDoRepository repository) {
        this.repository = repository;
    }

    public List<ToDoEntity> findAll(){
        return repository.findAll();
    }

    public List<ToDoEntity> findByName(String name){
        return repository.findByName(name);
    }


    public ToDoEntity findById(Integer id){

        Optional<ToDoEntity> optionalToDoEntity = repository.findById(id);

        if (optionalToDoEntity.isPresent()){
            return optionalToDoEntity.get();
        } else {
            throw new IllegalStateException("Entity with ID = " + id + " not found");
        }
    }
}
