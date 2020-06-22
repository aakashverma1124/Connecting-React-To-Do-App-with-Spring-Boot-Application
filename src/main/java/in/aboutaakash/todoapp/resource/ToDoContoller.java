package in.aboutaakash.todoapp.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.aboutaakash.todoapp.model.ToDo;
import in.aboutaakash.todoapp.service.ToDoHardcodedService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ToDoContoller {
	
	@Autowired
	private ToDoHardcodedService todoService;
	
	@GetMapping(path = "/users/{username}/todos")
	public List<ToDo> getAllToDos(@PathVariable String username) {
		return todoService.findAll();
		 
	}
	
	@GetMapping(path = "/users/{username}/todos/{id}")
	public ToDo getTodo(@PathVariable String username, @PathVariable long id) {
		return todoService.findById(id);
	}
	@DeleteMapping(path = "/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable String username, @PathVariable long id) {
		ToDo todo = todoService.deleteById(id);
		if(todo != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build(); 
	}  

}
