package com.opentext;
/*
 * @Controller is used when you have view within the project
 * @RestController is used when you want view to be independent & share the data
 * to other applications
 */

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
	
	
	// injecting the dynamic object of UserDao
	@Autowired
	private UserDao userDao;
	
	
	@GetMapping(path = "/users")
	public ResponseEntity<Object> getUsers() {
		List<Users> list = userDao.findAll();
		return ResponseEntity.status(200).body(list);
	}
	
	// to save the data request must send JSON data in a format that matches to Users class
	// Users class has userId, name, phone, email {"name":"..", "phone":939933, "email":"a@g"}
	@PostMapping(path = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveUser(@RequestBody Users users) {
		Users entity =  userDao.save(users);
		return ResponseEntity.status(201).body(entity);
	}
	
	
	@Value("${server.port}") // read the server.port 
	private String port;
	
	// you can have request mapping to the methods here 
	// JSON: {"id":100, "name":"Kishor", "phone":939933}
	// api/v1/welcome/100/Kishor?emailId=k@g
	// api/v1/welcome/200/Vishnu
	@GetMapping(path = "/welcome/{id}/{name}") // HTTP - GET : URL: http://ip:port/api/v1/welcome
	public ResponseEntity<Object> greet(@PathVariable int id, 
			@PathVariable("name") String username, 
			 @Nullable @RequestParam("emailId") String email) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", "Hello REST");
		map.put("date", LocalDate.now());
		map.put("port", port);
		map.put("id", id);
		map.put("name", username);
		map.put("email", email);
		return ResponseEntity.status(200).body(map);
	}
	
	
}
