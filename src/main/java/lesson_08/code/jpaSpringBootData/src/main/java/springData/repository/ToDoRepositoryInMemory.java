package springData.repository;

import springData.entity.ToDoEntity;

import java.util.List;

public interface ToDoRepositoryInMemory {

    public ToDoEntity add(ToDoEntity entity);

    public List<ToDoEntity> findToDoByName(String name);

    public List<ToDoEntity> findAll();

}
