package in.aboutaakash.todoapp.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.aboutaakash.todoapp.model.ToDo;
import in.aboutaakash.todoapp.service.ToDoHardcodedService;

@RestController
public class ToDoContoller {
	
	@Autowired
	private ToDoHardcodedService todoService;
	
	@GetMapping(path = "/users/{username}/todos")
	public List<ToDo> getAllToDos(@PathVariable String username) {
		return todoService.findAll();
		 
	}

}
