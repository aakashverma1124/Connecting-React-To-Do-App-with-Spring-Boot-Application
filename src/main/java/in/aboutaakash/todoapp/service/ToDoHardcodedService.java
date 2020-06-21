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
	}
	
	
	public List<ToDo> findAll() {
		return todos; 
	}

}
