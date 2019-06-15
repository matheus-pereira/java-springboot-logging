package tech.pereira.logging.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import tech.pereira.logging.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

	public Optional<User> findByEmail(String email);
}
