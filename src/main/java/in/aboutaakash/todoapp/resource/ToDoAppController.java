package in.aboutaakash.todoapp.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/to-do-app")
@CrossOrigin(origins = "http://localhost:4200")
public class ToDoAppController {

	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}
	
}
