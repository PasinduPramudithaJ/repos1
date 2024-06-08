package com.bankapp.html.repo;

import org.springframework.data.repository.CrudRepository;
import com.bankapp.html.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
	

}
