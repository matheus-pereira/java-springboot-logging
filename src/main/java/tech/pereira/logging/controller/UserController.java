package tech.pereira.logging.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.pereira.logging.domain.User;
import tech.pereira.logging.exception.BusinessException;
import tech.pereira.logging.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping
	public ResponseEntity<User> create(@Valid @RequestBody User newUser) throws BusinessException {
		return new ResponseEntity<>(service.create(newUser), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAll() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
}
