package com.bjtaga.apirest.repository;

import com.bjtaga.apirest.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users,Integer> {

}
