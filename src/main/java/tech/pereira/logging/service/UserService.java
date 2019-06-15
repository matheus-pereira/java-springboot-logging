package tech.pereira.logging.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.pereira.logging.domain.User;
import tech.pereira.logging.exception.ExistentUserException;
import tech.pereira.logging.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User create(User newUser) throws ExistentUserException {
		
		Optional<User> existentUser = repository.findByEmail(newUser.getEmail());
		if (existentUser.isPresent()) {
			throw new ExistentUserException();
		}
		
		User user = new User();
		user.setName(newUser.getName());
		user.setEmail(newUser.getEmail());
		user.setPhone(newUser.getPhone());
		
		return repository.save(user);
	}
	
	public List<User> getAll() {
		return repository.findAll();
	}
}
