package in.projectjwt.main.repositories;

import org.springframework.stereotype.Repository;

import in.projectjwt.main.entities.User;

import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	Optional<User> findByEmail(String email);
	

}
