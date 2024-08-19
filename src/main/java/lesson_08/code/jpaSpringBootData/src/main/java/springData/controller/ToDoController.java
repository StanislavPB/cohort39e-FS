package springData.controller;

import org.springframework.web.bind.annotation.*;
import springData.dto.AddToDoRequest;
import springData.entity.ToDoEntity;
import springData.service.AddToDoService;
import springData.service.FindTodoService;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {

    private final AddToDoService addToDoService;
    private final FindTodoService findTodoService;

    public ToDoController(AddToDoService addToDoService, FindTodoService findTodoService) {
        this.addToDoService = addToDoService;
        this.findTodoService = findTodoService;
    }

    @PostMapping
    public ToDoEntity add(@RequestBody AddToDoRequest request){
        return addToDoService.add(request);
    }

    @GetMapping
    public List<ToDoEntity> findAll(){
        return findTodoService.findAll();
    }

    @GetMapping("/name")
    public List<ToDoEntity> findByName(@RequestParam String name){
        return findTodoService.findByName(name);
    }

    @GetMapping("/{id}")
    public ToDoEntity findById(@PathVariable Integer id){
        return findTodoService.findById(id);
    }


}
