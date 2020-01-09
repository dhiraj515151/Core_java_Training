package com.example_ToDo;
import java.util.List;

public interface ToDoDao {
void createToDo(String name);
List<ToDo> getAllToDo();
ToDo findById(String todoid);
void removeById(String todoid);
void removeAll();
ToDo updateById(String todoid, String updatetask);
}