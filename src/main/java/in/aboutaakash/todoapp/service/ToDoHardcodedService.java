package in.aboutaakash.todoapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import in.aboutaakash.todoapp.model.ToDo;

@Service
public class ToDoHardcodedService {
	
	public static List<ToDo> todos = new ArrayList<>();
	public static int idCounter = 0;
	
	static {
		todos.add(new ToDo(++idCounter, "aakashverma", "Learn to Code in Python", new Date(), false));
		todos.add(new ToDo(++idCounter, "architgarg", "Learn to Code in Java", new Date(), false));
		todos.add(new ToDo(++idCounter, "aakashverma", "Learn to Code in Python", new Date(), false));
		todos.add(new ToDo(++idCounter, "aakashverma", "Learn to Code in React", new Date(), false));
	}
	
	public List<ToDo> findAll() {
		return todos; 
	}

	public ToDo save(ToDo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}
		else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public ToDo deleteById(long id) {
		ToDo todo = findById(id);
		if(todo == null) return null;
		if(todos.remove(todo))
			return todo;
		return null; 
	}

	public ToDo findById(long id) {
		for (ToDo toDo : todos) {
			if(toDo.getId() == id) {
				return toDo;
			}
		}
		return null;
	}

}
