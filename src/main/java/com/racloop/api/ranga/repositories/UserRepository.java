package com.racloop.api.ranga.repositories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByRole(String role);
}
