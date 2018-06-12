package com.nakedhub.shardingjdbc.dao;

import com.nakedhub.shardingjdbc.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long>{
}
