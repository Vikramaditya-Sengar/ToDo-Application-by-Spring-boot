package com.todo.ToDo_Application;

import org.springframework.data.repository.CrudRepository;
import com.todo.ToDo_Application.ToDo;

public interface ToDoRepo extends CrudRepository<ToDo, Integer> {

}
